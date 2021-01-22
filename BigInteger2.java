import java.util.*;
import java.math.BigInteger;

public class BigInteger2 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		BigInteger n1 = new BigInteger(scan.nextLine());
		char b = scan.nextLine().charAt(0);
		BigInteger n2 = new BigInteger(scan.nextLine());
		
		if(b=='+')
			System.out.println(n1.add(n2));
		else if(b=='*')
			System.out.println(n1.multiply(n2));
	}

}
