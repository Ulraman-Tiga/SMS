package vo;

import java.time.LocalDate;

public class BillVO {

    private String gameName;
    private double price;
    private LocalDate date;
    private String comment;

    public BillVO(String gameName, double price, LocalDate date, String comment) {
        this.gameName = gameName;
        this.price = price;
        this.date = date;
        this.comment = comment;
    }

    public String getGameName() {
        return gameName;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getComment() {
        return comment;
    }
}
