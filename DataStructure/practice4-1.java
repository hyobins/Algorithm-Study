package test;

public class IntStack {
	private int max; //스택의 용량
	private int ptr; //스택에 쌓여있는 데이터 수
	private int[] stk;

	//실행 시 예외: 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}

	//실행 시 예외: 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}

	//생성자
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try { //try 블록 안에서 예외(에러)가 발생하면 그 시점에서 코드 실행 중
			stk = new int[max];
		}catch (OutOfMemoryError e) { //발생된 예외의 종류가 ()안에서 지정된 예외와 일치하면 그 안의 코드실
			max = 0;
		}
	}

	public int push(int x) throws OverflowIntStackException{
		if(ptr>=max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}

	public int pop() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	//스택의 맨 꼭대기 데이터
	public int peek() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}

	//스택에서 x를 찾아 인덱스반환(없으면 -1)
	public int indexOf(int x) {
		for(int i=ptr-1;i>=0;i--)
			if(stk[i] == x)
				return i;
		return -1;
	}

	//스택을 비움
	public void clear() {
		ptr = 0;
	}

	//스택의 용량을 반환
	public int capacity() {
		return max;
	}

	//스택에 쌓여있는 데이터 수 반환
	public int size() {
		return ptr;
	}

	//스택이 비어있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	//스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}

	//스택안의 모든 데이터를 바닥 -> 꼭대기 순으로 출력
	public void dump() {
		if(ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for(int i=0;i<ptr;i++)
				System.out.print(stk[i]+" ");
			System.out.println();
		}
	}
}
