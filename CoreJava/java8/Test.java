package java8;

public class Test implements StaticDefault{

	@Override
	public void hello() {
		
		
		
	}
	
	public static void main(String[] args) {
		Test obj = new Test();
		
		obj.dispalyMsg();
		
		StaticDefault.display();
	}

}
