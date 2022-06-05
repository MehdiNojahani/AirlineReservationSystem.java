package Package9;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arrNumber1 = new int[10];
        int[] arrNumber2 = new int[10];
        Scanner enter = new Scanner(System.in);

        try {
            for (int counter = 0; counter <= arrNumber1.length; counter++){
                System.out.println("Enter Number ["+counter+"] :");
                arrNumber1[counter] = enter.nextInt();
            }

            int x = 0;
            for (int counter = arrNumber2.length-1; counter >= 0; counter--){
                arrNumber2[counter] = arrNumber1[x];
                x++;
            }

            for (int counter  = 0; counter <= arrNumber2.length; counter++){
                System.out.println("arrays is arrNumber2["+counter+"] is "+ arrNumber2[counter]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("خارج از محدوده اعداد ");
        }

    }

}
