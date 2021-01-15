package ch05;
import java.util.*;
public class CharLocation {
//	내가 입력한 문장의 알파벳들이 몇번째에서 처음 나왔는지 알려주는 프로그램이다.
//	해당알파벳이 나오지않은 경우 -1로 표시되며 해당알파벳이 나왔을 경우 몇번째에 위치해 있는지 알려준다.
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String s = scan.next();
		int[] storage = new int[26];
		
		for(int i=0;i<storage.length;i++) {
			storage[i]=-1;
		}
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<26;j++) {
				if(storage[j]==-1&&(int)s.charAt(i)==(j+97)) {
//					이미 체크를 한 알파벳은 넘어가게끔 storage[j]==-1이라는 식을 넣었다.
					storage[j]=i;
					break;
				}
			}
		}
		for(int i=0;i<26;i++) {
			System.out.print(storage[i]+" ");
		}
	}
}
