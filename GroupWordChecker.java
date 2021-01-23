import java.util.*;

public class GroupWordChecker {
/*
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
 * 
 * kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

	단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.*/	
	private static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		int number = scan.nextInt();
//		몇개의 문자열을 입력할 건지 입력한다.
		String[] dana = new String[number];
//		number갯수 만큼 index가 있는 문자열 배열을 만든다.
		for(int i=0;i<number;i++) {
			dana[i] = scan.next();
		}
// 		문자열을 number개 만큼 입력한다.
		for(int i=0;i<number;i++) {
//			모든 문자열을 검사한다.
			for(int j=1;j<dana[i].length();j++) {
				if(dana[i]=="0")
					break;
//				두번째는 첫번째와, 세번째는 두번째와 ... 마지막번째는 마지막번째 전과 비교를 한다.
				if(dana[i].charAt(j)==dana[i].charAt(j-1))
					continue;
//				만약 위의 방식대로 비교했을 때 두수가 같다면 다음 문자로 넘어간다.
				else {
					for(int k=j-1;k>=0;k--) {
						if(dana[i].charAt(j)==dana[i].charAt(k)) {
							dana[i]="0";
							break;
						}
					}
				}
//				만약 서로 다른 문자열이 이웃할 경우, 해당 문자와 "첫번째 문자~해당문자 전문자"까지 비교해서 같은 문자가 있으면 해당 문자열을 "0"으로 만들어 버리고
//				해당문자열은 더 이상 체크하지 않게 if(dana[i]=="0")break;라는 조건문을 넣는다.
			}
		}
		int newnumber = number;
		for(int i=0;i<number;i++) {
			if(dana[i]=="0")
				newnumber--;
		}
//		"0"이었던 문자열은 그룹단어가 아니므로 number에서 1을 뺀다. 
	System.out.print(newnumber);
	}
}
// 해당 문자열을 "0"으로 만드는 스킬, newnumber라는 새로운 변수를 설정함으로써 number와 변수이름이 겹치지 않게하는 게 굉장히 중요했던 기술이었다. 
