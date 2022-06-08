package MultiAspect;

public class Transfer extends Transaction {
    boolean itIsExpress;

    public Transfer(Transaction transaction, boolean itIsExpress) {
        super(
                transaction.amount,
                transaction.typeOfTransfer,
                transaction.paymentMethod,
                transaction.currency,
                transaction.creditCardNumber
        );
        this.itIsExpress = itIsExpress;
    }

    public boolean isItIsExpress() {
        return itIsExpress;
    }

    public void setItIsExpress(boolean itIsExpress) {
        this.itIsExpress = itIsExpress;
    }

    @Override
    public String toString() {
        var toString = "Transfer{" +
                "itIsExpress=" + itIsExpress +
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
