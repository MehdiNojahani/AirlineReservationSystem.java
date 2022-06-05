package Package5;

import java.util.Arrays;

public class Prime_Number {

    //Fixed famous
    private static final int SAMPLE_SIZE = 10000;
    //boolean Arrays
    private static boolean[] arrPrimes= new boolean[SAMPLE_SIZE];

    public static void main(String[] args) {
        //Arrays Class for fill arrays
        Arrays.fill(arrPrimes, true);
        //because 0 / 1 not in etothesten
        arrPrimes[0] = false;
        arrPrimes[1] = false;

        //for loop fill and build
        for (int i = 0; i <= arrPrimes.length; i++){

            if (arrPrimes[i]){

                for (int j = i;  i* j <= arrPrimes.length; j++){
                    arrPrimes[i * j] = false;
                }
            }

            for (i = 0; i <= arrPrimes.length; i++){
                if (get_PrimeNumber(i)){
                    System.out.print(i+"\n");
                }
            }
        }

    }

    public static boolean get_PrimeNumber(int number) {
        return arrPrimes[number];
    }
}
