package Package6;

import javax.swing.*;
import java.util.Scanner;

public class Fibonacci_Number {
    private static final double VALUE_NUMBER = 7.8;
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println(getValueNumber( VALUE_NUMBER));

    }

    public static double getValueNumber(double number){

        if (number <= 1){
            return number;
        }else {
            return (number - 1) + (number - 2);
        }
    }
}

