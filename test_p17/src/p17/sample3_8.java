package p17;

public class sample3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1=new Car();
		car1.setnumgas(1234,20.5);
		int number =car1.getnum();
		double gasoline=car1.getgas();
		System.out.println("�լd�˫~���ɱo��");
		System.out.println("�����O"+number+",�T�o�q�O"+gasoline);
	}
}

class Car
{
	int num;
	double gas;
	int getnum()
	{
	System.out.println("�լd����");
	return num;
	}
	double getgas()
	{
		System.out.println("�լd�T�o�q");
		return gas;
	}
	void setnumgas(int n,double g)
	{
	num=n;
	gas=g;
	System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
}