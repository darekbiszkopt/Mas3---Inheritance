package Abstract;

import Abstract.Account;

import java.util.Date;
import java.util.List;

public class Personal extends Account {
    String packetType;
    List<String> expenses;

    public Personal(int accountNumber, Date createDate, boolean blik, String packetType, List<String> expenses) {
        super(accountNumber, createDate, blik);
        this.packetType = packetType;
        this.expenses = expenses;
    }

    @Override
    public String toString() {
        return "Abstract.Personal: " +
                "| packetType: " + packetType +
                " | expenses: " + expenses +
                " | accountNumber: " + accountNumber +
                " | createDate: " + createDate +
                " | blik: " + blik +
                " |";
    }
}
