package 폴리랜드;

public class Print {

Run run = new Run();
	

	public void Print1() {
		System.out.println("권종을 입력하세요");
		System.out.println("1. 주 간 권");
		System.out.println("2. 야 간 권");
	}
	
	public void Print1_1() {
		System.out.println(run.Run1());
		Run.getTicketTime();
	}
	
	public void Print2() {
		System.out.println("생년월일을 입력하세요 ex)1900-01-01");
	}
	
	public void Print2_2() {
		System.out.println(run.Run2());
	}
	
	public void Print3() {
		System.out.println("몇 장 주문하시겠습니까(최대 10장)");
	}
		
	public  void Print3_3() {
		System.out.println(run.Run3() + "장");
		
	}
	
	public void Print4() {
		System.out.println(Run.getFinal_ticketPrice());
	}
	
	public void Print5() {
		System.out.println("우대사항을 선택하세요");
		System.out.println("1. 없음(나이우대는 자동처리)");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀");
		System.out.println("5. 임산부");
	}
	
	public  void Print5_5() {
		//Run run5 = new Run();
		System.out.println(run.Run5());
	}
	
	public void Print6() {
		System.out.print(Run.getTicketTime()+"\t");
		System.out.print(Run.getTicketType()+"\t");
		System.out.print(Run.getTicketCount()+"\t");
		System.out.print(Run.getFinal_ticketPrice()+"\t");
		System.out.print(Run.getTicket_priority());
		System.out.println();
		
	}
	
	public void Print7() {
		System.out.println("계속하시겠습니까  1. 계속  2.종료");
		
	}
	//<OderList - 6> orderlist설정한 클래스 불러와서 for문 이용해 넣기 
	public void Print7_7() {
		Listsaving data1 = new Listsaving();
		for(OrderList order : data1.getData()) {
			System.out.printf("%s %s %d %d %s\n", order.getTicketTime(), order.getTicketType(), order.getTicketCount(),
                 order.getFinal_ticketPrice(), order.getTicket_priority());
        }
	}
}















