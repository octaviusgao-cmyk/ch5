import java.util.Scanner;
public class quadratic {

public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
		System.out.print("Give me three numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		System.out.println((b*(-1) + Math.sqrt(Math.pow(b, 2)) - 4*a*c)/2);
		System.out.println((b*(-1) - Math.sqrt(Math.pow(b, 2)) - 4*a*c)/2);

}
}
