package test;
import java.util.Scanner;
//신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함

class test{
	static final int VMAX = 21; //시력분포(0.0에서 0.1단위로 21개)

	static class PhyData{
		String name;
		int height;
		double vision;

		//생성자 : instance의 초기화를 위해 사용됨
		PhyData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	//키의 평균값을 구함
	static double aveHeight(PhyData[] dat) {
		double sum = 0;

		for(int i=0;i<dat.length;i++) {
			sum += dat[i].height;
		}
		return sum/dat.length;
	}

	//시력 분포를 구함
	static void distVision(PhyData[] dat, int[] dist) {
		int i=0;
		dist[i] = 0;

		for(i=0;i<dat.length;i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX/10.0)
				dist[(int)(dat[i].vision * 10)]++; //dat[i].vistion이 double이라 형변환을 위해 (int)써줌
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhyData[] x = {
				new PhyData("박현규", 162, 0.3),
				new PhyData("함진아", 173, 0.7),
				new PhyData("최윤미", 175, 2.0),
				new PhyData("홍연의", 171, 1.5),
				new PhyData("이수진", 168, 0.4),
				new PhyData("김영준", 174, 1.2),
				new PhyData("박용규", 169, 0.8),
		};
		int[] vdist = new int[VMAX];

		System.out.println("*신체검사리스트*");
		System.out.println("이름     키    시력");
		System.out.println("-----------------");
		for (int i=0;i<x.length;i++) {
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}

		System.out.printf("\n평균 키: %5.1fcm\n", aveHeight(x));

		distVision(x,vdist);

		System.out.println("시력분포");
		for(int i=0;i<VMAX;i++) {
			System.out.printf("%3.1f~:%2d\n", i/10.0, vdist[i]);
		}
	}
}
