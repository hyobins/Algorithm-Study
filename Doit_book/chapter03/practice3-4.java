package test;
import java.util.Scanner;
//이진검색 : 전제조건은 정렬상태!

class test{
	static int binSearch(int[] a, int n, int key) {
		int low = 0;
		int high = n-1;

		do {
			int mid = (low+high)/2;
			if(a[mid] == key)
				return mid;
			else if(a[mid] < key)
				low = mid + 1;
			else
				high = mid - 1;
		}while(low<=high);

		return -1; //검색실패
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]:");
		x[0] = sc.nextInt();

		for(int i=1;i<num;i++) {
			do {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
			} while(x[i] < x[i-1]); //바로 앞의 요소보다 작으면 다시 입력
		}

		System.out.print("검색할 값:");
		int ky = sc.nextInt();

		int idx = binSearch(x, num, ky);

		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"는 x["+idx+"]에 있습니다. ");
	}
}
