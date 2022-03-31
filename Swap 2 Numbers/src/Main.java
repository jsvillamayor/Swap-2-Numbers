import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your X value:");
		int x = scanner.nextInt();
		System.out.println("Enter your y value:");
		int y = scanner.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Your new x value is: "+x);
		System.out.println("Your new y value is: "+y);

	}

}
