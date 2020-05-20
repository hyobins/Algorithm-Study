package test;
import java.util.*;

public class test{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] num = new int[N]; //배열의 크기 선언

		for(int i=0;i<N;i++) {
			num[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			if(num[i] < X) {
				System.out.print(num[i]+" ");
			}
		}

		sc.close();
	}
}
