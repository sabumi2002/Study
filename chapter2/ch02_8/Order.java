package ch02_8;

public class Order {
	public long orderNum,orderPhon;
	public int orderDay, orderTime, orderPrice, orderMenu;
	public String orderAdress;
	
	Order() {}
	Order(long orderNum, long orderPhon, String orderAdress, int orderDay, int orderTime, int orderPrice, int orderMenu){
		this.orderNum= orderNum;
		this.orderPhon= orderPhon;
		this.orderAdress= orderAdress;
		this.orderDay= orderDay;
		this.orderTime= orderTime;
		this.orderPrice= orderPrice;
		this.orderMenu= orderMenu;
	}
	
	public String info() {
		return "�ֹ� ���� ��ȣ : "+ orderNum+ "\n�ֹ� �ڵ��� ��ȣ: "+ orderPhon;
	}
}
