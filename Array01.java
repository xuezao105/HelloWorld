public class Array01 {
	public static void main(String[] args) {
		/*
		 * 它们的体重分别是3kg，5kg，1kg，3.4kg，2kg，50kg。
		 * 请问这六只鸡的总体重是多少？平均体重是多少？
		 * 
		 * 思路分析
		 * 1.定义六个变量double，求和
		 * 2.平均体重 = 总体重/6
		 * 
		 */
		double hen1 = 3;
		double hen2 = 5;
		double hen3 = 1;
		double hen4 = 3.4;
		double hen5 = 2;
		double hen6 = 50;
		double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
		double avgWeight =  totalWeight / 6;
		System.out.println("总体重=" + totalWeight
				+ "平均体重=" + avgWeight);
		
	}
}