package test;
import java.util.Scanner;
//그 해 경과 일 수 구하기

class test{
	static int[][] mdays = {
		{31,28,31,30,31,30,31,31,30,31,30,31}, //평년
		{31,29,31,30,31,30,31,31,30,31,30,31}  //윤년
	};

	static int isLeap(int year) {//year은 윤년인가?1 평년인가?0
		return (year % 4 == 0 && year % 100 !=0 | year %400 ==0) ? 1:0;
	}

	static int dayOfYear(int y, int m, int d) {
		int days = d;

		for(int i=1;i<m;i++)
			days += mdays[isLeap(y)][i-1];
		return days;
	}

//	//ex2-8 i와 days없이 dayOfYear 메서드 구현
//	static int dayOfYear(int y, int m, int d) {
//		do {
//			d += mdays[isLeap(y)][m-1];
//			m--;
//		}while(m!=0);
//		return d;
//	}

	//ex2-9 그해 남은 일 수 구하기
	static int leftDayOfYear(int y, int m, int d) {
		int days = mdays[isLeap(y)][m-1]-d;
		//System.out.println(days);
		for(int i=12;i>m;i--) {
			days += mdays[isLeap(y)][i-1];
		}
		return days;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;

		do {
			System.out.print("년: ");	int year = sc.nextInt();
			System.out.print("월: ");	int month = sc.nextInt();
			System.out.print("일: ");	int day = sc.nextInt();

			System.out.printf("그 해 %d일째입니다. \n", dayOfYear(year,month,day));
			System.out.printf("그 해가 %d일 남았습니다. \n", leftDayOfYear(year,month,day));

			System.out.print("Retry?(yes:1/no:0): ");
			retry = sc.nextInt();


		}while(retry == 1);

	}
}
