package MultiAspect;

public class Paycheck extends Transaction {

    String location;

    public Paycheck(Transaction transaction, String location) {
        super(
                transaction.amount,
                transaction.typeOfTransfer,
                transaction.paymentMethod,
                transaction.currency,
                transaction.creditCardNumber
        );
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        var toString = "Paycheck{" +
                "location='" + location + '\'' +
                ", amount=" + amount +
                ", typeOfTransfer='" + typeOfTransfer + '\'' +
                ", paymentMethod=" + paymentMethod;


        if (paymentMethod.equals(PaymentMethod.CASH)) {
            toString += ", currency='" + currency;

        }
        if (paymentMethod.equals(PaymentMethod.CARD)) {
            toString += ", creditCardNumber='" + creditCardNumber;
        }

        return toString + "}";
    }
}
