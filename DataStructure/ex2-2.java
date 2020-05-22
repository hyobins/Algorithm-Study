package test;
//import java.util.Random;
import java.util.Scanner;

//Array선언 및 할당
//int[] a = new int[크기]

class test{
	static void swap(int[] a, int idx1, int idx2) {
		//매개변수 t를 두기
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void reverse(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			//a[i]와 a[n-1-i]을 교환
			swap(a, i, a.length-1-i);
			System.out.println("a[" + i + "] 과(와) a[" + (a.length-1-i) + "] 를 교환합니다."+ "\n");
			for(int j=0;j<a.length;j++) {
				System.out.print(a[j]+" ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}

		reverse(a);

//		for(int i=0;i<n;i++) {
//			System.out.print(a[i]+" ");
//		}
	}


}
