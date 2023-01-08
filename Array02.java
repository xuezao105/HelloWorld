public class Array02 {
	public static void main(String[] args) {
		
		double[] hens = {3, 5, 1, 3.4, 2, 50,};
		//遍历数组得到数组的所有元素的和，使用for
		//解读
		//1.我们可以通过hens[下标] 来访问数组的元素
		//下标是从0开始编号的比如第一个元素就是 hens[0]
		//第2个元素就是hens[1] , 依次类推
		//2.通过for就可以循环的访问，数组的元素/值
		//3.使用一个变量 totalWeight 将各个元素累积
		//提示：可以通过数组名.length 得到数组的打下/长度
		
		System.out.println("===使用数组解决===");
		
		//System.out.println("数组的长度=" + hens.length);
		double totalWeight = 0;
		for(int i = 0; i < hens.length; i++) {
			//System.out.println("第" + (i+1) + "个元素的值=" + hens[i]);
			totalWeight += hens[i];
		}
		System.out.println("总体重=" + totalWeight 
				+ "平均体重=" + (totalWeight/hens.length));
	}
	
	}