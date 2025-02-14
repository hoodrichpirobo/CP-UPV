import java.io.*;
import java.util.*;

public class Main{
    public static boolean contains(char[] arr1, char[] arr2){
        if(arr2.length > arr1.length) return false;
        int j = 0;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == arr2[j]) j++;
            if(j == arr2.length) return true;
        }

        return false;
    }

    public static boolean both(Map<Character, Integer> map1, Map<Character, Integer> map2){
        for(Character each : map2.keySet()){
            if(!map1.containsKey(each)) return false;
            if(map1.get(each) < map2.get(each)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s = in.readLine(),
               t = in.readLine(),
               ans = "";
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        if(contains(arr1, arr2)){
            ans = "automaton";
        }else{

            Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();
            for(int i = 0; i < arr1.length; i++){
                map1.put(arr1[i], map1.getOrDefault(arr1[i], 0) + 1);
            }
            for(int i = 0; i < arr2.length; i++){
                map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) + 1);
            }

            boolean isAnagram = false;
            if(s.length() == t.length()){
                isAnagram = true;
                for(char c : map1.keySet()){
                    if(!map1.get(c).equals(map2.get(c))){
                        isAnagram = false;
                        break;
                    }
                }
            }

            if(isAnagram) ans = "array";
            else if(both(map1, map2)) ans = "both";
            else ans = "need tree";
        }
        out.println(ans);

        out.close();
    }
}
