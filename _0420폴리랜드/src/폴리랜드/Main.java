package ��������;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Input input = new Input();
		Run run = new Run();
		run.InsertOrderList();
		Print print = new Print();
		int peoplecount = 1;
		
		do {
			
		//1.�ְ� vs �߰�
		print.Print1();
		input.setINPUT_TICKET_TIME();
		print.Print1_1();
		
		//2.���� vs ����
		print.Print2();
		input.setINPUT_PEOPLE_AGE();
		print.Print2_2();
		
		//3.����
		print.Print3();
		input.setINPUT_TICKET_COUNT();
		print.Print3_3();
		
		//5. ������
		print.Print5();
		input.setINPUT_PRIORITY();
		print.Print5_5();
	
		//6. ����
		print.Print4();
		
		//7. ����
		print.Print7();
		input.setENDOPTION();
		peoplecount ++;
		
		} while(input.getENDOPTION() == ConstValue.ENDOPTION);
		
		System.out.println("dd");
		
		//<OderList - 7> orderlist ���ο��� ���
		print.Print7_7();
		
	}
		




	}


