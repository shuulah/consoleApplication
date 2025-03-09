package org.example;

import java.util.Scanner;

import static java.lang.System.exit;

public class Calculator {
    public static int add(int num1, int num2){
        return num1 +num2;
    }
    public static int sub(int num1, int num2){
        return num1 - num2;
    }
    public static double multiply(double num1, double num2){
        return num1*num2;
    }
    public static double div(double num1, double num2){
        return (num1/num2);
    }
    public static void main(String[] args) {
        Scanner operator= new Scanner(System.in);
        //System.out.println("input your desired operation to perform :addition, multiplication and division");
        //char operator= userInput.next().charAt(0);
        while (true) {
            System.out.println("input your desired operation to perform :addition, multiplication and division");
            char option= operator.next().charAt(0);
            if (option=='+'){
                System.out.println("Please input two numbers:");
                Scanner userInput= new Scanner(System.in);
                int input= userInput.nextInt();
                int input2= userInput.nextInt();
                int result= add(input,input2);
                System.out.println(result);
            }
            else if (option=='-'){
                System.out.println("Please input two numbers:");
                Scanner userInput= new Scanner(System.in);
                int input= userInput.nextInt();
                int input2= userInput.nextInt();
                int result= sub(input,input2);
                System.out.println(result);
            }
            else if (option=='*'){
                Scanner userInput= new Scanner(System.in);
                System.out.println("Please input two numbers:");
                int input= userInput.nextInt();
                int input2= userInput.nextInt();
                double result= multiply(input,input2);
                System.out.println(result);
            }
            else if (option=='/'){
                Scanner userInput= new Scanner(System.in);
                System.out.println("Please input two numbers:");
                int input= userInput.nextInt();
                int input2= userInput.nextInt();
                if (input2==0){
                    System.out.println("zero division is allowed");
                    break;}
                double result= div(input,input2);
                System.out.println(result);
            }
            else {
                System.out.println("operator is not allowed");
                System.out.println("please choose 0 as an operator to end the program");
            }
            if (option=='0'){
                exit(0);
            }


        }




    }
}
