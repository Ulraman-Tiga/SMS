package ui.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import po.BillPO;
import ui.util.OneBillItem;
import vo.BillVO;

import java.time.LocalDate;

public class BillListController {

    @FXML
    private TableView billList;
    @FXML
    private TableColumn<OneBillItem,String>gameNameColumn;
    @FXML
    private TableColumn<OneBillItem,String>dateColumn;
    @FXML
    private TableColumn<OneBillItem,String>priceColumn;

    public void initBillList(){
        ObservableList<OneBillItem> billVOS=FXCollections.observableArrayList();
        billVOS.add(new OneBillItem(new SimpleStringProperty("test"),
                new SimpleStringProperty("0101"),
                new SimpleStringProperty("123")));
        gameNameColumn.setCellValueFactory(new PropertyValueFactory<>("gameName"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        billList.setItems(billVOS);
    }

    public void createbill(){
        initBillList();
        System.out.println("yeah!");
    }

}
