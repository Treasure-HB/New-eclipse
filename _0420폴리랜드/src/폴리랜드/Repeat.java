package ��������;

public class Repeat {
	
	public void Repeat() {
			Input input = new Input();
			Run run = new Run();
			Print print = new Print();
		
			//1.�ְ� vs �߰�
			print.Print1();
			input.setINPUT_TICKET_TIME();
			run.Run1();
			
			//2.���� vs ����
			print.Print2();
			input.setINPUT_PEOPLE_AGE();
			run.Run2();
			
			//3.����
			print.Print3();
			input.setINPUT_TICKET_COUNT();
			run.Run3();
			
			//5. ������
			print.Print5();
			input.setINPUT_PRIORITY();
			run.Run5();
			
			//<OderList - 7> orderlist ����
			run.InsertOrderList();
			
			//7. ����
			print.Print7();
			input.setENDOPTION();
	
	}
	

}
