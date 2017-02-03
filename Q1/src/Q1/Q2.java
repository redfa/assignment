package Q1;

import java.util.Scanner;

public class Q2 {public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a gratuity rate:");
double rate = input.nextDouble();
System.out.print("Enter a subtotal:");
double subtotal=input.nextDouble();
double total = subtotal * (1+rate);
double gratuity = subtotal * rate;
System.out.println(total);
System.out.println(gratuity);
input.close();
}
}