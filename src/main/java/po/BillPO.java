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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
