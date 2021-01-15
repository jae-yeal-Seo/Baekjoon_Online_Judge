//일차원 배열 마지막 문제

//문제 : 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

//둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

//출력 : 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.

import java.util.Scanner;
//백준 온라인 저지 4344번
public class AverageAboveRatio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int wholecase=scan.nextInt(); 
//전체 케이스의 갯수를 입력하시오.
		int[] group=new int[1000];
//학생수는 1~1000명으로 제한한다.
		for(int i=0;i<wholecase;i++) { 
//입력한 케이스의 갯수만큼 작업을 한다.
			int count=0;
			int sum = 0;
			int people=scan.nextInt();
//학생수를 입력한다.
			for(int j=0;j<people;j++) {
				group[j]=scan.nextInt();
//학생별로 점수를 입력하고
				sum+=group[j];
//입력한 정수를 총합에 더한다.	
			}
			for(int k=0;k<people;k++) {
				if(group[k]>(sum/(double)people)) {
//평균이상인 학생들 한 명당 하나씩 count++을 한다.
					count++;
				}
			}
			System.out.printf("%.3f",((count/(double)people)*100));
//평균이상인 학생의 비율을 (count/(double)people)*100로 구한다.
			System.out.println("%");
		}
		scan.close();
	}
}
