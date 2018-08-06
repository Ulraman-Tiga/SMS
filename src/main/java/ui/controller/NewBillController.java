package ui.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import logicServiceFactory.BillLogicServiceFactory;
import ui.Main;
import vo.BillVO;

import javax.xml.soap.Text;
import java.time.LocalDate;

public class NewBillController {

    @FXML
    private TextField gameNameField;
    @FXML
    private TextField priceField;
    @FXML
    private TextField yearField;
    @FXML
    private TextField monthField;
    @FXML
    private TextField dayField;
    @FXML
    private TextField commentArea;

    private boolean checkIlligal(){
        return true;
    }

    public void createBill(){
        boolean isIlligal=checkIlligal();
        if(isIlligal) {
            BillLogicServiceFactory.getBillLogicService().createBill(new BillVO(
                    gameNameField.getText(),
                    Double.parseDouble(priceField.getText()),
                    LocalDate.of(Integer.parseInt(yearField.getText()),
                            Integer.parseInt(monthField.getText()),
                            Integer.parseInt(dayField.getText())),
                    commentArea.getText()
            ));
        }
        else{

        }
    }

    public void cancel() throws Exception{
        Main.getPrimaryStage().setScene(new Scene(FXMLLoader.load(getClass().getResource("../../billList.fxml"))));
    }
}
