package Abstract;

import java.util.Date;

public abstract class Account {
    protected int accountNumber;
    protected Date createDate;
    protected boolean blik;


    public Account(int accountNumber, Date createDate, boolean blik) {
        this.accountNumber = accountNumber;
        this.createDate = createDate;
        this.blik = blik;
    }
}
