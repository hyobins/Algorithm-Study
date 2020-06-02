package test;
import java.util.Scanner;

class test{
	static class YMD{
		//멤
		int y;
		int m; //(1~12)
		int d; //(1~31)

		static int[][] months = {
				{31,28,31,30,31,30,31,31,30,31,30,31}, //평년
				{31,29,31,30,31,30,31,31,30,31,30,31}, //윤년
		};

		static int isLeap(int year) {
			return (year % 4==0 && year %100 !=0 || year % 400 == 0) ? 1:0;
		}

		//생성자(초기화)
		YMD(int y, int m, int d){
			this.y = y;
			this.m = m;
			this.d = d;
		}

		YMD after(int n) {
			YMD temp = new YMD(this.y, this.m, this.d);
			temp.d += n;
			while(temp.d>) {

			}


		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("year: "); int y = sc.nextInt();
		System.out.print("month: "); int m = sc.nextInt();
		System.out.print("day: "); int d = sc.nextInt();
		YMD date = new YMD(y, m, d);

		System.out.print("n일 뒤의 날짜를 반환합니다. n= ");
		int n = sc.nextInt();
		date.after(n);
		System.out.println(m+"월 "+d+"일");
	}
}
