package 폴리랜드;

import java.io.IOException;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		Repeat repeat = new Repeat();
		Input input = new Input();
		Print print = new Print();
		GetData getdata = new GetData();
		
		//어떤프로그램선택
		print.Print_Program();
		input.setINPUT_CHOICE(); //getInput이 아직 0이니까 set으로 다시 설정함
		
		if(input.getINPUT_CHOICE() == 1) {
			do {
				repeat.Repeat();
			} while(input.getENDOPTION() == ConstValue.ENDOPTION);
			
			print.Print_receiptTitle();
			print.Print_Orderlist();
			print.Print_Total();
		}
		else {
			//매출분석(저장만)
			try {
				getdata.getCsv();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//매출분석 (가져오기)
			try {
				getdata.readCsv();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}