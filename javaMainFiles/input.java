package javaMainFiles;

import java.util.Scanner;

public class input {
    public static void main(String[] args){
        String names = new String("Your name is: ");
        Scanner inputNAme = new Scanner(System.in);
        String namess = inputNAme.nextLine();
        System.out.println(names+namess);


    }
    
}
