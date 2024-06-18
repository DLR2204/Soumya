package java8;

@FunctionalInterface
interface Flower{
	
	public abstract void flower(String name);
	
	
}

class Rose implements Flower{

	@Override
	public void flower(String name) {
		System.out.println("The flower name is:- "+name);
		
	}
	
}

public class Lambda {
	
	public static void main(String[] args) {
		
		Rose obj =new Rose();
		
		obj.flower("rose");  //calling interface method using child implememtation
	
//Contr overriding to intialize interface obj
		
		
		Flower intfcobj =  new Flower() {

			@Override
			public void flower(String name) {
			System.out.println("The name of the flower is:- "+name);	
				
			}};
			
			intfcobj.flower("tulips");//calling interface method using interface constr overriding
		
//Lambda expressions:-  ()->{}
			
		Flower obj2 = name->System.out.println("The flower has a name which is:- "+name);
			
		obj2.flower("Jasmine");
			
			
		
			
			
			
	}

}
