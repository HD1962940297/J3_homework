package J3_work_2;

public class Graduate implements StudentManageInterface,TeacherInterface {

	private String name;
	private String sex;
	private int age;
	private int fee;
	private int pay;
	private static double count_pay=0;
	private static double count_fee=0;
	
	Graduate(String name) {
		
		this.name=name;
	}
	
	@Override
	public void setPay(int pay) {

		this.pay=pay;
	}
	@Override
	public double getPay() {

		return 200;
	}
	@Override
	public void setFee(int fee) {

		this.fee=fee;
	}
	@Override
	public double getFee() {

		return 2000;
	}
	
	public static void main(String[] args) {
		
		Graduate graduate = new Graduate("zhangsan");
		count_pay = graduate.getPay();
		count_fee = graduate.getFee();
		if ((count_pay-count_fee)<2000) {
			
			System.out.println("provide a loan");
		}
	}
}
