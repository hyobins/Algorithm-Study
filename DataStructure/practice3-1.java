package test;
import java.util.Scanner;
//선형검색(linear search)
class test{
	//요솟수가 n인 배열 a에서 key와 같은 요소를 선형검색
	static int seqSearch(int[] a, int n, int key) {
		int i=0;

		while(true) {
			if(i==n)
				return -1; //검색 실패
			if(a[i]==key)
				return i; //검색 성공!(인덱스 i 반환)
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];

		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값: ");
		int key = sc.nextInt();

		int idx = seqSearch(x, num, key);
		System.out.print("검색할 값: ");

		if(idx == -1)
			System.out.println(key+"에 해당하는 요소가 없습니다.");
		else
			System.out.println(key+"는 x["+idx+"]에 있습니다.");

 	}
}
