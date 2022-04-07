package Test1;

public class Const_demo {
	String name="akshay";//
	public Const_demo() {
		name="renuka";
		
	} public Const_demo( int a) {
		//a=10;
		System.out.println("value of a"+a);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Const_demo d=new Const_demo();
		d.demo5();
		Const_demo c=new Const_demo(20);
		

	}
	 public  void demo5() {
		  System.out.println("name is "+name);
		  

  
}
}
