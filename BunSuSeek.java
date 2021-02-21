package ch05_2.oop;

import java.util.Scanner;

public class BunSuSeek {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int suma=1; int sumb=1; int aplus=1; int bplus=2;int count=1;
		
		int input = scan.nextInt();
		while(true) {
			if(suma<=input&&input<=sumb) {
				if(count%2!=0) {
					System.out.println((sumb-input+1)+"/"+(input-suma+1));
					break;
				}
				else if(count%2==0) {
					System.out.println((input-suma+1)+"/"+(sumb-input+1));
					break;
				}
			}
			suma = suma + aplus++;
			sumb = sumb + bplus++;
			count++;
		}
	}
}
