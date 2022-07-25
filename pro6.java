package project1;

public class pro6 {

	public static void main(String[] args) {
		
//		int x = -10;
//		
//		int result = 0;
//		
//		result = -x;
//		
//		result = +x;
//		
//		short s = 100;
//		
//		short results = 0;
//		results = -s;
		//results는 사용못함
		//short의 경우는 -값이 없음.
		
		int x = 10;
		int xr =x++; //xr = 10이고 x = 11
		xr = ++x; //x = 12 xr = 12;
		
		int result = x+10+xr;
		
		result = x-10 -xr;
		
		result = x*10*xr;
		
		result = (x+xr)*10;
		
		result = x/10;
		result = x*10;
		result = x%10;
		
		x=10;
		
		result = (x++) + 10;
		System.out.println(result);
		System.out.println(x);
		x=10;
		result = ++x + 10;
		System.out.println(result);
		
		int sx = 0x01;
		System.out.println(sx <<1);
		System.out.println(sx <<2);
		System.out.println(sx <<3);
		System.out.println(sx <<4);
		System.out.println(sx <<5);
		
		int sx1 = 0x10;
		System.out.println(sx1);
		System.out.println(sx1>>1);
		System.out.println(sx1>>2);
		System.out.println(sx1>>3);
		
		int fx = 10;
		int fy = 20;
		System.out.println(fx>fy);
		if(fx>fy) {
			System.out.println("fx>fy");
		}
		System.out.println(fx<fy);
		
		fx=11;
		fy=11;
		System.out.println(fx==fy);
		fx = 10;
		fy = 20;
		System.out.println(fx>=fy);
		fy = 20;
		System.out.println(fx<=fy);
	}
}
