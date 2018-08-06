package ui.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import ui.Main;

public class MainMenuController {
    @FXML
    private Button manageBill_button;
    @FXML
    private Button return_button;

    public void manageBill() throws Exception{
        Parent parent= FXMLLoader.load(getClass().getResource("../../billList.fxml"));
        Main.getPrimaryStage().setScene(new Scene(parent));
        BillListController.init();
    }
}
