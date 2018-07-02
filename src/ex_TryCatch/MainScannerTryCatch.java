package ex_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainScannerTryCatch {

    public static void main(String[] args) {

        typeNumber();
    }

    static int typeNumber(){
        int number;
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Please type your number");
            number = scanner.nextInt();
            System.out.println("Your number is: " + number);
            return number;
        }catch (InputMismatchException e){
            System.out.println("Invalid data. Try again");
            return 0;
        }finally {
            System.out.println("Finally");
        }
    }
}
