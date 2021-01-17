package ch05;
import java.util.*;
public class StringStudy {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
//		문제 : 문자열중 가장 많이 쓰인 문자를 출력한다. 입력은 대소문자를 구분하지 않아도 되고, 출력은 대문자로만한다.
//			   단, 가장 많이 나온 문자가 2개 이상이면 해당 문자열의 출력값은 ?라고 한다.
//		문제풀이 :
//		1. 
		int check=0;
		int max=0;
		String s = scan.next();
		String news = s.toUpperCase();
		int[] nums = new int[s.length()];
		for(int i=0;i<s.length();i++) {
			if(nums[i]!=-1) {
				for(int j=i+1;j<s.length();j++) {
					if(news.charAt(i)==news.charAt(j)) {
						nums[j]=-1;
					}
				}
			}
		}
//		문자열의 문자중 앞에서 이미 나온 문자는 -1로 저장한다.
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				for(int j=i;j<nums.length;j++) {
					if(news.charAt(i)==news.charAt(j))
						nums[i]++;
				}
			}
		}
//		nums[i]가 0인 문자에게만 해당되는 반복문이다. 그 문자부터 문자열의 끝까지 그 문자가 몇개있는지 센다. 
		max=0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[max]<nums[i+1])
				max=i+1;
		}
//		가장 많은 문자를 갖고있는 문자의 첫번째 위치를 max에 저장한다.
		for(int i=0;i<nums.length;i++) {
			if(nums[max]==nums[i])
				check++;
		}
//		만약 문자를 갖고있는 최대갯수가 같은 문자가 2개이상 있다면 check에 1씩 더한다 check가 2가 넘어가면 ?를 출력하기 위해서다.
		if(check>=2)
			System.out.print("?");
		else if(check==1)
			System.out.print(news.charAt(max));
	}
}
