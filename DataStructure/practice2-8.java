package test;
import java.util.Scanner;

class test{
	//기수변환 프로그램. 입력받은 10진수를 2진수~36진수로 변환하여 나타냄.


	static int cardConvR(int x, int r, char[] d){
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x%r);
			x /= r;//x를 r로 나눕니당. 몫을 저장!
		} while(x!=0);
		return digits;//배열의 총 길이. 자릿수 의미
	}

	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
	// 	int x = sc.nextInt(); //10진수 x
	// 	int r = sc.nextInt();
	// 	char[] d = new char[36];
	// 	cardConvR(x,r,d);
	// 	for(int i=0;i<d.length;i++) {
	// 		System.out.print(d[d.length-i-1]);
	// 	}
	// 	sc.close();
	// }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no; //변환하는 정수(10진수)
		int base; //진수
		int result; //cardConvR의 리턴값으로 결과값이 저장된 배열의 길이를 받아와서 저장함
		int retry; //yes or no?
		char[] array = new char[36];

		System.out.println("10진수를 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이아닌 정수: ");
				no = sc.nextInt();
			} while(no<0); //음수 입력이 들어오는 경우 양수가 들어올때까지 반복
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36): ");
				base = sc.nextInt();
			} while(base<2 || base>36);

			result = cardConvR(no, base, array);

			System.out.print(base+"진수로는 ");
			for(int i=result-1;i>=0;i--)
				System.out.print(array[i]);
			System.out.println("입니다.");

			System.out.print("한번 더?(1.예/0.아니오): ");
			retry = sc.nextInt();

		}while(retry == 1);
	}

}
