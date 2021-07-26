package keyosk.external;

public class Payed {

    private Long orderId;
    private Integer totalPrice;
    private Long payMethod;
    private Integer cardNumber;

    public Payed(){
        super();
    }


    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Long getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Long payMethod) {
        this.payMethod = payMethod;
    }
    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
	public String toString() {
		return "Payed [orderId=" + orderId + ", totalPrice=" + totalPrice + ", payMethod=" + payMethod
				+ ", cardNumber=" + cardNumber + "]";
	}
}
