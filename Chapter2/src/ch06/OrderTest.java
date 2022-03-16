package ch06;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderNumber = "202011020003";
		System.out.println("주문 접수 번호 : " + order.orderNumber);
		order.orderphone = "01023450001";
		System.out.println("주문 핸드폰 번호 : " + order.orderphone);
		order.address = "서울시 강남구 역삼동 111-333";
		System.out.println("주문 집 주소 : " + order.address);
		order.orderdate = 20201102;
		System.out.println("주문 날짜 : " + order.orderdate);
		order.ordertime = 130258;
		System.out.println("주문 시간 : " + order.ordertime);
		order.orderprice = 35000;
		System.out.println("주문 가격 : " + order.orderprice);
		order.number = "0003";
		System.out.println("메뉴 번호 : " + order.number);
	}

}
