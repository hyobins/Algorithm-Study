package test;
import java.util.Scanner;

class test{
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		//정렬이 안되어 있으므로 linear search사용
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]==key) {
				idx[count++] = i;
			}
		}
//		for(int i=0;i<n;i++) {
//			System.out.print(idx[i]);
//		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = sc.nextInt();

		int[] x = new int[num];
		int[] idx = new int[num];

		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}

		System.out.print("찾으려고 하는 KEY?: ");
		int ky = sc.nextInt();

		int result =  searchIdx(x, num, ky, idx);

		if(result == 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(result);

	}
}
