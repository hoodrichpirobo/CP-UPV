import java.io.*;

public class Main{
  static BufferedReader in;
  static PrintWriter out;
  static int[] arr1;
  static boolean[] arr2;

  public static void fillArr(int entry, int it){
    arr1[it] = entry;
    arr2[entry] = true;
  }

  public static int findProduct(int end){
    int a, b, c;
    for(int i = 0; i < end; i++){
      a = arr1[i];
      for(int j = i + 1; j < end; j++){
        b = arr1[j];
        if(a + b >= 2020) continue;
        c = 2020 - (a + b);
        if(arr2[b] && arr2[c]) return a * b * c;
      }
    }
    return -1;
  }

  public static void main(String[] args) throws Exception {
    in = new BufferedReader(new FileReader("input.in"));
    out = new PrintWriter(System.out);

    String line;
    arr1 = new int[3000];
    arr2 = new boolean[3000];
    int i = 0;
    while((line = in.readLine()) != null && !line.isEmpty()) {
      fillArr(Integer.parseInt(line), i++);
    }

    out.print(findProduct(i));

    out.close();
  }
}
