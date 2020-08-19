package Models;

import java.io.Serializable;

public class CardsBorrowBook implements Serializable {
    private String IDCardBorrow, IDCardLibrary, NameUserCardBorrow, NameBookBorrow, IDBookBorrow, DateCreateBorrow,
            HourPay, HourBorrow;

    public String getIDCardBorrow() {
        return IDCardBorrow;
    }

    public String getIDCardLibarary() {
        return IDCardLibrary;

    }

    public String getNameBookBorrow() {
        return NameBookBorrow;
    }

    public String getNameUserCardBorrow() {
        return NameUserCardBorrow;
    }

    public String getIDBookBorrow() {
        return IDBookBorrow;
    }

    public String getDateCreateBorrow() {
        return DateCreateBorrow;
    }

    public String getHourPay() {
        return HourPay;
    }

    public String getHourBorrow() {
        return HourBorrow;
    }

    public void setIDCardBorrow(String str) {
        IDCardBorrow = str;
    }

    public void setIDCardLibrary(String str) {
        IDCardLibrary = str;
    }

    public void setNameBookBorrow(String str) {
        NameBookBorrow = str;
    }

    public void setNameUserCardBorrow(String str) {
        NameUserCardBorrow = str;
    }

    public void setIDBookBorrow(String str) {
        IDBookBorrow = str;
    }

    public void setDateCreateBorrow(String str) {
        DateCreateBorrow = str;
    }

    public void setHourPay(String str) {
        HourPay = str;
    }

    public void setHourBorrow(String str) {
        HourBorrow = str;
    }

    public CardsBorrowBook() {
    }

}