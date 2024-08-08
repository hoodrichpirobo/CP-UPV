import java.util.*;
import java.io.*;

public class provincesandgold{
    static BufferedReader in;
    static PrintWriter out;
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        String victoryCard = "", treasureCard;
        int G = Integer.parseInt(tokens.nextToken()),
            S = Integer.parseInt(tokens.nextToken()),
            C = Integer.parseInt(tokens.nextToken()),
            P = G * 3 + S * 2 + C;
        if(P>=8){
            victoryCard = "Province";
            treasureCard = "Gold";
        }else if(P >= 6){
            victoryCard = "Duchy";
            treasureCard = "Gold";
        }else if(P >= 5){
            victoryCard = "Duchy";
            treasureCard = "Silver";
        }else if(P >=3){
            victoryCard = "Estate";
            treasureCard = "Silver";
        }else if(P >=2){
            victoryCard = "Estate";
            treasureCard = "Copper";
        }else{
            treasureCard = "Copper";
        }
        
        if(victoryCard.isEmpty()){
            out.println(treasureCard);
        }else{
            out.println(victoryCard + " or " + treasureCard);
        }
        
        out.close();
    }
}
