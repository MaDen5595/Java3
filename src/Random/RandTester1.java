package Random;
import java.util.Random;
public class RandTester1 {
    public static void main(String args[]) {
        //1

        // с классом Random
        Random rand = new Random();
        int tmp = 0;
        boolean needIteration = true;
        int[] chisla = new int[]{
                rand.nextInt(100),
                rand.nextInt(100),
                rand.nextInt(100),
                rand.nextInt(100),
                rand.nextInt(100)};
        System.out.println("Массив рандомных чисел");
        for (int i = 0; i < 5; i++) {
            System.out.println(chisla[i]);
        }
        while (needIteration){
            needIteration = false;
            for(int i = 1; i < chisla.length; i++){
                if(chisla[i] < chisla[i - 1]){
                    tmp = chisla[i];
                    chisla[i] = chisla[i - 1];
                    chisla[i - 1] = tmp;
                    needIteration = true;
                }
            }
        }
        System.out.println("Сортированный массив рандомных чисел");
        for (int i = 0; i < 5; i++) {
            System.out.println(chisla[i]);
        }

        //С методом random()
        double e;
        int[] chisla1 = new int[5];
        for(int i = 0; i < 5; i++){
            e = 100*Math.random();
            chisla1[i] = (int) e;
        }
        System.out.println("Массив рандомных чисел");
        for (int i = 0; i < 5; i++) {
            System.out.println(chisla1[i]);
        }
        needIteration = true;
        while (needIteration){
            needIteration = false;
            for(int i = 1; i < chisla1.length; i++){
                if(chisla1[i] < chisla1[i - 1]){
                    tmp = chisla1[i];
                    chisla1[i] = chisla1[i - 1];
                    chisla1[i - 1] = tmp;
                    needIteration = true;
                }
            }
        }
        System.out.println("Сортированный массив рандомных чисел");
        for (int i = 0; i < 5; i++) {
            System.out.println(chisla1[i]);
        }

        //3
        boolean ubiv = false;
        int[] posl = new int[]{
                rand.nextInt(89) + 10,
                rand.nextInt(89) + 10,
                rand.nextInt(89) + 10,
                rand.nextInt(89) + 10};
        for(int i = 1; i < 4; i++){
            if(posl[i-1] > posl[i]){
                    ubiv = true;
                    break;
            }
        }
        System.out.printf("Последовательность: %d, %d, %d, %d \n", posl[0],
                posl[1], posl[2], posl[3]);
        if(ubiv){
            System.out.println("Последовательность не возрастает");
        }
        else{
            System.out.println("Последовательность возрастает");
        }
    }
}
