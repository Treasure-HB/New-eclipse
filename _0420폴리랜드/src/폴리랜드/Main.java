package 폴리랜드;

public class Main {
	private static int peoplecount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repeat repeat = new Repeat();
		Input input = new Input();
		Run run = new Run();
		Print print = new Print();
		
		
		
		do {
			
		repeat.Repeat();
		
		} while(input.getENDOPTION() == ConstValue.ENDOPTION);
		
		print.Print7_7();//orderlist 출력
		print.Print_Total();
		
	}
}


