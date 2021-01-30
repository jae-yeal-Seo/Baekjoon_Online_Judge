import java.util.*;

public class HoneyComb {

	public static void main(String[] args) {
		/*
		 * 위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 
		 * 
		 * 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
		 * 
		 * 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.*/
		Scanner scan = new Scanner(System.in);
//		몇 번칸의 벌집에 갈건지 입력한다.
		int Onenumber = 8; int plus = 12; int checknumber = 3; 
		int x = scan.nextInt();
		if(x==1)
		System.out.print(1);
//		1번 벌집도 1번 방을 거쳐간 거라고 처리한다.
		else if(1<x&&x<8)
			System.out.print(2);
//		2~7에 해당하는 번호는 밑의 else와 범위형식이 다르기 때문에 따로 구현을 해 놓았다. 
		else {
			while(true) {
				if(Onenumber<=x&&x<Onenumber+plus) 
					break;
				Onenumber+=plus;
				plus=++checknumber*6;
			}
//			x의 벌집까지 가기위한 공식을 입력한다. 그리고 해당범위에 속하면 반복문을 끝낸다.
			System.out.print(checknumber);
//			얼마나 이동했는지 출력한다.
		}		
	}
}


