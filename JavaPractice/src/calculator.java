import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		float a=input.nextFloat();
		System.out.println("Enter another number");
		float b=input.nextFloat();
		input.close();
		System.out.println("addition is "+(a+b)+"\n"+"subtraction is"+(b-a)+"\n"+"multiplication is "+(a*b)+"\n"+"quotient is "+(b/a)+"\n"+"remainder is "+(b%a));
		
	}

}
