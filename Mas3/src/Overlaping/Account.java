package Overlaping;

import java.util.EnumSet;

public class Account {
    private String accountNumber;

    private boolean blik;

    private String discounts;

    private String studentCard;

    private EnumSet<AccountType> types = EnumSet.of(AccountType.Account);

    public Account(String accountNumber, boolean blik) {
        this.accountNumber = accountNumber;
        this.blik = blik;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean getBlikAvailable() {
        return blik;
    }

    public void setBlik(boolean blik) {
        this.blik = blik;
    }

    public void makeStudentAccount(String studentCard) {
        this.studentCard = studentCard;
        this.types.add(AccountType.Student);
    }

    public void removeVIPType() {
        this.discounts = null;
        this.types.remove(AccountType.VIP);
    }

    public void makeVIP(String discounts) {
        this.discounts = discounts;
        this.types.add(AccountType.VIP);
    }

    public void removeStudentType() {
        this.studentCard = null;
        this.types.remove(AccountType.Student);
    }

    public String getDiscounts() throws Exception {
        if (!this.types.contains(AccountType.VIP)) {
            throw new Exception("Employee is not a seller");
        }

        return discounts;
    }

    public void setDiscounts(String discounts) throws Exception {
        if (!this.types.contains(AccountType.VIP)) {
            throw new Exception("Employee is not a seller");
        }

        this.discounts = discounts;
    }

    public String getStudentCard() throws Exception {
        if (!this.types.contains(AccountType.Student)) {
            throw new Exception("Account is not a student");
        }

        return studentCard;
    }

    public void setStudentCard(String studentCard) throws Exception {
        if (!this.types.contains(AccountType.Student)) {
            throw new Exception("Employee is not a cook");
        }

        this.studentCard = studentCard;
    }

    public EnumSet<AccountType> getTypes() {
        return types;
    }

    @Override
    public String toString() {
        var toString = "Account { " +
                "accountNumber = " + accountNumber +
                ", blik = " + blik +
                ", types = " + types;
        if (types.contains(AccountType.Student)) {
            toString += ", studentCard = " + studentCard;
        }

        if (types.contains(AccountType.VIP)) {
            toString += ", discounts = " + discounts;
        }
        return toString + " }";
    }
}