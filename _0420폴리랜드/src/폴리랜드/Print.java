package ��������;

import java.text.DecimalFormat;

public class Print {
	DecimalFormat df = new DecimalFormat();
	Run run = new Run();
	private static int getPrice;
	
	

	public void Print1() {
		System.out.println("������ �Է��ϼ���");
		System.out.println("1. �� �� ��");
		System.out.println("2. �� �� ��");
	}
	
	public void Print1_1() {
		System.out.println(run.Run1());
		Run.getTicketTime();
	}
	
	public void Print2() {
		System.out.println("��������� �Է��ϼ��� ex)1900-01-01");
	}
	
	public void Print2_2() {
		System.out.println(run.Run2());
	}
	
	public void Print3() {
		System.out.println("�� �� �ֹ��Ͻðڽ��ϱ�(�ִ� 10��)");
	}
		
	public  void Print3_3() {
		System.out.println(run.Run3() + "��");
		
	}
	
	public void Print4() {
		System.out.println(Run.getFinal_ticketPrice());
	}
	
	public void Print5() {
		System.out.println("�������� �����ϼ���");
		System.out.println("1. ����(���̿��� �ڵ�ó��)");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
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
		System.out.println("����Ͻðڽ��ϱ�  1. ���  2.����");
		
	}
	//<OderList - 6> orderlist������ Ŭ���� �ҷ��ͼ� for�� �̿��� �ֱ� 
	public void Print7_7() {
		System.out.println("-------------------------------------------------");
		System.out.printf("%3s%8s%6s%6s%10s\n","�ð�","����","����","����","������");
		System.out.println("-------------------------------------------------");
		
		Listsaving data1 = new Listsaving();
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
		System.out.printf("%s\n","�� ��");
		System.out.printf("%47s%s\n", format.format(totalPrice),"��");
		System.out.println("-------------------------------------------------");
	}
	
}















