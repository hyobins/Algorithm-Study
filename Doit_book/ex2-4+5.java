package test;
import java.util.Scanner;

class test{
	static boolean equals(int[] a, int[] b) { //배열 a,b가 같은지 판단하는 method
		//First, compare the length of Array
		if(a.length!=b.length) return false;

		//Second, compare the component of Array.
		//만약 중간에 하나라도 다르면 그자리에서 false를 return해주면서 메서드를 종료할 수 있음.
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) return false;
		}
		return true;
	}

	static void copy(int[] a, int[] b) {//배열 b의 모든 요소를 배열 a에 복사하는 method
		int num = (a.length <= b.length) ? a.length : b.length; //작은쪽에 맞추기
		for(int i=0;i<num;i++) {
			a[i] = b[i];
		}

		System.out.println("Array b is copied to a");
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]: "+a[i]);
		}
	}

	static void rcopy(int[] a, int[] b) {
		int num = (a.length <= b.length) ? a.length : b.length;
		for(int i=0;i<num;i++) {
			a[i] = b[b.length-1-i]; //b array의 끝에서부터 역순이니까 b의 길이 기준!
		}
		System.out.println("Array b is revered copied to a");
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]: "+a[i]);
		}
	}

	public static void main(String[] args) {
		//Now, create two Array
		Scanner sc = new Scanner(System.in);
		//Array a
		System.out.print("Number of Array a:");
		int numa = sc.nextInt();
		int[] a = new int[numa];
		for(int i=0;i<numa;i++) {
			System.out.print("a["+i+"]: ");
			a[i] = sc.nextInt();
		}
		//Array b
		System.out.print("Number of Array b:");
		int numb = sc.nextInt();
		int[] b = new int[numb];
		for(int i=0;i<numb;i++) {
			System.out.print("b["+i+"]: ");
			b[i] = sc.nextInt();
		}

		System.out.print("Array a and b is " +
						(equals(a,b) ? "same."
								: "different.")+"\n");



		//연습문제 tester

		while(true) {
			System.out.print("copy/rcopy: ");
			String ans = sc.nextLine();
			if(ans.equalsIgnoreCase("copy")) {
				copy(a,b);
				break;
			}
			else if(ans.equalsIgnoreCase("rcopy")) {
				rcopy(a,b);
				break;
			}
		}



	}



}
