package p15;

public class sample3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1=new Car();
		
		int number=1234;
		double gasoline=20.5;
		
		car1.setnumgas(number,gasoline);
	}

}

class Car
{
	int num;
	double gas;
	
	void setnumgas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}

void show()
{
	System.out.println("�����O"+num);
	System.out.println("�T�o�q�O"+gas);
}
}