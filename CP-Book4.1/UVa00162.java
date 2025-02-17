import java.io.*;
import java.util.*;

public class Main{
    static final int DEALER = 1;
    static final int PLAYER = 2;

    public static int getVal(char val) {
        if (val == 'J')
            return 1;
        if (val == 'Q')
            return 2;
        if (val == 'K')
            return 3;
        if (val == 'A')
            return 4;
        return 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        while(true){
            StringTokenizer tokens = new StringTokenizer(in.readLine());
            String card = tokens.nextToken();

            if(card.equals("#")) break;

            Deque<Integer> player = new ArrayDeque<>();
            Deque<Integer> dealer = new ArrayDeque<>();

            player.addFirst(getVal(card.charAt(1)));
            card = tokens.nextToken();
            dealer.addFirst(getVal(card.charAt(1)));

            for(int i = 0; i < 25; i++){
                if(!tokens.hasMoreTokens()) tokens = new StringTokenizer(in.readLine());
                card = tokens.nextToken();
                player.addFirst(getVal(card.charAt(1)));
                if(!tokens.hasMoreTokens()) tokens = new StringTokenizer(in.readLine());
                card = tokens.nextToken();
                dealer.addFirst(getVal(card.charAt(1)));
            }

            Deque<Integer> pile = new ArrayDeque<>();
            int turn = PLAYER, winner = 0, playCard = 0;
            boolean gameWon = false;

            while(!gameWon){
                playCard = 0;

                if(pile.isEmpty() || pile.peekFirst() == 0){
                    if(turn == DEALER){
                        if(dealer.isEmpty())
                            gameWon = true;
                        else
                            playCard = dealer.pollFirst();
                    } else {
                        if(player.isEmpty())
                            gameWon = true;
                        else
                            playCard = player.pollFirst();
                    }
                    pile.addFirst(playCard);
                    if(playCard != 0)
                        winner = turn;
                } else {
                    int penalty = pile.peekFirst();
                    if (turn == DEALER){
                        for(int i = 0; i < penalty; i++){
                            if(dealer.isEmpty()){
                                gameWon = true;
                                break;
                            } else {
                                playCard = dealer.pollFirst();
                                pile.addFirst(playCard);
                                if (playCard != 0){
                                    winner = turn;
                                    break;
                                }
                            }
                        }

                        if(winner != turn && !gameWon){
                            while(!pile.isEmpty()){
                                player.addLast(pile.pollLast());
                            }
                        }
                    } else {
                        for(int i = 0; i < penalty; i++){
                            if(player.isEmpty()){
                                gameWon = true;
                                break;
                            } else {
                                playCard = player.pollFirst();
                                pile.addFirst(playCard);
                                if(playCard != 0){
                                    winner = turn;
                                    break;
                                }
                            }
                        }

                        if(winner != turn && !gameWon){
                            while(!pile.isEmpty()){
                                dealer.addLast(pile.pollLast());
                            }
                        }
                    }
                    winner = 0;
                }
                turn = (turn == PLAYER ? DEALER : PLAYER);
            }
            out.printf("%d%3d\n", turn, dealer.size() + player.size());
        }

        out.close();
    }
}
