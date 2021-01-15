package ch05;
import java.util.*;
public class OvenTimeCalculator1 {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a>=0&&a<24&&b>=0&&b<60) {
			int result1=0;
			int result2=0;
			if(a<=22) {
				if(b+c>=60) {
					result1=a+((c-(60-b))/60+1);
					result2=(b+c)%60;
					if(result1>=24){
						result1=result1-24;
					}
				}
				else if(b+c<60) {
					result1=a;
					result2=b+c;
				}
				System.out.print(result1+" "+result2);
			}
			else if(a==23) {
				if(b+c>=60) {
					result1=(c-(60-b))/60+a+1;
					result2=(b+c)%60;
					if(result1>=24)
						result1=result1-24;
				}
				else if(b+c<60) {
					result1=a;
					result2=b+c;
				}
				System.out.print(result1+" "+result2);
			}
		}
		
	}
}
