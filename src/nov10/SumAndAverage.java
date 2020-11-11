package nov10;

import java.util.Scanner;

public class SumAndAverage {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter value for num2");
		int num2 = sc.nextInt();
		
		System.out.println("\'Sum of "+num1+"and "+num2+" is\' : "+(num1+num2));
		
		System.out.println("Average of"+num1+" and "+num2+" is: "+(num1+num2)/2.0f);
		sc.close();

	}
}
