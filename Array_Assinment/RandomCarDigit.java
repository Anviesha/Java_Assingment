package Array_Assinment;

import java.util.Arrays;
import java.util.Random;

public class RandomCarDigit {

    public static void main(String[] args) {
        String[] carNumber = new String[5];
        String index;

        Random random = new Random();

        for (int i=0; i<5; i++)
        {
            index = String.format("%04d", random.nextInt(10000));
            index = "MH" + index;

            boolean test = Arrays.asList(carNumber).contains(index);

            if (!test) {
                carNumber[i] = index;
                System.out.println(carNumber[i]);
            }
        }
    }
}
