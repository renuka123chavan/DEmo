package Test1;

public class variable_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 variable_type t=new variable_type();
 t.m3();
 m4();
	}
      public void m3() {
    	  int a=10;//local non static variable
    	  System.out.println("value of a is"+a);
    	  
      }
      
      public static void m4() {
    	   int b=10;//local non static variable
    	   //int c=b+a;
    	  System.out.println("value of a is"+b);
    	 // System.out.println("value of a is"+t.a);
    	  
      }
}
