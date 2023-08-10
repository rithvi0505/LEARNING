
public class ThisTryApp {

	public static void main(String[] args) {
		ThisTry m1=new ThisTry("rithvi","white",23);
	
		m1.dance();
		System.out.println(this.color+" "+this.name+" "+this.age+" years old is dancing");
	}

}
