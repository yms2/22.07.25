package project1;


public class pro1 {

	public static void main(String[] args) {
		
		
		byte bt1 = 10;
		int i1 = 20;
		
		bt1 = (byte) i1;
//		i1을 byte로 나타내기 위해 (byte)를 사용함.
		i1 = bt1;
		//int에는 byte가 들어가지지만 byte에는 int가 들어가지 않는다.
		
		int var1 = 10; //10진수
		int var2 = 010;//8진수
		int var3 = 0x10;//16진수
		int var4 = 0b0010;//2진수
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(Integer.toBinaryString(var4));
		
		int result = 0;
		result = var1+var2+var3+var4;
		System.out.println(result);
	}

}
