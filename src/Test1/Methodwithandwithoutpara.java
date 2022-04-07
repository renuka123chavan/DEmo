package Test1;

public class Methodwithandwithoutpara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_info(101, "xyz", 25000);
		Employee_info(102, "pqr", 30000);
		Employee_info(103, "abc", 45000);
		//object craetion
		Methodwithandwithoutpara p=new Methodwithandwithoutpara();
		p.Emp_info();

	}

	public static void Employee_info(int empid,String emp_name,int salary) {
		System.out.println("........Employee Information........ ");
		System.out.println("Employee Id is ="+empid);
		System.out.println("Employee Name is= "+emp_name);
		System.out.println("Employee Salary is ="+salary);
		
		
	}
	public void Emp_info() {
		int emp_id=111;
		String empName="MNO";
		int emp_salary=70000;
		System.out.println("........Employee Information........ ");
		System.out.println("Employee Id is ="+emp_id);
		System.out.println("Employee Name is= "+empName);
		System.out.println("Employee Salary is ="+emp_salary);
		
	}
}
