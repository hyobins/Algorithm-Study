package test;
import java.util.Random;
import java.util.Scanner;

//Array선언 및 할당
//int[] a = new int[크기]

class test{
	//배열 a의 최댓값 구하여 반환하는 method
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		//Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of people: ");
		int num = rand.nextInt();

		int[] height = new int[num];
		for(int i=0;i<height.length;i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("Height["+i+"] : "+height[i]);
		}
		System.out.println("Max of height is: "+maxOf(height)+".");
	}
}
