package Package2;

import java.util.Scanner;

public class AirlineReservationSystemTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AirlineReservationSystem ars = new AirlineReservationSystem();
        String section = "economy";


        ars.printGreeting();

        while(ars.seatsAvailable()){
            ars.printMenu();
            int choice = sc.nextInt();

            if(choice == 1 || choice == 2)
                section = (choice == 1) ? "economy" : "first";
            else
                continue;

            ars.assignSeat(section);
        }
        System.out.println("\tPLANE FULL\n");
        System.out.println("پرواز بعدی 3 ساعت دیگر است!!!");
    }
}
