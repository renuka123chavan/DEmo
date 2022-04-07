package Test1;

public class nonstatic_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method is running");
    nonstatic_method s=new nonstatic_method();
    s.show();
    
	}
	public void show() {
		System.out.println("show method is running");
	}

}
