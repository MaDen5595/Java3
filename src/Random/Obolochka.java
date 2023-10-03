package Random;
import java.util.Scanner;
public class Obolochka {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
//1
        System.out.print("Введите цифру класса double: ");
        String a;
        a = scan.nextLine();
        try{
            Double a1 = Double.valueOf(a);
//2
            double a2 = Double.parseDouble(a);

//3
            byte a3 = a1.byteValue();
            int a4 = a1.intValue();
            short a5 = a1.shortValue();
            long a6 = a1.longValue();
            float a7 = a1.floatValue();

//4
            System.out.println(a1);

//5
            String d = Double.toString(a2);}
        catch(NumberFormatException e) {
            String b = "15.14656";
            Double a1 = Double.valueOf(b);
//2
            double a2 = Double.parseDouble(b);

//3
            byte a3 = a1.byteValue();
            int a4 = a1.intValue();
            short a5 = a1.shortValue();
            long a6 = a1.longValue();
            float a7 = a1.floatValue();

//4
            System.out.println(a1);

//5
            String d = Double.toString(a2);
        }
    }
}
