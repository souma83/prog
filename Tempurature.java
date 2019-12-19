	import java.util.Scanner;

public class Tempurature {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		double c, f;
		System.out.println("enter the temprature in celsius ");
		c=in.nextDouble();
		f=c*9/5+32;
System.out.println("%fcelsius =%f fahrenheit", c,f);

	}
	}
