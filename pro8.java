package project1;

public class pro8 {
	public static void main(String[] args) {
		
		int x = 10;
		x+=10; // x=x+10
		x-=10;// x=x-10
		x*=10;// x=x*10
		x/=10;// x=x/10
		x%=10;//x=x%10
		
		int result = (x==10)? 1:0;
		
		//비트논리연산자 $ | ^
		
		int bitx = 0x01;
		int bity = 0x01;
		int bitresult = bitx & bity; //0x01
		bitresult = bitx|bity; //0x01
		//논리연산자 && ||
		//true false를 서로간에 연산
		System.out.println((x>10)&&(x<11));
		System.out.println((x>10)||(x<11));
		
		if((x>10) || (x<11)) {
			
		}
	}
}
