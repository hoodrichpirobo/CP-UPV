import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n;
        StringTokenizer tokens;
        int[] d, m, y, c;
        int count, diff, value;
        StringBuilder ans = new StringBuilder();
        while((n = Integer.parseInt(in.readLine())) != 0){
            d = new int[n];
            m = new int[n];
            y = new int[n];
            c = new int[n];
            int[] dateDays = new int[n];
            count = 0;
            diff = 0;
            for(int i = 0; i < n; i++){
                tokens = new StringTokenizer(in.readLine());
                d[i] = Integer.parseInt(tokens.nextToken());
                m[i] = Integer.parseInt(tokens.nextToken());
                y[i] = Integer.parseInt(tokens.nextToken());
                c[i] = Integer.parseInt(tokens.nextToken());

                dateDays[i] = dateToDays(d[i], m[i], y[i]);

                if(i > 0){
                    value = c[i] - c[i - 1];
                    if(dateDays[i] - dateDays[i - 1] == 1){
                        count++;
                        diff += value;
                    }
                }
            }

            ans.append(count + " " + diff + "\n");
        }
        out.print(ans);

        out.close();
    }

    public static int dateToDays(int d, int m, int y){
        int totalDays = 0;

        for(int year = 0; year < y; year++){
            totalDays += isLeapYear(year) ? 366 : 365;
        }

        for(int month = 1; month < m; month++){
            totalDays += daysInMonth(month, y);
        }

        totalDays += d;

        return totalDays;
    }

    public static boolean isLeapYear(int year){
        if(year % 400 == 0){
            return true;
        }else if(year % 100 == 0){
            return false;
        }else if(year % 4 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static int daysInMonth(int month, int year){
        switch(month){
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}
