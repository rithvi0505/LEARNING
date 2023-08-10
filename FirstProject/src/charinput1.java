import java.util.Scanner;
public class charinput1 {
	public static void main(String[] args) {
		System.out.println("enter a single character: ");
		Scanner scan=new Scanner(System.in);
		char any=scan.next().charAt(0);
		System.out.println("the entered character is "+any);
	}
}
