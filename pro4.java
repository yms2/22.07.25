package project1;

public class pro4 {
	int v1 =10;
	
	
	public void method01() {
		int v1 = 15;
	}
	
	public void method02() {
		v1 = 10;
	}

	public static void main(String[] args) {
		//static으로 정의되어 있기때문에 static으로 정의된 것만 나타낼 수 있다.
		
		int v1 = 15;
		{
			int v2 = 10;
			{
				int v3 = 20;
				System.out.println(v1+v2+v3);
			}
			System.out.println(v1+v2);
		}
		System.out.println(v1);
	}

}
