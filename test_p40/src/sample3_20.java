
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample3_20 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J�r��");
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br.readLine();
		
		System.out.println("�п�J�n�s�W���r��C");
	
		String str2=br.readLine();
		
		StringBuffer sb=new StringBuffer(str1);
		sb.append(str2);
		
		System.out.println("�b["+str1+"]��s�W["+str2+"]���ܡA�N�|�ܦ�["+sb+"]�C");
	}
}