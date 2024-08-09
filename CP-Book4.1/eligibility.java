import java.util.*;
import java.io.*;

public class eligibility{
    static BufferedReader in;
    static PrintWriter out;
    
    static String solve() throws Exception{
        StringTokenizer tokens = new StringTokenizer(in.readLine());
        
        String name = tokens.nextToken();
        String[] studies = tokens.nextToken().split("/");
        String[] birth = tokens.nextToken().split("/");
        int courses = Integer.parseInt(tokens.nextToken());
        
        if((Integer.parseInt(studies[0]) >= 2010) 
                || (Integer.parseInt(birth[0]) >= 1991)){
            return name + " eligible";
        }else if(courses < 41){
            return name + " coach petitions";
        }else{
            return name + " ineligible";
        }
    }
    
    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        
        int TC = Integer.parseInt(in.readLine());
        while(TC-->0){
            out.println(solve());
        }
        
        out.close();
    }
}
