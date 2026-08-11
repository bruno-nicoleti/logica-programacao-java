import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X;
		double Y, km;
		
		X = sc.nextInt();
		Y = sc.nextDouble();
		
		km = X / Y;
		
		System.out.printf("%.3f km/l%n", km);
		
		
		
		sc.close();
	}

}
