package test;
import java.util.*;

public class test{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for(int i=1;i<=N;i++) { //1 ~ N
			for(int j=0;j<i;j++) System.out.print("*");
			System.out.println();
		}
		for(int i=N-1;i>0;i--) { // N+1 ~ 2N-1 행
			for(int j=0;j<i;j++) System.out.print("*");
			System.out.println();
		}
	}
}
