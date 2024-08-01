package StreamingServices;

public class Subscription implements TotalPrice {

    private Subscriber subscriber;
    private int plan;
    private Purchases purchases;
    private Date date;
    private String status;
    private int price;
    private OldStyle oldStyle;

    // Full constructor
    public Subscription(Subscriber subscriber, int plan, Purchases payment, Date date, int price) {

        this.subscriber = subscriber;
        this.plan = plan;
        this.purchases = purchases;
        this.date = date;
        this.price = price;
        this.status = "cancelled";
    }

    public Subscription(Subscriber subscriber, Purchases purchases, int price, OldStyle oldStyle) {
        this.subscriber = subscriber;
        this.purchases = purchases;
        this.date = date;
        this.status = status;
        this.price = price;
        this.oldStyle = oldStyle;
    }

    public Subscription() {

    }
    //All stters and getters 

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public Purchases getPurchases() {
        return purchases;
    }

    public void setPurchases(Purchases purchases) {
        this.purchases = purchases;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public final int endPrice(int Year) {
        return Year * YEARLY_PRICE;
    }

    public final void print() {
        System.out.println("Date: " + date.toString());
        System.out.println("Plan: " + plan);
        System.out.println("Status: " + status);
        System.out.println("total price: " + price);
    }

    public final void printOldStyleInfo() {
        System.out.println("you will receve your movie withen 2 to 5 work days");
        System.out.println("total price: " + 50 + "$");

    }

    @Override
    public String toString() {
        return String.format("Your Plan: %d%nYour Statue: %s%n", getPlan(), getStatus());
    }
}