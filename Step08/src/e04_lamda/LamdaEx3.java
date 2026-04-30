package e04_lamda;

public class LamdaEx3 {
	public static <T> void run(Method<T> m, T a, T b) {
		System.out.println(m.run(a, b));
	}
	public static void main(String[] args) {
		Method<Integer> m1 = (a,b) -> a + b;
		Method<String> m2 = (a,b) -> a + b;
		Method<Double> m3 = (a,b) -> a + b;
		
		System.out.println(m1.run(5, 2));
		System.out.println(m2.run("s", "5"));
		System.out.println(m3.run(5.14, 2.45));
		
		run((a,b)-> a - b, 10, 20);
		run((a,b)-> a + b, 10.5, 20.2);
		run((a,b)-> a + b, "Hello", "World");
	}

}





