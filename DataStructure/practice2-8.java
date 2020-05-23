package test;
import java.util.Scanner;

class test{
	//기수변환 프로그램. 입력받은 10진수를 2진수~36진수로 변환하여 나타냄.


	static int cardConvR(int x, int r, char[] d){
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x%r);
			x /= r;
		} while(x!=0);
		return digits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //10진수 x
		int r = sc.nextInt();
		char[] d = new char[36];
		cardConvR(x,r,d);
		for(int i=0;i<d.length;i++) {
			System.out.print(d[d.length-i-1]);
		}
		sc.close();
	}

}
