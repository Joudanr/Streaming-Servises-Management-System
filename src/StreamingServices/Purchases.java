package StreamingServices;

public final class Purchases {

    private String paymentMethod;
    //cons

    public Purchases() {
        this("");
    }

    public Purchases(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    //set and get

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {
        return String.format("Payment Method : %s \n ", paymentMethod);
    }
}