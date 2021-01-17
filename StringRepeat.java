package ch05;
import java.util.*;

public class StringRepeat {
//	문제 : 실행할 케이스의 갯수, 실행할 문자열, 실행할 문자열의 각 문자를 반복할 횟수를 입력한다. 
//	ex)1 2 ABC(입력) ==>AABBCC(출력)
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int casenumber = scan.nextInt();
//		실행할 케이스의 갯수를 적는다.
		for(int i=0;i<casenumber;i++) {
//			케이스 수만큼 반복한다.
			int charnumber=scan.nextInt();
//			문자열의 문자마다 몇번을 반복할지 적는다.
			String s = scan.next();
//			문자열을 입력한다.
			for(int j=0;j<s.length();j++) {
//				문자열의 길이만큼 반복한다.
				for(int k=0;k<charnumber;k++) {
//					문자열마다 charnumber만큼 반복해서 출력한다.
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
//			(문제에서의)출력형식을 맞추기 위해 println을 적었다.
		}
	}
}
