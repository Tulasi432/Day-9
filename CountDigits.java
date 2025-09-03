package com.codegnan.controlstatements;
import java.util.Scanner;
public class CountDigits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter A number :");
		int number = scanner.nextInt();
		int count=0;
		while (number !=0) {
              number/=10;
              count++;
	}
     System.out.println("The count of Digits in Given Number is :"+count);
}
}
//sum=sum+num;
//System.out.println("The count of Digits in Given Number is :"+sum);
//palindrome
//amstrong
//fibonacii series

