package ��������;

import java.util.Locale;

public class Repeat {
	
	public static String LANGUAGE;
	
	public void Repeat() {
		
			Input input = new Input();
			Run run = new Run();
			Print print = new Print();
			StringValue stringvalue = new StringValue();
			
			//��ǻ�� ���� ����
			Locale currentLacale = Locale.getDefault();
			System.out.println("locale : " + currentLacale.getCountry());
			LANGUAGE = currentLacale.getCountry();

			//Stringvalue �Լ� ����
			stringvalue.startLanguage(getLANGUAGE());
			
			//1.�ְ� vs �߰�
			print.Print_Time();
			input.setINPUT_TICKET_TIME();
			run.Run1();
			
			//2.���� vs ����
			print.Print_Type();
			input.setINPUT_PEOPLE_AGE();
			run.Run2();
			
			//3.����
			print.Print_Count();
			input.setINPUT_TICKET_COUNT();
			run.Run3();
			
			//5. ������
			print.Print_Priority();
			input.setINPUT_PRIORITY();
			run.Run5();
			
			//<OderList - 7> orderlist ����
			run.InsertOrderList();
			
			//7. ����
			print.Print_End();
			input.setENDOPTION();
	
	}

	public static String getLANGUAGE() {
		return LANGUAGE;
	}

	public static void setLANGUAGE(String lANGUAGE) {
		LANGUAGE = lANGUAGE;
	}
	

}
