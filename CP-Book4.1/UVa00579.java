import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader in;
    static PrintWriter out;

    static double calculateAngle(int hour, int minute){
//      double hourPos = (hour * (360.0/12)) + (minute * ((360.0/12)/60));
//      double minPos = (minute * (360.0/60));
        double hourPos = (hour * 30) + (minute * 0.5);
        double minPos = (minute * 6);

        double angle = Math.abs(hourPos - minPos);

        if(angle > 180){            //to find the smallest angle
            angle = 360 - angle;
        }

        return angle;
    }

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        while(true){
            String time = in.readLine();
            if(time.equals("0:00")){
                break;
            }
            String[] parts = time.trim().split(":");
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);

            out.printf("%.3f\n", calculateAngle(hour, minute));

        }

        out.close();
    }
}
