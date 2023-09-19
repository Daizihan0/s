public class Order {
    private String orderId;
    private String beginTime;
    private String endTime;
    private String duration;
    private String money;
    private Boolean isPaid;
    private String rNumber;
    private String rType;
    private String rPrice;

    private Room room = new Room(rNumber);



}
