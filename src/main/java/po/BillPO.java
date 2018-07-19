package po;

public class BillPO {
    private String username;

    public String getUsername() {
        return username;
    }

    private String gameName;
    private String date;
    private double price;
    private String comment;

    public String getGameName() {
        return gameName;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public String getComment() {
        return comment;
    }
    public BillPO(){}
    public BillPO(String username,String gameName, String date, double price, String comment) {
        this.username=username;
        this.gameName = gameName;
        this.date = date;
        this.price = price;
        this.comment = comment;
    }
}
