package ��������;

import java.io.File;
import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class Print {
	DecimalFormat df = new DecimalFormat();
	Input input = new Input();
	Run run = new Run();
	private static int getPrice;
	StringValue stringvalue = new StringValue();
	
	public void Print_Program() {
		System.out.println("����α׷��� �����Ͻðڽ��ϱ�?");
		System.out.println("1. Ƽ�Ϲ߱�");
		System.out.println("2. ����м�");
	}
	
	public void Print_Time() {
		System.out.println(StringValue.getTICKET_TIME_QUESTION());
	}

	public void Print_Type() {
	
		System.out.println(StringValue.getTICKET_TYPE_QUESTION());
	}
	
	public void Print_Count() {
		
		System.out.println(StringValue.getTICKET_COUNT_QUESTION());
	}
	
	public void Print_Priority() {
		
		System.out.println(StringValue.getTICKET_PRIOTRITY_QUESTION());
		System.out.println(StringValue.getTICKET_PRIOTRITY_QUESTION1());
		System.out.println(StringValue.getTICKET_PRIOTRITY_QUESTION2());
		System.out.println(StringValue.getTICKET_PRIOTRITY_QUESTION3());
		System.out.println(StringValue.getTICKET_PRIOTRITY_QUESTION4());
		System.out.println(StringValue.getTICKET_PRIOTRITY_QUESTION5());
		
	}
	
	public void Print_End() {
		
		System.out.println(StringValue.getTICKET_END_QUESTION());
		
	}
	//<OderList - 6> orderlist������ Ŭ���� �ҷ��ͼ� for�� �̿��� �ֱ� 
	public void Print_receiptTitle() {
		System.out.println("-------------------------------------------------");
		System.out.printf("%3s%8s%6s%6s%10s\n",StringValue.getReceipt_Time(),StringValue.getReceipt_Type(),
				 StringValue.getReceipt_Count(),StringValue.getReceipt_Price(),StringValue.getReceipt_Priority());
		System.out.println("-------------------------------------------------");
	}
		
	public void Print_Orderlist() {
		Listsaving data1 = new Listsaving();
		File f = new File("C:\\Users\\HB\\Desktop\\�����α�����\\0428 ��������\\�����������м�.csv");
		
		
		for(OrderList order : data1.getData()) {
			System.out.printf("%3s%7s%5d%10d%11s\n", order.getTicketTime(), order.getTicketType(), 
					order.getTicketCount(),order.getFinal_ticketPrice(), order.getTicket_priority());
			
			getPrice += order.getFinal_ticketPrice(); //list�� ���� �����ϱ�
        }
	}
		
	public void Print_Total() { 
		DecimalFormat format = new DecimalFormat("###,###,###,###,###,###,###");
		int totalPrice = 0;
		totalPrice = getPrice;
		
		System.out.println("-------------------------------------------------");
		System.out.printf("%s\n",StringValue.getReceipt_Total());
		System.out.printf("%47s%s\n", format.format(totalPrice),"��");//format�� ����->���ڷ� �ٲ��ִ°ſ��� ���� �̸� ���ڷ� �ȹٲ㵵 ��
		System.out.println("-------------------------------------------------");
	}
	
}















