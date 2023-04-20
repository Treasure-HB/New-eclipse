package 폴리랜드;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Input input = new Input();
		Run run = new Run();
		run.InsertOrderList();
		Print print = new Print();
		int peoplecount = 1;
		
		do {
			
		//1.주간 vs 야간
		print.Print1();
		input.setINPUT_TICKET_TIME();
		print.Print1_1();
		
		//2.대인 vs 소인
		print.Print2();
		input.setINPUT_PEOPLE_AGE();
		print.Print2_2();
		
		//3.수량
		print.Print3();
		input.setINPUT_TICKET_COUNT();
		print.Print3_3();
		
		//5. 우대사항
		print.Print5();
		input.setINPUT_PRIORITY();
		print.Print5_5();
	
		//6. 가격
		print.Print4();
		
		//7. 종료
		print.Print7();
		input.setENDOPTION();
		peoplecount ++;
		
		} while(input.getENDOPTION() == ConstValue.ENDOPTION);
		
		System.out.println("dd");
		
		//<OderList - 7> orderlist 메인에서 출력
		print.Print7_7();
		
	}
		




	}


