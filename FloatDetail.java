public class FloatDetail {
	//编写一个main方法
	public static void main(String[] args) {
		//Java 的浮点型常量（具体值）默认为double型， 声明float型常量，需添加‘f’或‘F’
		//float num1 = 1.1;
		float num2 = 1.1F;    //对
		double num3 = 1.1;    //对
		double num4  = 1.1f;  //对
		double num5 = .123;   //等价0.123
		System.out.println(num5);
		//科学计数法形式：如 ： 5.12e2 []       5.12E-2  []
		System.out.println(5.12e2);//512.0
		System.out.println(5.12E-2);//0.0512
		
		//浮点数使用陷阱： 2.7和 8.1 / 3 比较
		//看看一段代码
		double num11 = 2.7; //2.7
		double num12 = 8.1 / 3.0;//接近2.7 近似值
				System.out.println(num11);
		        System.out.println(num12);
		        //得到一个重要的使用点： 当我们对运算结果是小数的进行相等判断时，要小心
		        //应该是以两个数的差值的绝对值，在某一个精度范围内判断
		        if(num11 == num12) {
		        	System.out.println("相等");
		        	
		        }
		        //正确的写法
		       if(Math.abs(num11 - num12) < 0.0000001) {
		        	System.out.println("差值非常小，到我的规定精度，认为相等");
		        }
		// 可以通过java API 来看 下一个视频介绍如何使用API
		        System.out.println(Math.abs(num11 - num12));
				
	}
}