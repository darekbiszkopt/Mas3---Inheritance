package MultiAspect;

import java.util.Currency;

public class Transaction {
    // Transaction
    protected int amount;
    protected String typeOfTransfer;
    // #####
    protected PaymentMethod paymentMethod;
    //   CASH, currency
    protected String currency;
    //    CARD credit card number
    protected String creditCardNumber;

    private Transaction(int amount, String typeOfTransfer) {
        this.amount = amount;
        this.typeOfTransfer = typeOfTransfer;
    }

    protected Transaction(int amount, String typeOfTransfer, PaymentMethod paymentMethod, String currency, String creditCardNumber) {
        this.amount = amount;
        this.typeOfTransfer = typeOfTransfer;
        this.paymentMethod = paymentMethod;
        this.currency = currency;
        this.creditCardNumber = creditCardNumber;
    }

    // Getter Setter

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTypeOfTransfer() {
        return typeOfTransfer;
    }

    public void setTypeOfTransfer(String typeOfTransfer) {
        this.typeOfTransfer = typeOfTransfer;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // #################

    public static Transaction createCashTransaction(int amount, String typeOfTransfer, String currency) {
        Transaction transaction = new Transaction(amount, typeOfTransfer);
        transaction.paymentMethod = PaymentMethod.CASH;
        transaction.currency = currency;

        return transaction;
    }

    public static Transaction createCardNumberTransaction(int amount, String typeOfTransfer, String creditCardNumber) {
        Transaction transaction = new Transaction(amount, typeOfTransfer);
        transaction.paymentMethod = PaymentMethod.CARD;
        transaction.creditCardNumber = creditCardNumber;

        return transaction;

    }

    public String getCurrency() throws Exception {
        if (this.paymentMethod != PaymentMethod.CASH) {
            throw new Exception("Transaction is not paying by cash");
        }
        return currency;
    }

    public void setCurrency(String currency) throws Exception {
        if (this.paymentMethod != PaymentMethod.CASH) {
            throw new Exception("Transaction is not paying by cash");
        }
        this.currency = currency;
    }

    public String getCreditCardNumber() throws Exception {
        if (this.paymentMethod != PaymentMethod.CARD) {
            throw new Exception("Transaction is not paying by card");
        }
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) throws Exception {
        if (this.paymentMethod != PaymentMethod.CARD) {
            throw new Exception("Transaction is not paying by card");
        }
        this.creditCardNumber = creditCardNumber;
    }

    public PaymentMethod getType() {
        return this.paymentMethod;
    }
}

