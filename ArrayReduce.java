import java.util.Scanner;
public class ArrayReduce {
	public static void main(String[] args) {
		
		/*
		思路分析
		 1.定义初始数组 int[] arr = {1,2,3,4,5}
		 2.定义一个新的数组。int[] arrNew = new int[arr.length - 1]
		 （arr[3] = 4;下标必须在有效范围内。）
		 3.遍历arr 数组，依次将arr 的元素拷贝到arrNew数组
		 4.让arr指向arrNew；arr = arrNew;那么原来arr数组被销毁
		 5.创建一个Scanner可以接受用户输入
		 7.因为用户什么时候退出，不确定，使用do-while + break来控制
		 */
		Scanner myScanner = new Scanner(System.in);
	do {
		int[] arr = {1, 2, 3, 4, 5};
		int[] arrNew = new int[arr.length - 1];
		for(int i = 0; i < arr.length - 1; i++) {
			arrNew[i] = arr[i];
			
		}
		arr = arrNew;
	
		//输出arr，看看效果
		System.out.println("====arr缩减后元素情况====");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//问用户是否继续
		System.out.println("是否继续缩减 y/n");
		char key = myScanner.next().charAt(0);
		if(key == 'n') {//如果输入n就结束
			System.out.println("你已退出了添加...");
		break;
		}
	 else if(arr.length == 1);
	System.out.println("只有一个元素，不能再缩减...");
	break;
	
	}while(true);
}
	
}	