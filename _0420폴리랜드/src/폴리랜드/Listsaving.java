package ��������;

import java.util.ArrayList;
import java.util.List;

public class Listsaving {

	/* �ڷ����� ������� ���� �������� �迭 �����*/
	
	//<OderList - 1> ��ü ����, �ʱ�ȭ (��������ó�� ����)
	public static List<OrderList> data = new ArrayList<OrderList>();
	OrderList orderList = null;
	
	/*<OderList - 4> ���� ���ϴ� ���´�� ���ڸ� �޴� �޼ҵ� �����ϰ�, orderlist���������� �޼ҵ� ���� ����!
	 *<OderList - 5> orderlist ��ü�� add�Լ� �̿��Ͽ� ��Ʈ�� �ִ� ���� ���ϱ�*/
	
	public void OrderList(String ticketTime, String ticketType, int ticketCount, int final_ticketPrice, String ticket_priority) {
		
		OrderList order = new OrderList();
		order.setTicketTime(ticketTime);
		order.setTicketType(ticketType);
		order.setTicketCount(ticketCount);
		order.setFinal_ticketPrice(final_ticketPrice);
		order.setTicket_priority(ticket_priority);
		
		data.add(order);
	}

	public List<OrderList> getData() {
		return data;
	}
}


