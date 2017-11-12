package J3_work_1;

public class Car {

	public static double count() {
		
		ComputeWeight[] computeWeight = new ComputeWeight[3];
		computeWeight[0] = new Computer();
		computeWeight[1] = new Television();
		computeWeight[2] = new WashMachine();
		return computeWeight[0].computeWeight()+
				computeWeight[1].computeWeight()+
				computeWeight[2].computeWeight();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Car装载的总重量为："+count());
	}

}
