package test;

class test{
	public static void main(String[] args) {
		int counter = 0; //나눗셈 횟수
		int ptr = 0; //찾은 소수 개수
		int[] prime = new int[500]; //찾은 소수 저장

		//2와 3은 소수임
		prime[ptr++] = 2;
		prime[ptr++] = 3;

		for(int n=5;n<=1000;n+=2) {
			boolean flag = false;
			for(int i=1;prime[i]*prime[i]<=n;i++) {
				counter += 2; //바로 위 곱셈과 바로 아래 나눗셈 계산횟수 카운팅
				if(n%prime[i] == 0) { //나누어 떨어지면 소수가 아님
					flag = true;
					break;
				}
			}
			if(!flag) {//계속 flag = false 상태에서 변하지 않았음. 즉 마지막까지 나누어 떨어지지 않음
				prime[ptr++] = n;
				counter++; //prime[i]*prime[i]<=n 이 성립하지 않는 경우,
							//곱셈은 한번 시행됐지만 카운팅이 되지 않았기에 여기서 +1해
			}
		}

		//찾은 ptr개의 소수를나타냄
		for(int i=0;i<ptr;i++)
			System.out.println(prime[i]);

		System.out.println("나눗셈을 실행한 횟수: "+counter);
	}
}
