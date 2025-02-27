import java.io.*;
import java.util.*;

public class Main{
    public static class Pair{
        long x, y;

        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static Pair[] mergeSort(Pair[] arr){
        if(arr.length <= 1) return arr;

        int mid = arr.length/2;
        Pair[] left = Arrays.copyOfRange(arr, 0, mid);            // ari losiento
        Pair[] right = Arrays.copyOfRange(arr, mid, arr.length);  // no se utilizar el otro metodo que me recomendaste

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static Pair[] merge(Pair[] left, Pair[] right){
        Pair[] result = new Pair[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if(left[i].x < right[j].x){
                result[k++] = left[i++];
            }else{
                result[k++] = right[j++];
            }
        }

        while(i < left.length){
            result[k++] = left[i++];
        }

        while(j < right.length){
            result[k++] = right[j++];
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokens = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokens.nextToken()),
            d = Integer.parseInt(tokens.nextToken());

        Pair[] arr = new Pair[n];
        for(int i = 0; i < n; i++){
            tokens = new StringTokenizer(in.readLine());
            arr[i] = new Pair(Integer.parseInt(tokens.nextToken()), Integer.parseInt(tokens.nextToken()));
        }

        arr = mergeSort(arr);

        int j = 0;
        long currentSum = 0, maxSum = 0;
        for(int i = 0; i < n; i++){
            while((arr[i].x - arr[j].x) >= d){
                currentSum -= arr[j].y;
                j++;
            }

            currentSum += arr[i].y;
            maxSum = Math.max(maxSum, currentSum);
        }
        out.println(maxSum);

        out.close();
    }
}
