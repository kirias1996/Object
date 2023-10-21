package jp.co.sutaruhin.company.entity;

public class GetterSetterSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Employee employee = new Employee();
		employee.setEmployeeName("大島");

        String empName = employee.getEmployeeName();
        System.out.println(empName);
	}

}
