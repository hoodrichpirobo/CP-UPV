import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {
  static BufferedReader in;
  static PrintWriter out;
  static Pattern TOKEN = Pattern.compile("(?=(one|two|three|four|five|six|seven|eight|nine|\\d))");
  static Map<String, Integer> m;
  static {
    m = new HashMap<>();
    m.put("one",   1);
    m.put("two",   2);
    m.put("three", 3);
    m.put("four",  4);
    m.put("five",  5);
    m.put("six",   6);
    m.put("seven", 7);
    m.put("eight", 8);
    m.put("nine",  9);
  }

  public static int sum(char[] arr) {
    String s = new String(arr);
    Matcher match = TOKEN.matcher(s);
    List<String> tokens = new ArrayList<>();

    while(match.find()){
      tokens.add(match.group(1));
    }

    int first = parseToken(tokens.get(0)),
        last  = parseToken(tokens.get(tokens.size() - 1));

    return first * 10 + last;
  }

  public static int parseToken(String token){
    if(token.length() == 1 && Character.isDigit(token.charAt(0))){
      return token.charAt(0) - '0';
    }

    return m.get(token);
  }

  public static void main(String[] args) throws Exception {
    in = new BufferedReader(new FileReader("input.in"));
    out = new PrintWriter(System.out);

    String line;
    int ans = 0;
    while((line = in.readLine()) != null && !line.isEmpty()){
      ans += sum(line.toCharArray());
    }
    out.print(ans);

    out.close();
  }
}
