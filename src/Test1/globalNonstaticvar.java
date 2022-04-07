package Test1;

public class globalNonstaticvar {
	int b=50;//non static global var

	public static void main(String[] args) {
		globalNonstaticvar non=new globalNonstaticvar();
		non.show();
		non.show1();
		show2();
		System.out.println("value of b is="+non.b);
		globalNonstaticvar1 var=new globalNonstaticvar1();//object creation of another class
		System.out.println("value of s is "+var.s);//calling non static global variable of another class

	}
	public void show() {
		int c=40;//local var
		//globalNonstaticvar m=new globalNonstaticvar();
		//int l=c+b;
		//System.out.println("value of l is "+l);
		System.out.println("value of c is "+c);
		System.out.println("value of b is "+b);//use non static global variable in nonstatic method
	}
	public void show1() {
		int f=35;//local var
		System.out.println("value of f is "+f);
		System.out.println("value of b is "+b);//use non static global variable in nonstatic method
	}
	public static void show2() {
		//globalNonstaticvar m=new globalNonstaticvar();
		//System.out.println("value of b is"+b);//use non static global var in static method
		//
		//System.out.println("value of  static b is"+m.b);//use non static global variable in static method 
		System.out.println("static method is running");
	}
	

}
