package constructor;

class Parent {
	public Parent() {
		System.out.println("Transport");
	}
}
class Child extends Parent {
	public Child() {
		System.out.println("Public transport");
	}
}
class SubChild extends Child {
	public SubChild() {
		System.out.println("bus, tram, train");	
	}
}
class Child1 extends Parent {
	public Child1() {
		System.out.println("Private transport");
	}
}
class SubChild1 extends Child1 {
	public SubChild1() {
		System.out.println("car, bike, motobike");
	}
}
public class Second {
	public static void main(String[] args) {
		
		Parent subchi = new SubChild();		
		System.out.println("*****");
		Parent subchi1 = new SubChild1();		
	}
}
	
 