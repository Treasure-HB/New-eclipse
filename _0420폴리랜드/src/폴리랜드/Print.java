package 폴리랜드;

import java.text.DecimalFormat;

public class Print {
	DecimalFormat df = new DecimalFormat();
	Run run = new Run();
	private static int getPrice;
	
	

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
		System.out.println("-------------------------------------------------");
		System.out.printf("%3s%8s%6s%6s%10s\n","시간","권종","수량","가격","우대사항");
		System.out.println("-------------------------------------------------");
		
		Listsaving data1 = new Listsaving();
		for(OrderList order : data1.getData()) {
			System.out.printf("%3s%7s%5d%10d%11s\n", order.getTicketTime(), order.getTicketType(), 
					order.getTicketCount(),order.getFinal_ticketPrice(), order.getTicket_priority());
			
			getPrice += order.getFinal_ticketPrice(); //list의 가격 축적하기
        }
	}
		
	public void Print_Total() { 
		DecimalFormat format = new DecimalFormat("###,###,###,###,###,###,###");
		int totalPrice = 0;
		totalPrice = getPrice;
		
		System.out.println("-------------------------------------------------");
		System.out.printf("%s\n","합 계");
		System.out.printf("%47s%s\n", format.format(totalPrice),"원");
		System.out.println("-------------------------------------------------");
	}
	
}















