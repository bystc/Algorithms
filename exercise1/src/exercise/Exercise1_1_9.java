package exercise;
/*
 * 将一个正整数N用二进制表示并转换为一个String类型的值s
 * 
 * 
 * Integer.toBinaryString(N)
 */
public class Exercise1_1_9 {

	public static void main(String[] args) {
		String s="";
		int N=5;
		for(int n=N;n>0;n/=2)
			s=(n%2)+s;
		System.out.println(s);
	}

}
