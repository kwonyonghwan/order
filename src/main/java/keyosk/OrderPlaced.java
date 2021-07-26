package keyosk;

public class OrderPlaced extends AbstractEvent {

    private Long orderId;
    private Long menuId;
    private Integer menuCount;
    private Integer menuPrice;

    public OrderPlaced(){
        super();
    }
    public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	public Integer getMenuCount() {
		return menuCount;
	}
	public void setMenuCount(Integer menuCount) {
		this.menuCount = menuCount;
	}
	public Integer getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(Integer menuPrice) {
		this.menuPrice = menuPrice;
	}
    @Override
	public String toString() {
		return "OrderPlaced [orderId=" + orderId + ", menuId=" + menuId + ", menuCount=" + menuCount + ", menuPrice="
				+ menuPrice + "]";
	}

}
