package test;
import java.util.Scanner;
import java.util.Arrays;

class test {
	static int countOf(int[] arr, int value) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == value)
				count++;
		}
		return count;
	}

	static int hasValue(int[] arr, int value) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) return 0;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"]: ");
			arr[i] = sc.nextInt();
		}

		int[] result = new int[num];
		int[] dup = new int[num];
		int r = 0;
		int d = 0;
		int count=0;

		for(int i=0;i<num;i++) {
			if(hasValue(dup, arr[i])<0) { //dup안에 arr[i]의 값이 존재하지 않으면
				dup[d++] = arr[i];
				if(countOf(arr,arr[i])>1) {
					result[r++] = countOf(arr, arr[i]);
				}
			}
		}

		//깔끔한 출력
		for(int i=0;result[i]>0;i++) count++;

		int[] printArr = new int[count];
		for(int i=0;i<count;i++) {
			printArr[i] = result[i];
		}

		System.out.println(Arrays.toString(printArr));

	}
}
