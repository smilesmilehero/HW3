package p34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample3_16 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J�@�Ӿ��");
		
		BufferedReader br= 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
	
		int num=Integer.parseInt(str);
		
		System.out.println("�z��J���Ʀr�O:"+num);
	}

}