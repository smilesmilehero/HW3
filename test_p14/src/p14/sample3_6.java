package p14;

public class sample3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1=new Car();
		
		car1.setnum(1234);
		car1.setgas(20.5);
	}

}

class Car
{
	int num;
	double gas;
void setnum(int n)
{
	num=n;
	System.out.println("�N�����]��"+num);
}
void setgas(double g)
{
	gas=g;
	System.out.println("�N�T�o�q�]��"+gas);
}
}