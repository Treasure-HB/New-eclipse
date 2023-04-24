package 폴리랜드;

import java.util.Locale;

public class Main {
	
	
	
	
	public static void main(String[] args) {
		
		Repeat repeat = new Repeat();
		Input input = new Input();
		Run run = new Run();
		Print print = new Print();
		
		do {
			
			repeat.Repeat();
			
		} while(input.getENDOPTION() == ConstValue.ENDOPTION);
		
		print.Print_receiptTitle();
		print.Print_Orderlist();
		print.Print_Total();
		
	}

}


