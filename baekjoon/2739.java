package test;
import java.util.Scanner;

public class test{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i;
		for(i=1; i<10; i++) {
			System.out.println(N+" * "+i +" = "+  N*i);
		}
		sc.close();
	}
}
