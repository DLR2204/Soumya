package java8;

interface StaticDefault {
	
	public static void display() {
		
		System.out.println("Hi Everyone!!!!");
	}
	
	default void dispalyMsg() {
		
		System.out.println("Hello everyone ,Im from default");
	}
	
	public abstract void hello();

}
