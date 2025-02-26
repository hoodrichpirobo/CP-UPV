import java.io.*;
import java.util.*;

public class karte{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        char[] s = in.readLine().toCharArray();
        Set<String> P = new HashSet<>();
        Set<String> K = new HashSet<>();
        Set<String> H = new HashSet<>();
        Set<String> T = new HashSet<>();

        boolean duplicate = false;
        for(int i = 0; i < s.length && !duplicate; i += 3){
            String card = "" + s[i] + s[i + 1] + s[i + 2];
            switch(s[i]){
                case 'P':
                    if(P.contains(card)) duplicate = true;
                    P.add(card);
                    break;
                case 'K':
                    if(K.contains(card)) duplicate = true;
                    K.add(card);
                    break;
                case 'H':
                    if(H.contains(card)) duplicate = true;
                    H.add(card);
                    break;
                case 'T':
                    if(T.contains(card)) duplicate = true;
                    T.add(card);
                    break;
            }
        }

        if(duplicate){
            out.println("GRESKA");
        }else{
            out.println((13 - P.size()) + " " + (13 - K.size()) + " " + (13 - H.size()) + " " + (13 - T.size()));
        }

        out.close();
    }
}
