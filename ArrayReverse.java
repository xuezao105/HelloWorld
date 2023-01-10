public class ArrayReverse {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {11, 22, 33, 44, 55, 66};
		//思路
		//1。把 arr[0] 和arr[5]进行交换
		//2.把 arr[1] 和arr[4]进行交换
		//3.把 arr[2] 和arr[3]进行交换
		//4.一共交换3次 = arr.length / 2
		//5.每次交换时，对应的下标时 arr[i] 和 arr[arr.length - 1 -i]
		int temp = 0;
		int len = arr.length;//计算数组的长度
		for(int i = 0; i < len / 2; i++) {
		    temp = arr[len - 1 - i];
			arr[len - 1 - i] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("===翻转后数组===");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");//66,55,44,33,22,11
		}
	}
}