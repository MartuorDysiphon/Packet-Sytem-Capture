import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int choice;
    static float NETWORK = 11, SERVER = 100, PENETRATION = 60;
    static float GWS = 0;
    static float VWS = 0;
    static int PWS;
    static List<String> orderList = new ArrayList<>();

    public static void main(String[] args) {
        separator();
        System.out.println("\t\t PACKET MONEY SYSTEM");
        do{
            do{
                separator();
                System.out.println("\n"
                        + "[1]NETWORK\n"
                        + "[2]SERVER\n"
                        + "[3]PENETRATION");
                myChoice();
                switch (choice) {
                    case 1:
                        VWS = NETWORK;
                        orderList.add("##### NETWORK STATUS : STABLE #####");
                        break;

                    case 2:
                        VWS = SERVER;
                        orderList.add("||||| SERVER CONNECTION : SUCCESS |||||");
                        break;

                    case 3:
                        VWS = PENETRATION;
                        orderList.add("***** PENETRATION WAS A SUCCESS *****");
                        break;

                    default:
                        System.out.println("Invalid Input. Must be in choices.");
                }//SWITCH
                multiplyTo();

                orderList.set(orderList.size()-1, orderList.get(orderList.size()-1) + " - x" +  PWS);

                System.out.println("DO YOU WISH TO MONITOR THEM AGAIN? [1]Yes | [0]No: ");
                myChoice();

            }while(choice == 1);
            int count = 1;
            separator();
            for (String display : orderList) {
                System.out.println(count + ". " + display);
                count++;
            }
            separator();
            System.out.println("THE TOTAL PACKETS N SYSTEMS INVOLVED ARE: " + GWS);
            separator();
            System.out.println("DO YOU WISH TO INATE THE P.SEV257.56 AGAIN? [1]Yes | [0]No:");
            myChoice();
            orderList.clear();
        }while(choice == 1);
    }
    static void multiplyTo() {
        while (true) {

            try {
                separator();
                System.out.print("HOW MANY DEVICES ARE CONNECTED: ");
                String multiplyTo = scan.next();
                PWS = Integer.parseInt(multiplyTo);

                if (PWS <= 0) {
                    separator();
                    System.out.println("POSETIVE INT.ONLY");
                } else {
                    GWS += VWS * PWS;
                    break;
                }

            } catch (NumberFormatException nfe) {
                separator();
                System.out.println("NO FOUND, ENTER CORRECT DATA.");
            }
        }//WHILE

    }//MUL

    static void myChoice() {

        while (true) {

            try {
                separator();
                System.out.print(": ");
                String myChoice = scan.next();
                choice = Integer.parseInt(myChoice);
                break;
            } catch (NumberFormatException nfe) {
                separator();
                System.out.println("NOT FOUND, VALID DATA ONLY.");
            }//CATCH

        }//WHILE

    }//myCHOICE

    static void separator() {
        for (int i = 0; i < 30; i++) {
            System.out.print("**");
        }
        System.out.println("");
    }

}//MAIN
