import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, hours;
		double priceHours, salario;
		
		number = sc.nextInt();
		hours = sc.nextInt();
		priceHours = sc.nextDouble();
		
		salario = priceHours * hours;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		
		sc.close();
	}

}
