package Package8;

import java.util.Scanner;

public class Choose_Number {
    public static void main(String[] args) {

        int[] arrNumber = new int[20];
        Scanner re = new Scanner(System.in);


        int odd_Number = 0;
        int even_Number = 0;
        int pos_Number = 0;
        int neg_Number = 0;

        for (int i = 0; i <= arrNumber.length; i++){

            try {
                System.out.println("Enter Number :");
                arrNumber[i] = re.nextInt();

                if (arrNumber[i] % 2 == 0){
                    even_Number++;
                }else {
                    odd_Number++;
                }
                if (arrNumber[i] < 0){
                    neg_Number++;
                }
                else{
                    pos_Number++;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("You can only enter 5 numbers");
            }

            System.out.format("Psitive Number %d   negetive Number %d   odd Number %d   even Number %d\n",
                    pos_Number, neg_Number, odd_Number, even_Number); }
    }
}
