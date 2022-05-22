package application;

import entites.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
// AREA = 12.00 PERIMETER = 14.00 DIAGONAL = 5.00
		System.out.printf("AREA = %.2f ", + rectangle.areaRectangle());
		System.out.println();
		System.out.printf("PERIMETER = %.2f", + rectangle.perimeterRectangle());
		System.out.println();
		System.out.printf("DIAGONAL = %.2f", + rectangle.diagonalRectangle());
		
		sc.close();
		
		

	}

}
