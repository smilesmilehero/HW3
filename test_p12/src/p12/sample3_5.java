package p12;

public class sample3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1=new Car();
		
		car1.num=1234;
		car1.gas=20.5;
		
		car1.showCar();
	}

}

class Car
{
	int num;
	double gas;
void show()
{
	System.out.println("�����O"+this.num);
	System.out.println("�T�o�q�O"+this.gas);
}

void showCar()
{
	System.out.println("�ͨ���ܨ��l���");
	show();
}
}