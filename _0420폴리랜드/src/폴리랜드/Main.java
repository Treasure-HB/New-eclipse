package ��������;

import java.io.IOException;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		Repeat repeat = new Repeat();
		Input input = new Input();
		Print print = new Print();
		GetData getdata = new GetData();
		
		//����α׷�����
		print.Print_Program();
		input.setINPUT_CHOICE(); //getInput�� ���� 0�̴ϱ� set���� �ٽ� ������
		
		if(input.getINPUT_CHOICE() == 1) {
			do {
				repeat.Repeat();
			} while(input.getENDOPTION() == ConstValue.ENDOPTION);
			
			print.Print_receiptTitle();
			print.Print_Orderlist();
			print.Print_Total();
		}
		else {
			//����м�(���常)
			try {
				getdata.getCsv();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//����м� (��������)
			try {
				getdata.readCsv();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}