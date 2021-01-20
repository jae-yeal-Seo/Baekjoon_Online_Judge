package ch05;
import java.util.*;

public class WordNumber {
//	문제 : 문자열에 있는 단어의 갯수를 세야한다. 
//	*next()메소드가 아니라 nextLine()이라는 메소드를 써야 엔터를 치기 전까지의 문자열을 하나의 문자열로 인식할 수 있다.
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String s = scan.nextLine();
//		문자열을 입력받는다.
		int number=0;
//		단어의 갯수를 센다.
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&&i!=0&&i!=s.length()-1)
				number++;
		}
//		처음과 마지막은 단어의 갯수세기에 무의미한 공백이므로 두개의 공백은 빼고 문장의 공백갯수를 센다.
		if(s.length()>0) {
			if(s.length()==1&&s.charAt(0)==' ')
				System.out.print(number);
			else 
				System.out.print(number+1);
		}
//		문자열의 길이가 0이상일 때 공백이 하나만 있는 문자열(s.length()==1이고 s에는' '하나만 들어있는 경우)을 제외하고 number(공백의 갯수)+1을 출력한다.
		else
			System.out.print(number);
//		문자열의 길이가 0이면 0/혹은 number라고 출력한다.
	}
}
