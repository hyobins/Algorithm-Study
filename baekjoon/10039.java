package test;
import java.util.*;

public class test{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);

		//배열을 만들어주기
		int test[] = new int[5];
		int sum = 0;

		for(int i=0; i<5; i++) {
			test[i] = sc.nextInt();

			if(test[i] < 40) test[i] = 40;
			sum = sum + test[i];
		}

		System.out.print(sum/5);
	}
}
