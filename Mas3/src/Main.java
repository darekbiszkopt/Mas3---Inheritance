import Abstract.Personal;
import Dynamic.Developer;
import Multi.Amphicar;
import Multi.Boat;
import Multi.Car;
import MultiAspect.Paycheck;
import MultiAspect.PaymentMethod;
import MultiAspect.Transaction;
import MultiAspect.Transfer;
import Overlaping.Account;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {


        // ABSTRACT CLASS
        List<String> list = new ArrayList<>();
        list.add("xx");
        list.add("xxxd");

        Personal p = new Personal(234567, new Date(120, Calendar.DECEMBER,2), true, "xx", list);
        System.out.println(p);

        // Overlapping
        Account studentAccount = new Account("200-300-2115", true);
        studentAccount.makeStudentAccount("s21522");
        System.out.println(studentAccount);


        Account vipAccount = new Account("100-500-2115", false);
        vipAccount.makeVIP("20%");
        System.out.println(vipAccount);


        Account studentVipAccount = new Account("6700-00-2115", true);
        studentVipAccount.makeStudentAccount("s21532");
        studentVipAccount.makeVIP("30%");
        System.out.println(studentVipAccount);

        // Multi
        Boat boat = new Boat("Lamborgihni", "Brown");
        Car car = new Car("Audi");
        car.addModel("A5");

        Amphicar amphicar = new Amphicar("XXX", "White");
        amphicar.addModel("YYY");

        System.out.println(boat);
        System.out.println(car);
        System.out.println(amphicar);

        // MultiAspect

        Paycheck paycheck = new Paycheck(
                Transaction.createCashTransaction(300, "National", "PL"),
                "Warsaw");

        Transfer transfer = new Transfer(
                Transaction.createCardNumberTransaction(300, "National", "400-222-2115"),
                true
        );

        System.out.println(paycheck);
        System.out.println(transfer);

        // Dynamic
        var skillsArray1 = new ArrayList<String>();
        skillsArray1.add("Java");
        skillsArray1.add("Sql");

        var skillsArray2 = new ArrayList<String>();
        skillsArray2.add("JS");
        skillsArray2.add("Angular");
        skillsArray2.add("Java");
        skillsArray2.add("Spring");
        Developer juniorDeveloper = Developer.makeDeveloperToJunior(skillsArray1, 8000, true);
        juniorDeveloper.setFirsJob(false);
        System.out.println(juniorDeveloper);

        Developer seniorDeveloper = Developer.makeDeveloperSenior(skillsArray2, 16000, 1);
        seniorDeveloper.setContractTimeInYears(3);

        System.out.println(seniorDeveloper);
    }
}
