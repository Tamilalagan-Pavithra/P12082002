package Java;

public class Static {   //class
	static int s=5;     //static variable
	static int b;
	static void s1() {    // static method
	    int st=0;
		System.out.println(1);
		System.out.println(st);
	}
	static{              //static block
		b=s/2;
	}

	public static void main(String[] args) {
		s1();   //calling the method
		System.out.println(b);
	}

}
