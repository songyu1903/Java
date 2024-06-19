package b_objectArray;

public class Ex01 {

	public static void main(String[] args) {
//		1차원 배열
		int[] ar = new int[5]; // 5칸 배열

//		다차원 배열 (2차원, 3차원, ...)
		int[][] arr = new int[3][5]; // 가로 5칸 세로 3칸 배열
//		int[][][] arrr = new int[3][5][5];

		arr[1][2] = 3;
		System.out.println(arr[1][2]);

		System.out.println(arr.length);
		System.out.println(arr[0].length);

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println("==============");
		for (int i = 0; i < 3; i++) { 
			System.out.println(arr[i]);
			for(int j = 0; j < 5; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
