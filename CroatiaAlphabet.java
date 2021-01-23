import java.util.*;

public class CroatiaAlphabet {
		static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String s = scan.next();
//		문자를 입력받는다.
		int length = s.length();
//		문자열의 길이를 따로 length라는 기초형변수에 집어넣는다. 
		
		for(int i=0;i<s.length();i++) {
//			문자열 처음부터 끝까지 점검을 한다.
			if(i<s.length()-1&&s.charAt(i+1)=='=') {
//				i<s.length()-1을 한 이유는 마지막 문자열 때 s.charAt(i+1)메소드를 적용할 수 없기때문이다(배열의 index문제)
				length=length-1;
				if(i>=1&&s.charAt(i)=='z'&&s.charAt(i-1)=='d')
//					이 조건문은 "dz="인 문자열을 검출하는 것이기 때문에 반드시 위의 조건문안에 있어야 한다.(상위 조건문에 "포함"이 되는 내용이기 때문에)
					length = length-1;
			}
			else if(i<s.length()-1&&s.charAt(i+1)=='-') {
				length = length-1;
			}
			else if((i>=1&&s.charAt(i)=='j'&&s.charAt(i-1)=='l')||(i>=1&&s.charAt(i)=='j'&&s.charAt(i-1)=='n'))
					length = length-1;
		}
		System.out.print(length);
	}

}
