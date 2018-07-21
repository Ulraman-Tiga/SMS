package ui.util;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class OneBillItem {
    private final StringProperty gameName;
    private final StringProperty date;
    private final StringProperty price;

    public OneBillItem(StringProperty gameName, StringProperty date, StringProperty price) {
        this.gameName = gameName;
        this.date = date;
        this.price = price;
    }

    public String getGameName() {
        return gameName.get();
    }

    public StringProperty gameNameProperty() {
        return gameName;
    }

    public String getDate() {
        return date.get();
    }

    public StringProperty dateProperty() {
        return date;
    }

    public String getPrice() {
        return price.get();
    }

    public StringProperty priceProperty() {
        return price;
    }
}
