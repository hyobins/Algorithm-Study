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
			if(n<0)
				return before(-n);

			temp.d += n;
			while(temp.d > months[isLeap(temp.y)][temp.m-1]) {
				temp.d -= months[isLeap(temp.y)][temp.m-1];
				if(++temp.m > 12) {
					temp.y++;
					temp.m = 1;
				}
			}
			return temp;
		}

		YMD before(int n) {
			YMD temp = new YMD(this.y, this.m, this.d);
			if(n<0)
				return after(-n);
			temp.d -= n;
			while(temp.d<1) {
				if(--temp.m < 1) {
					temp.y--;
					temp.m = 12;
				}
				temp.d += months[isLeap(temp.y)][temp.m-1];
			}
			return temp;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 날짜를 입력해주세요.");
		System.out.print("year: "); int y = sc.nextInt();
		System.out.print("month: "); int m = sc.nextInt();
		System.out.print("day: "); int d = sc.nextInt();
		YMD date = new YMD(y, m, d);

		System.out.print("n일 뒤의 날짜를 반환합니다. n: ");
		int n = sc.nextInt();
		YMD d1 = date.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.y, d1.m, d1.d);

		System.out.print("k일 앞의 날짜를 반환합니다. k: ");
		int k = sc.nextInt();
		YMD d2 = date.before(k);
		System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일입니다.\n", k, d2.y, d2.m, d2.d);

	}
}
