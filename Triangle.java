import java.util.Scanner;

public class Triangle {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Type in 3 numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if (a+b < c) {
			System.out.println("You cannot make a triangle");
			} else if (a <= 0 || b <= 0 || c <= 0) {
				System.out.println("Error");
				} else {
				System.out.println("You can make a triangle");
				}
			

}
}
