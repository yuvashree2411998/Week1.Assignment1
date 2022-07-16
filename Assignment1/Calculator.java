package week1.Assignment1;

public class Calculator {
	public void add(int num1, int num2, int num3) {
		System.out.println("Addition :" + (num1+num2+num3));	
	}
	public void sub(int num1, int num2) {
		String name="Subtraction";
		System.out.println("Subtraction :"+ (num1-num2)); 
	}
	public void mul(double num1, double num2) {
		System.out.println("Multiplication:" +num1*num2);
	}
	public void div(float num1, float num2) {
		System.out.println("Division :" +num1/num2);
	}
}
