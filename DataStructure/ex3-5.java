package test;
import java.util.Scanner;

class test{
	static int binSearchX(int[] a, int n, int key) {
		int low = 0;
		int high = n-1;

		do {
			int mid = (low+high)/2;
			int i;
			if(a[mid] == key) {
				for(i=0;a[mid-i]==key;i++);
				mid = mid-(i-1);
				return mid;
			}
			else if(a[mid]<key)
				low = mid + 1;
			else
				high = mid - 1;
		}while(low<high);

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수?: ");
		int num = sc.nextInt();

		int[] x = new int[num];
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();

		for(int i=1;i<num;i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i] = sc.nextInt();
			}while(x[i]<x[i-1]); //x[i]가 x[i-1]보다 작으면 다시 입력
		}

		System.out.print("찾고싶은 값?: ");
		int ky = sc.nextInt();

		int idx = binSearchX(x, num, ky);

		if(idx == -1)
			System.out.println("찾고자 하는 값이 없습니다.");
		else
			System.out.println(ky+"의 맨 앞 요소는 x["+idx+"]에 있습니다. ");

	}
}
