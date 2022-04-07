package Test1;

public class globalstatic_var {
	

	static int a;// static global variable

	public static void main(String[] args) {
		
		globalstatic_var v=new globalstatic_var();
		v.display();
		System.out.println("value of a is "+a);// calling static global variable from same class
		System.out.println("value of c is "+globalstatic_var1.c);//calling static global variable from another class
		play();
		//System.out.println("value of b is"+v.b);
	}

	
	public void display()
	
	{ a=10;
		int b= 30;//local variable
		int c=b+a;//use of static global var
		
		System.out.println("value of b is "+b); //  local variable
		System.out.println("value of a is "+a); //  using static global variable
		System.out.println("value of c is "+c);
		
	}
	public static  void play() {
		System.out.println("value of static a is "+a);
		
	}

}


