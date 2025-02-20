import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    public static String solve() throws Exception {
        int n = Integer.parseInt(in.readLine());
        String[] deck = {"2 of Clubs", "3 of Clubs", "4 of Clubs", "5 of Clubs", 
                "6 of Clubs", "7 of Clubs", "8 of Clubs", "9 of Clubs", "10 of Clubs", 
                "Jack of Clubs", "Queen of Clubs", "King of Clubs", "Ace of Clubs",
                "2 of Diamonds", "3 of Diamonds", "4 of Diamonds", "5 of Diamonds", 
                "6 of Diamonds", "7 of Diamonds", "8 of Diamonds", "9 of Diamonds", "10 of Diamonds", 
                "Jack of Diamonds", "Queen of Diamonds", "King of Diamonds", "Ace of Diamonds",
                "2 of Hearts", "3 of Hearts", "4 of Hearts", "5 of Hearts", 
                "6 of Hearts", "7 of Hearts", "8 of Hearts", "9 of Hearts", "10 of Hearts", 
                "Jack of Hearts", "Queen of Hearts", "King of Hearts", "Ace of Hearts",
                 "2 of Spades", "3 of Spades", "4 of Spades", "5 of Spades", 
                "6 of Spades", "7 of Spades", "8 of Spades", "9 of Spades", "10 of Spades", 
                "Jack of Spades", "Queen of Spades", "King of Spades", "Ace of Spades"};

        
        StringTokenizer tokens;
        List<int[]> l = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int[] arr = new int[52];
            tokens = new StringTokenizer(in.readLine());
            for(int j = 0; j < 52; j++){
                if(!tokens.hasMoreTokens()) tokens = new StringTokenizer(in.readLine());
                arr[j] = Integer.parseInt(tokens.nextToken()) - 1;
            }
            l.add(arr);
        }

        String line;
        while((line = in.readLine()) != null && !line.isEmpty()){
            int i = Integer.parseInt(line) - 1;
            int[] arr = l.get(i);
            String[] newDeck = new String[52];
            for(int j = 0; j < 52; j++){
                newDeck[j] = deck[arr[j]];
            }

            deck = newDeck;
        }

        StringBuilder ans = new StringBuilder();
        for(String each : deck){
            ans.append(each).append('\n');
        }

        return ans.toString();
    }

    public static void main(String[] args) throws Exception {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int TC = Integer.parseInt(in.readLine());
        StringBuilder ans = new StringBuilder();
        in.readLine();
        for(int i = 0; i < TC; i++){
            if(i > 0) ans.append('\n');
            ans.append(solve());
        }
        out.print(ans);

        out.close();
    }
}
