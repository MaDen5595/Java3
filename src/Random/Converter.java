package Random;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rub;
        double tug, rup, dong;
        System.out.print("Введите сумму в рублях: ");
        rub = scan.nextDouble();
        tug = rub * 0.076043;
        rup = rub * 0.010391;
        dong = rub * 0.009805;
        NumberFormat numberFormatTug = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println("Сумма в Юанях: " + numberFormatTug.format(tug));
        System.out.println("Сумма в Долларах: " + numberFormat2.format(rup));
        System.out.println("Сумма в Евро: " + numberFormat3.format(dong));

    }

}
