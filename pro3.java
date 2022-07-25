package project1;

public class pro3 {
	static int ib = 20;
	{
		int ia=10;
		//ia는 이 안에서만 사용 가능하다.
	}
	static {
		int ic = 10;
	}
	public static void main(String[] args) {
		System.out.println(ib);
		
		
		int var1;
		int var2;
		if(true) {
			var1 = 10;
			var2 = 20;
			
		}
		{
			int var3;
			var1 = 30;
			var2 = 30;
			var3 = 30;
		}

	}

}
