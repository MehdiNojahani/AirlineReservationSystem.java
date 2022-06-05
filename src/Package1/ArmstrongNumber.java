package Package1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        getArmStrongNumber(1741725);
    }


    public static void getArmStrongNumber(int num){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        num = 1741725;

        int len;

        int temp = 0;
        int sum = 0;
        while (num > 0){
            len = num % 10;
            num /= 10;
            sum += (num * num * num);
            temp = sum;
        }
        if (temp == sum) {
            System.out.println("y");
        }else {
            System.out.println("n");
        }
    }
}
