//某人有100000元，每经过一次路口，需要缴费，规则如下：
//1）当现金>50000时，每次交5%
//当现金<= 50000时，每次交1000
//编程计算该人可以经过多少次路口，要求：使用while break 方式完成
//思路分析：
//1）定义double money 保存100000
//2）money > 50000; money>= 1000 && money <=50000 ; money < 1000
//3）使用多分支 if- else if-else
//4）while+break[money < 1000],同时使用一个变量count来保存通过路口
//代码实现
//代码实现
public class Homework001 {
	
	public static void main(String[] args) {
		double money = 100000;
		int count = 0;//累积过的路口
		while(true) {
			if(money > 50000) {
				money *= 0.95;//过了这个路口后，还有多少钱
				count++;
			}else if(money > 1000) {
				money -= 1000;
				count++;
			}else { //钱不够
				break;
			}
			
		}
		
	System.out.println( "100000可以过" + count + "个路口");
	}
	
}
