package 폴리랜드;

import java.util.Locale;

public class Repeat {
	
	public static String LANGUAGE;
	
	public void Repeat() {
		
			Input input = new Input();
			Run run = new Run();
			Print print = new Print();
			StringValue stringvalue = new StringValue();
			
			//컴퓨터 나라 설정
			Locale currentLacale = Locale.getDefault();
			System.out.println("locale : " + currentLacale.getCountry());
			LANGUAGE = currentLacale.getCountry();

			//Stringvalue 함수 시작
			stringvalue.startLanguage(getLANGUAGE());
			
			//1.주간 vs 야간
			print.Print_Time();
			input.setINPUT_TICKET_TIME();
			run.Run1();
			
			//2.대인 vs 소인
			print.Print_Type();
			input.setINPUT_PEOPLE_AGE();
			run.Run2();
			
			//3.수량
			print.Print_Count();
			input.setINPUT_TICKET_COUNT();
			run.Run3();
			
			//5. 우대사항
			print.Print_Priority();
			input.setINPUT_PRIORITY();
			run.Run5();
			
			//<OderList - 7> orderlist 실행
			run.InsertOrderList();
			
			//7. 종료
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
