public class TwoDimensionalArray {
	public static void main(String[] args) {
		
		/*
		 请用二维数组输出如下图形
		 0 0 0 0 0 0
		 0 0 1 0 0 0
		 0 2 0 3 0 0
		 0 0 0 0 0 0
		 */
		// 什么是二维数组；
		//1.从定义形式上看int[][]
		//2.原来的一维数组的每个元素是一维数组，这样便构成了二维数组
		
		int[][] arr = { {0, 0, 0, 0, 0, 0},
		                {0, 0, 1, 0, 0, 0},
		                {0, 2, 0, 3, 0, 0},
		                {0, 0, 0, 0, 0, 0} };
		System.out.println("二维数组的元素个数=" + arr.length);
		System.out.println("第3个一维数组的第4个值=" + arr[2][3]);//3
		//输出二维图形
		for(int i = 0; i < arr.length; i++) {//遍历二维数组的每个元素
			//解读
			//1.arr[i] 表示二维数组的第i + 1 个元素，比如arr[0]:二维数组的第一个元素
			//2.arr[i].length得到 对应的每个一维数组的长度
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");//输出了二维数组
				
			}
			System.out.println();//换行
			
		}
		      
	}	
}