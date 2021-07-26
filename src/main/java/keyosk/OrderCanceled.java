package keyosk;

public class OrderCanceled extends AbstractEvent {

    private Long orderId;
    private String orderStatus;


	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


    public OrderCanceled(){
        super();
    }

    @Override
	public String toString() {
		return "OrderCanceled [orderId=" + orderId + ", orderStatus=" + orderStatus + "]";
	}

    
}
