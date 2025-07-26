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
    int a, b;
    for(int i = 0; i < end; i++){
      a = arr1[i];
      b = 2020 - a;
      if(arr2[b]) return a * b;
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
