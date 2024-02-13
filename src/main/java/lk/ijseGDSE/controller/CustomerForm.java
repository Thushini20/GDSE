package lk.ijseGDSE.controller;

//package lk.ijseGDSE.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lk.ijseGDSE.controller.Model.Customer;

public class CustomerForm {

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    void btnDeleteOnAction(ActionEvent event) {
        String name = txtName.getText();
        String id = txtId.getText();
        int age = Integer.parseInt(txtAge.getText());

        Customer c1 = new customer(name,id,age);


    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void txtAgeOnAction(ActionEvent event) {

    }

    @FXML
    void txtIdOnAction(ActionEvent event) {

    }

    @FXML
    void txtNameOnAction(ActionEvent event) {

    }

}
