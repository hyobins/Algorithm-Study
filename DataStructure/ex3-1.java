package test;
import java.util.Scanner;
//Linear Search (sentinel method)

class test{
	static int seqSearchSen(int[] a, int n, int key) {
		//practice 3-3 문제 -> for문 이용해서!
		int i;
		a[n] = key; //sentinel 추가
		for(i=0;a[i]!=key;i++); //while문의 break를 그대로 구현함 !! 신기싄기
		return i==n ? -1:i;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num+1];

		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값: ");
		int ky = sc.nextInt();

		int idx = seqSearchSen(x, num, ky);
		if(idx == -1)
			System.out.println("배열 x에는 "+ky+"이(가) 없습니다.");
		else
			System.out.println(ky+"는 x["+idx+"]에 있습니다.");
		}
}
