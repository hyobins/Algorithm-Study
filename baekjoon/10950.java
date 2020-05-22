package test;
import java.util.Scanner;

public class test{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, A, B;
		for(i=0; i<n; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A+B);
		}
		sc.close();
	}
}
