import java.util.Scanner;

public class while2{
    public static void main(String[] args){
        Scanner scannedInput = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){
        System.out.print("input: ");
        input = scannedInput.next().toLowerCase();
        System.out.println(input);
    }
    }
}