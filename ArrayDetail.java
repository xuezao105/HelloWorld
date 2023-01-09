public class ArrayDetail {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,60};//double->int 报错
		//数组中的元素可以是任何数据类型，包括基本类型和引用类型
		String[] arr3 = {"北京","jack","milan"};
		//数组创建后，如果没有赋值，有默认值
		//int 0,short0,byte 0, long 0,
		//float 0.0, double 0.0 ,char \u0000,
		//boolean false, String null
		short[] arr4 = new short[3];
		System.out.println("=====数组arr4====");
		for(int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
	}
}