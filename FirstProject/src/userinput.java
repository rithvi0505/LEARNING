import java.util.Scanner;
public class userinput {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student First name");
		String fn=scan.next();
		System.out.println("Student first name is "+fn);
		System.out.println("Enter Student Last name");
		String ln=scan.next();
		System.out.println("Student last name is "+ln);
		System.out.println("Enter Student Age");
		int age=scan.nextInt();
		System.out.println("Student age is "+age);
		System.out.println("Enter Student gender");
		String gen=scan.next();
		System.out.println("Student gender is "+gen);
		System.out.println("Is the student married? True or Fasle");
		boolean m=scan.nextBoolean();
		System.out.println("Student entered "+m);
		System.out.println("Enter Student Branch");
		String branch=scan.next();
		System.out.println("Student Branch is "+branch);
		System.out.println("Enter Student Height");
		int h=scan.nextInt();
		System.out.println("Student height is "+h);
		System.out.println("Enter Student Weight");
		int w=scan.nextInt();
		System.out.println("Student weight is "+w);
		
	}

}
