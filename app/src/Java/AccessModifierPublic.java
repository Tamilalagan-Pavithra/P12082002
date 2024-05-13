package Java;

public class AccessModifierPublic {
	public static void main(String args[]) {
		Animal A = new Animal();
		A.Dog();
		A.Meow();
	}
	}
class Animal{
		public void Dog() {
			System.out.println("bow bow");	
		}
		public void Meow() {
			System.out.println("Meow Meow");
		}
	}