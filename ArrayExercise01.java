public class ArrayExercise01 {
	public static void main(String[] args) {
		/*
		 * 创建一个插入类型的26个元素的数组，放置‘A'-‘Z'。
		 * 
		 * 思路分析
		 * 1.定义一个数组 char[] chars = new char[26]
		 * 2.因为‘A’ + 1 = ‘B' 类推，所以使用for来赋值
		 * 3.使用for循环访问所有元素
		 */
		
		char [] chars = new  char[26];
		for(int i = 0;i < chars.length; i++) {//循环26次
			chars[i] = (char)('A' + i); //'A' + i 是int，需要强制转换
			System.out.println(chars[i] + " ");
			
		}
		
	}
}