import java.util.Scanner;

public class userinput2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter Student Age");
		int age=scan.nextInt();
		System.out.println("Student age is "+age);
		System.out.println("Enter Student Full name");
		scan.nextLine();
		String fn=scan.nextLine();
		System.out.println("Student Full name is "+fn);
		System.out.println("enter father name");
		scan.next();
		String fa=scan.nextLine();
		System.out.println("father name is "+fa);
		
	}

}
