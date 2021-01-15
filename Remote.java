package ch05;

public class Remote{
	public static void main(String[] args){
/*
 * 문제설계 : check배열을 10001까지 만든다(10000도 계산이 가능하게 하기 위함)
 * 		   i=1~10000까지중 셀프넘버가 "아닌"수를 checkint라고 할 때, check[checkint]에1을 넣는다.
 * 		   i=1~10000까지 돌렸을 때 check[i]가 0인 수들은 셀프넘버일 것이다. 
 * 		   */
		int[] check = new int[10001];
		for(int i=1;i<=10000;i++) {
			int man=i/10000;
			int chun=i/1000-10*man;
			int bak=i/100-100*man-10*chun;
			int sip=i/10-1000*man-100*chun-10*bak;
			int il=i-10000*man-1000*chun-100*bak-10*sip;
			int checkint = i+man+chun+bak+sip+il;
			if(checkint<=10000) {
			check[checkint]=1;
			}
		}
		for(int i=1;i<=10000;i++) {
			if(check[i]==0) {
				System.out.println(i);
			}
		}
		
	}
}