package test;
import java.util.Scanner;
//Linear Search (sentinel method)

class test{
	static int seqSearchPrint(int[] a, int n, int key) {
		int i;
		System.out.print("   | ");
		for(int k=0;k<n;k++) System.out.print(k+"   ");
		System.out.println("\n---+-------------------------------------");
		for(i=0;i<n;i++) {
			System.out.print("   |");
			for(int j=0;j<=4*i;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
			System.out.print("  "+i+"| ");
			for(int l=0;l<n;l++) {
				System.out.print(a[l]+"   ");
			}
			System.out.println();
			if(a[i] == key)
				return i;
		}
		return -1;
	}

	static int answer(int[] a, int n, int key) {
		System.out.print("   |");
		for(int k=0;k<n;k++)
			System.out.printf("%4d",k);
		System.out.println();

		System.out.print("---+");
		for(int k=0;k<4*n+2;k++)
			System.out.print("-");
		System.out.println();

		for(int i=0;i<n;i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n",(i*4)+3),"");
			System.out.printf("%3d|",i);
			for(int k=0;k<n;k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if(a[i]==key)
				return i;
		}
		return -1;
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

//		int idx = seqSearchPrint(x, num, ky);
		int idx = answer(x, num, ky);
		if(idx == -1)
			System.out.println("배열 x에는 "+ky+"이(가) 없습니다.");
		else
			System.out.println(ky+"는 x["+idx+"]에 있습니다.");
		}
}
