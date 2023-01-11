public class BubbleSort02 {
	public static void main(String[] args) {
		/*
		 数组 [24,69,80,57,13]
		 第一轮排序：目标把最大数放在最后
		 总共进行4次比较
		 */
		int[] arr = {24, 69, 80, 57, 13, 30, 100, 200};
		int temp = 0;
		
		//使用外层循环包括起来
		for(int i = 0; i < arr.length -1; i++) {//外层循环是arr.length次
			
		
		for(int j = 0; j < arr.length - 1 - i; j++) {//len次比较
			//如果前面的数>后面的数，就交换
			if(arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1]  =  temp;
				
			}
			
		}
		System.out.println("\n==第" + (i + 1) + "轮==");
		for(int j = 0; j < arr.length ; j++) {
			System.out.println(arr[j] + "\t");
		}
		/*
		 第二轮排序：目标第二大数放在倒数第二位置
		 总共进行三次比较
		 
		for(int j = 0; j < 3; j++) {
			if(arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] =temp;
			}
			
		}
		System.out.println("\n==第二轮==");
		for(int j = 0; j < arr.length ; j++) {
			System.out.println(arr[j] + "\t");
		}
		
		//第三轮
		for(int j = 0; j < 2; j++) {
			if(arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j +1];
				arr[j + 1] = temp;
			}
		}
		System.out.println("\n==第四轮==");
		for(int j = 0; j < arr.length; j++) {
			System.out.println(arr[j] + "\t");
		}
		//第四轮
		for(int j = 0; j < 1; j++) {
			if(arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j +1];
				arr[j + 1] = temp;
			}
		}
		System.out.println("\n==第四轮==");
		for(int j = 0; j < arr.length; j++) {
			System.out.println(arr[j] + "\t");
		}
		*/
		}
	}
}