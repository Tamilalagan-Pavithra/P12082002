package Java;

public class AccessModifierProtected {
	protected void Dog() {
		System.out.println("bow bow");	
	}
	protected void Meow() {
		System.out.println("Meow Meow");
	}
}
class Mammels extends AccessModifierProtected{
	public static void main(String args[]) {
		Mammels M = new Mammels();
		M.Dog();
		M.Meow();
	}
}

