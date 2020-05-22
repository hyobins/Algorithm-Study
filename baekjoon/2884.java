import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String ans;

		if(A>B) {
			ans = ">";
		}
		else if (A<B) {
			ans = "<";
		}
		else {
			ans = "==";
		}

		sc.close();
		System.out.println(ans);

	}
}
