import java.util.Scanner;
public class Array04 {
	public static void main(String[] args) {
		double scores[] ;//声明数组， 这时 scores 是 null
		scores = new double[5];//分配内存空间，可以存放数据
		//2.循环输入
		//scores.length表示数组的大小/长度
		Scanner myScanner = new Scanner(System.in);
		for(int i =0; i < scores.length; i++) {
			System.out.println("请输入第"+ (i + 1) + "个元素的值");
			scores[i] = myScanner.nextDouble();//从键盘上输入的数放到数组里。
				}
			//输出，遍历数组
			System.out.println("===数组的元素/值的情况如下：===");
			for(int i =0; i < scores.length; i++) {
				System.out.println("第"+ (i + 1) + "个元素的值=" + scores[i]);
			}
	}
}