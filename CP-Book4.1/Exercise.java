import java.util.*;
import java.util.regex.*;
import java.io.*;
import java.time.*;
import java.math.*;
import javax.script.*;

public class Exercise{
    static BufferedReader in;
    static PrintWriter out;
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    static void readDouble(){
        double n = Double.parseDouble(in.readLine());
        out.printf("%.3f\n", n);
    }

    static void decimalsOfPi(){
        int n = Integer.parseInt(in.readLine());
        out.printf("%." + n + "f\n", Math.PI);
    }

    static void dateInfo(){
        String line = in.readLine();
        LocalDate date = LocalDate.parse(line, formatter);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        LocalDate today = LocalDate.now();
        long daysElapsed = ChronoUnit.DAYS.between(date, today);

        out.println("Once upon a " + dayOfWeek + ", " + daysElapsed + " days ago...");
    }

    static void sortedUniqueIntegers(){
        String line;
        Set<Integer> uniqueIntegers = new HashSet<>();

        while((line = in.readLine()) != null && !line.isEmpty()){
            StringTokenizer tokens = new StringTokenizer(line);
            while(tokens.hasMoreTokens()){
                int n = Integer.parseInt(tokens.nextToken());
                uniqueIntegers.add(n);
            }
        }
        
        List<Integer> sortedList = new ArrayList<>(uniqueIntegers);
        Collections.sort(sortedList);
        out.println(sortedList);
    }

    static void sortBirths(){
        String line;
        List<LocalDate> birthdates = new ArrayList<>();
        
        while((line = in.readLine()) != null && !line.isEmpty()){
            LocalDate date = LocalDate.parse(line, formatter);
            birthdates.add(date);
        }

        Collections.sort(birthdates, new BirthDateComparator());

        for(LocalDate each : birthdates){
            out.println(each.format(formatter));
        }
    }

    static class BirthDateComparator implements Comparator<LocalDate>{
        @Override
        public int compare(LocalDate b1, LocalDate b2){
            if(b1.getMonthValue() != b2.getMonthValue()){
                return b1.getMonthValue() - b2.getMonthValue();
            }

            if(b1.getDayOfMonth() != b2.getDayOfMonth()){
                return b1.getDayOfMonth() - b2.getDayOfMonth();
            }

            return b2.getYear() - b1.getYear();
        }
    }

    //Exercises 6 to 9 are left undone

    static void specialWords(){
        String  line = in.readLine();
       
        Pattern pattern = Pattern.compile("\\b[a-z][0-9]{2}\\b");
        Matcher matcher = pattern.matcher(line);
        String result = matcher.replaceAll("***");
        out.println(result); 
    }

    static void checkPrime(){
        BigInteger N = new BigInteger(in.readLine());

        if(N.isProbablePrime(100)){
            out.println("Prime");
        }else{
            out.println("Composite");
        }
    }

    static void calculator(){
        String line = in.readLine();

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        Object result = engine.eval(line);
        out.println(((Number) result).doubleValue());
    }

    public static void main(String[] args) throws Exception{
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        //DO STUFF

        out.close();
    }
}
