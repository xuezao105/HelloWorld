public class Homework002 {
	
	public static void main(String[] args) {
		
		
		/*
		 *判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，
		 *其各个位上数字立方和等于其本身。
		 *例如：153 = 1*1*1 + 3*3*3 + 5*5*5
		 *
		 *思路分析
		 *1.比如 int n =153;
		 *2.先得到n的百位，十位，个位的数字，使用if 判断他们的立方和是否相等。
		 *3.n的百位 = n / 100
		 *4.n的十位 = n%100 /10
		 *5.n的个位 = n%10
		 *6.判断即可
		 */
		int n = 153;
		int n1 = 153 / 100;
		int n2 = 153 % 100 /10;
		int n3 = 153 % 10;
		if(n1 * n1 * n1 + n2 * n2 *n2 + n3 *n3 * n3 == n) {
			System.out.println(n + "是水仙花数");
		}else {
			System.out.println(n + "不是水仙花数");
		}
	}
	
	}