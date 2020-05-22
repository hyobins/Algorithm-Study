import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);

		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();

      //while문 안에 break넣어서 true를 false로 만들기. 왜 do~while은 안되었는지 로직확인
			if(A==0 && B==0) {
				break;
			}
            System.out.println(A+B);
		}


		sc.close();
	}
}
