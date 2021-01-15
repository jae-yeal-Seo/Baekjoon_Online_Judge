package ch05;
import java.util.*;
public class HanSu{
/*
 * 한수(각 자리수가 등차수열을 이루는 수)
 * 1. 1~99는 모두 한수(각자릿수가 2개 밖에 없기 때문에 각 자릿수의 차가 하나밖에 없다)
 * 2. 100~999까지는 각 자릿수의 차이가 일정해야 한수가 된다.*/
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		int input = scan.nextInt();
		int number = 0;
		for(int i=1;i<=input;i++) {
			if(i<100)
				number++;
//			1~99까지는 모두 한수이다.
			else {
				int bak = i/100;
				int sip = i/10-10*bak;
				int il = i-bak*100-10*sip;
//				각 자릿수를 추려냈다.
				if((sip-bak==il-sip)||(sip-bak==il-sip))
					number++;
			}
//			각 자릿수의 차이가 일정하면 한수로 인정하고 number에 숫자를 더한다.
		}
		System.out.print(number);
	}
}