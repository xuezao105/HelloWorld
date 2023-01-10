import java.util.Scanner;
public class ArrayAdd02 {
	public static void main(String[] args) {
		
		/*
		 要求：实现动态的给数组添加元素效果，实现对数组扩容
		 1.原始数据使用静态分配 int[] arr ={1, 2, 3}
		 2.增加的元素4， 直接放在数组的最后 arr = {1,2,3,4}
		 3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
		 
		 思路分析
		 1.定义初始数组 int[] arr = {1,2,3}
		 2.定义一个新的数组。int[] arrNew = new int[arr.length + 1]
		 （arr[3] = 4;下标必须在有效范围内。）
		 3.遍历arr 数组，依次将arr 的元素拷贝到arrNew数组
		 4.将4赋给arrNew[arrNew.length - 1] = 4; 把4赋给最后一个元素
		 5.让arr指向arrNew；arr = arrNew;那么原来arr数组被销毁
		 6.创建一个Scanner可以接受用户输出
		 7.因为用户什么时候退出，不确定，使用do-while + break来控制
		 */
		Scanner myScanner = new Scanner(System.in);
	do {
		int[] arr = {1,2,3};
		int[] arrNew = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
			
		}
		System.out.println("请输入你要添加的元素");
		int addNum = myScanner.nextInt();
		//把addNum赋给arrNew最后一个元素
		arrNew[arrNew.length - 1] = addNum;
		//让arr 指向 arrNew
	
		arr = arrNew;
		//输出arr，看看效果
		System.out.println("====arr扩容后元素情况====");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//问用户是否继续
		System.out.println("是否继续添加 y/n");
		char key = myScanner.next().charAt(0);
		if(key == 'n') {//如果输入n就结束
		break;
		}
	}while(true);
	System.out.println("你已退出了添加...");
	}
}	