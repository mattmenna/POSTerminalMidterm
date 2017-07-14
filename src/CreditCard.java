import java.util.Scanner;

/**
 * Midterm Project Grand Circus
 * <p>
 * Java June 2017
 * <p>
 * (Alphabetical Order)
 * Michael Gleeson
 * Matthew Menna
 * Mark Ritter
 * Vernon Scott
 */
public class CreditCard extends Payment {


    public String creditCardNum;
    public String cVV;
    public String expDate;
    public String paymentComplete;

    @Override
    public String generatePayment(String a, String b, String c) {

        return paymentComplete;
    }

    public String getCreditCardNum() {
        System.out.println("Please enter your credit card number");
        creditCardNum = scan.nextLine();

        while ((creditCardNum.length() >= 16) && (creditCardNum.length() <= 16)) {
            System.out.println("Invalid credit card number! Please enter a  valid 16 credit card number again.");
            //scan.nextLine();
        }

        return creditCardNum;


    }

    public void setCreditCardNum(String creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public String getcVV() {
        System.out.println("Please enter your CVV");
        cVV = scan.nextLine();

        while ((cVV.length() < 3) && (cVV.length() > 3)) {
            System.out.println("Invalid CVV! please enter a valid 3 digit CVV located on the back of your card. ");
            //scan.nextLine();
        }
        return cVV;

    }

    public void setcVV(String cVV) {
        this.cVV = cVV;
    }

    public String getExpDate() {
        System.out.println("Please enter your Exp Date");
        expDate = scan.nextLine();

        while ((expDate.length() > 4) && (expDate.length() < 4)) {
            System.out.println("Invalid Expiration Date! Please enter the exp date in format MM/YY");
            scan.nextLine();
        }
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getPaymentComplete() {
        return paymentComplete;
    }

    public void setPaymentComplete(String paymentComplete) {
        this.paymentComplete = paymentComplete;
    }
}
