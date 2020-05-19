//별찍기 1번 문제
package test;
import java.util.*;

public class test{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");

		}
		sc.close();
	}
}

//별찍기 2번- 거꾸로찍기
package test;
import java.util.*;

public class test{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//요부분을 3중 for문으로 쓰려다 한참 헤맸다.
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");

		}
		sc.close();
	}
}
