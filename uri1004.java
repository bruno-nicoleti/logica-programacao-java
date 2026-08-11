import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X, Y, product;
		
		X = sc.nextInt();
		Y = sc.nextInt();
		product = X * Y;
		
		System.out.println("PROD = " + product);
		
		
		
		
		sc.close();
	}

}
