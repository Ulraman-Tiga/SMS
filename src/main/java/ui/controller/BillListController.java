package ui.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import logicServiceFactory.BillLogicServiceFactory;
import po.BillPO;
import ui.Main;
import ui.util.OneBillItem;
import vo.BillVO;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.*;
public class BillListController {

    private static BillListController billListController;
    public static BillListController getInstance(){
        return billListController;
    }
    public BillListController(){
        BillListController.billListController=this;
    }
    @FXML
    private TableView billList;
    @FXML
    private TableColumn<OneBillItem,String>gameNameColumn;
    @FXML
    private TableColumn<OneBillItem,String>dateColumn;
    @FXML
    private TableColumn<OneBillItem,String>priceColumn;

    public static void init(){
        ObservableList<OneBillItem> billVOS=FXCollections.observableArrayList();
        List<BillVO> billVOList= BillLogicServiceFactory.getBillLogicService().getBillList();
        billVOList.add(new BillVO("test",123,LocalDate.now(),"123"));
        for(BillVO billVO:billVOList){
            billVOS.add(new OneBillItem(
                    new SimpleStringProperty(billVO.getGameName()),
                    new SimpleStringProperty(billVO.getDate().format(DateTimeFormatter.BASIC_ISO_DATE)),
                    new SimpleStringProperty(billVO.getPrice()+""))
            );
        }
        BillListController.getInstance().gameNameColumn.setCellValueFactory(new PropertyValueFactory<>("gameName"));
        BillListController.getInstance().dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        BillListController.getInstance().priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        BillListController.getInstance().billList.setItems(billVOS);
    }



    public void createbill() throws IOException{
        Main.getPrimaryStage().setScene(new Scene(FXMLLoader.load(getClass().getResource("../../newBill.fxml"))));
    }
}
