package java8;

@FunctionalInterface
interface Calculator {

	public abstract void add(int a, int b);
}

public class MethodRefEx {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator1()::add;
		
		obj.add(2, 10);
		
	}
}
