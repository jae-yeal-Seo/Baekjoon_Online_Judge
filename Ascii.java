package ch05;
import java.util.*;
public class Ascii {
//	내가 입력한 문자형(char)를 ASCII코드로 바꿔주는 프로그램이다.
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		char x = scan.next().charAt(0);
		int answer = (int)x;
		System.out.print(answer);
	}

}
