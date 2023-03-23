import java.util.Scanner;

public class exercise{
    public static void main(String[] aargs){
        Scanner scannedNumber = new Scanner(System.in);
        System.out.print("please input a number: ");
        int userInput = scannedNumber.nextInt();

        if (userInput % 3 == 0 && userInput % 5 == 0){
            System.out.println("FIZZBUZZ");
        }
        else if(userInput % 3 == 0){
            System.out.println("BUZZ");
        }
        else if (userInput%5==0){
            System.out.println("FIZZ15");
        }
        else{
            System.out.println(userInput);
        }
        
    }
}