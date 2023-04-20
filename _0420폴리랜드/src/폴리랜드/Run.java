package 폴리랜드;

import java.util.Calendar;

public class Run {

	private static String ticketTime;
	private static String ticketType;
	private static int basic_ticketPrice;//기본가격
	private static int total_ticketPrice;//기본가격 * 수량
	private static int final_ticketPrice;//기본가격 * 수량 * 우대사항
	private static int ticketCount;
	private static String ticket_priority;
	Listsaving ls = null;
	
	
	public String Run1() {
		Input input = new Input();
		if(Input.getINPUT_TICKET_TIME() == 1) {
			ticketTime = "주간권";
		}else if(Input.getINPUT_TICKET_TIME() == 2) {
			ticketTime = "야간권";
		}else {
			ticketTime = "error";
		}
		return ticketTime;
		
	}

	public String Run2() {
		Calendar cal = Calendar.getInstance();
		int nowYear = cal.get(Calendar.YEAR);
		int peopleAge;
		String birthYear;
		birthYear = Input.getINPUT_PEOPLE_AGE().substring(0, 4);
		peopleAge = nowYear - Integer.parseInt(birthYear);
		
		if(Input.getINPUT_TICKET_TIME()  == 1) {
			if(peopleAge <= 2) {
				ticketType = ConstValue.BABY;
				basic_ticketPrice = ConstValue.BABY_PRICE;
			}else if(peopleAge > 2 && peopleAge < 13){
				ticketType = ConstValue.CHILD;
				basic_ticketPrice = ConstValue.childDayPrice;
			}else if(peopleAge > 12 && peopleAge < 19){
				ticketType = ConstValue.TEEN;
				basic_ticketPrice = ConstValue.teenDayPrice;
			}else if(peopleAge > 18 && peopleAge < 65){
				ticketType = ConstValue.ADULT;
				basic_ticketPrice = ConstValue.adultDayPrice;
			}else {
				ticketType = ConstValue.GRAND;
				basic_ticketPrice = ConstValue.grandDayPrice;
			}
		}else if(Input.getINPUT_TICKET_TIME() == 2) {
			if(peopleAge <= 2) {
				ticketType = ConstValue.BABY;
				basic_ticketPrice = ConstValue.BABY_PRICE;
			}else if(peopleAge > 2 && peopleAge < 13){
				ticketType = ConstValue.CHILD;
				basic_ticketPrice = ConstValue.childNightPrice;
			}else if(peopleAge > 12 && peopleAge < 19){
				ticketType = ConstValue.TEEN;
				basic_ticketPrice = ConstValue.teenNightPrice;
			}else if(peopleAge > 18 && peopleAge < 65){
				ticketType = ConstValue.ADULT;
				basic_ticketPrice = ConstValue.adultNightPrice;
			}else {
				ticketType = ConstValue.GRAND;
				basic_ticketPrice = ConstValue.grandNightPrice;
			}
		}
		return ticketType;
	
		
	}
	
	public int Run3() {
		if(Input.getINPUT_TICKET_COUNT() > 0 && Input.getINPUT_TICKET_COUNT() < 11) {
			ticketCount = Input.getINPUT_TICKET_COUNT();
			total_ticketPrice = ticketCount * basic_ticketPrice;
		}else {
			ticketCount = 0;
			total_ticketPrice = ticketCount * basic_ticketPrice;
		}
		return ticketCount;
	}
	
	public String Run5() {
		Input.getINPUT_PRIORITY();
		if(Input.getINPUT_PRIORITY() == 1) {
			ticket_priority = "*우대적용 없음";
			final_ticketPrice = total_ticketPrice;
		}else if(Input.getINPUT_PRIORITY() == 2) {
			ticket_priority = "*장애인 우대적용";
			final_ticketPrice = (int) (total_ticketPrice * 0.4);
		}else if(Input.getINPUT_PRIORITY() == 3) {
			ticket_priority = "*국가유공자 우대적용";
			final_ticketPrice = (int) (total_ticketPrice * 0.5);
		}else if(Input.getINPUT_PRIORITY() == 4) {
			ticket_priority = "*다자녀 우대적용";
			final_ticketPrice = (int) (total_ticketPrice * 0.2);
		}else if(Input.getINPUT_PRIORITY() == 5) {
			ticket_priority = "*임산부 우대적용";
			final_ticketPrice = (int) (total_ticketPrice * 0.15);
		}
		return ticket_priority;
	}
	
	
	/*<OderList - 5> 기존에 설정한 전역변수와 orderlist 전역변수와 연결하기위해 
	 * 기존전역변수 클래스에 orderlist 소환하고 순서대로 집어넣기*/
	public void InsertOrderList() {
//		Listsaving ls = new Listsaving();
		ls = new Listsaving();
		ls.OrderList(Run.getTicketTime(),Run.getTicketType(),Run.getTicketCount(),
								+ Run.getFinal_ticketPrice(),Run.getTicket_priority());
		
	}

	public void Endoptions() {
		Input.getENDOPTION();
	}
	
	//전역변수 getter setter
	public static String getTicketTime() {
		return ticketTime;
	}

	public static void setTicketTime(String ticketTime) {
		Run.ticketTime = ticketTime;
	}

	public static String getTicketType() {
		return ticketType;
	}

	public static void setTicketType(String ticketType) {
		Run.ticketType = ticketType;
	}

	public static int getBasic_ticketPrice() {
		return basic_ticketPrice;
	}

	public static void setBasic_ticketPrice(int basic_ticketPrice) {
		Run.basic_ticketPrice = basic_ticketPrice;
	}

	public static int getTotal_ticketPrice() {
		return total_ticketPrice;
	}

	public static void setTotal_ticketPrice(int total_ticketPrice) {
		Run.total_ticketPrice = total_ticketPrice;
	}

	public static int getFinal_ticketPrice() {
		return final_ticketPrice;
	}

	public static void setFinal_ticketPrice(int final_ticketPrice) {
		Run.final_ticketPrice = final_ticketPrice;
	}

	public static int getTicketCount() {
		return ticketCount;
	}

	public static void setTicketCount(int ticketCount) {
		Run.ticketCount = ticketCount;
	}

	public static String getTicket_priority() {
		return ticket_priority;
	}

	public static void setTicket_priority(String ticket_priority) {
		Run.ticket_priority = ticket_priority;
	}
}
	



