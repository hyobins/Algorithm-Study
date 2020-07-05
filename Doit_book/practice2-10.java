package test;

class test{
	public static void main(String[] args) {
		int counter = 0; //나눗셈 횟수
		int ptr = 0; //찾은 소수 개수
		int[] prime = new int[500]; //찾은 소수 저장

		prime[ptr++] = 2;

		for(int n=3;n<=1000;n+=2) {
			int i;
			for(i=1;i<ptr;i++) {
				counter++;
				if(n%prime[i] == 0) //나누어 떨어지면 소수가 아님
					break;
			}
			if(ptr == i) //바로 위 for문을 끝까지 갔다면, 그 n은 소수
				prime[ptr++] = n;
		}

		//찾은 ptr개의 소수를나타냄
		for(int i=0;i<ptr;i++)
			System.out.println(prime[i]);

		System.out.println("나눗셈을 실행한 횟수: "+counter);
	}
}
