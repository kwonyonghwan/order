package keyosk;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
 public class OrderService{     

	@Autowired
     OrderRepository orderRepository;
	 
	 @Transactional
	public String orderPlacedService(OrderPlaced orderPlacedObj) throws Exception {

		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□orderPlacedService start □□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println(" INput orderPlacedObj :  " + orderPlacedObj.toString());
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		
		try {
			Order orderObj = new Order();
			orderObj.setMenuId(orderPlacedObj.getMenuId());
			orderObj.setMenuCount(orderPlacedObj.getMenuCount());	
			orderObj.setMenuPrice(orderPlacedObj.getMenuPrice());	
			orderObj.setOrderStatus("ORDER PLACED");
			System.out.println(" INput orderObj :  " + orderObj.toString());
			orderRepository.save(orderObj);
	
			System.out.println(" OrderList data all :  " + orderRepository.findAll().toString());
	
			return "ORDER SUCCESS";
			
		} catch (Exception e) {
			return "save Order Error" +e.getStackTrace() +e.getMessage();
		}
	}//orderPlacedService


	@Transactional
	public String orderCanceledService(OrderCanceled orderCanceledObj) throws Exception {

		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□orderCanceledService start □□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println(" INput orderCanceledObj :  " + orderCanceledObj.toString());
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");

		try {
			Optional<Order> tempObj =  orderRepository.findById(orderCanceledObj.getOrderId());

			Order orderObj = new Order();

			if(tempObj.isPresent()){
				orderObj = tempObj.get();		
			}else{
				return "no Order data" ;
			}

			orderObj.setOrderStatus("ORDER CANCELED");

			orderRepository.save(orderObj);
	
			System.out.println(" OrderList data all :  " + orderRepository.findAll().toString());
	
			return "ORDER CANCEL SUCCESS";
			
		} catch (Exception e) {
			return "save CANCELLED Error" +e.getStackTrace();
		}
	}//orderCanceledService


	@Transactional
	public Iterable<Order> orderListService() throws Exception {

		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□ orderListService start □□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");

		try {

			return orderRepository.findAll();
			
		} catch (Exception e) {

			System.out.println("OrderList Error" +e.getStackTrace());

			return null;
		}
	}//orderListService


 }//classOrderPlacedService
