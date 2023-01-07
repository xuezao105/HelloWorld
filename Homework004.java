public class Homework004 {
	
	public static void main(String[] args) {
		
		/*
		 * 输出1-100之间不能被5整除的数，每五个一行
		 * 
		 * 思路分析
		 * 1.先输出1-100的所有数
		 * 2.然后过滤输出不能被5整除的数 i % 5 != 0
		 * 3.每5个一行，我们使用 int count 统计输出的个数，当count%5就说明
		 * 输出了5个，这时，我们输出一个换行即可控制
		 * 代码实现
		 */
		int count = 0;//统计输出的个数
		for(int i = 1; i <= 100; i++) {
			if(i % 5 != 0) {
				count++;
				System.out.println(i + "\t");
				//判断,每满5个就输出一个换行
				if(count % 5 == 0) {
					System.out.println( );
				}
			}
		}
		
	}
	
	}