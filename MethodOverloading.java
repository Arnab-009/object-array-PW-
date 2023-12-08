
public class MethodOverloading {
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public double add(int a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		
		int result1 = obj.add(5, 7);
		
		int result2 = obj.add(3, 5, 8);
		
		double result3 = obj.add(3.44, 8.63);
		
		double result4 = obj.add(5, 2.5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
