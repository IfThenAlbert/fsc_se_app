package com.example.fsc_se_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class strls {

    @FXML
    private Button btnadd;

    @FXML
    private Button btnclear;

    @FXML
    private Button btndel;

    @FXML
    private Button btnedit;

    @FXML
    private TextField inpdp;

    @FXML
    private TextField inpem;

    @FXML
    private TextField inpfn;

    @FXML
    private TextField inpid;

    @FXML
    private TextField inpln;

    @FXML
    private TextField inpmaj;

    @FXML
    void btnAddClicked(ActionEvent event) {

    }

    @FXML
    void btnClearClicked(ActionEvent event) {
        inpid.setText("");
        inpfn.setText("");
        inpln.setText("");
        inpdp.setText("");
        inpmaj.setText("");
        inpem.setText("");
    }

    @FXML
    void btnDeleteClicked(ActionEvent event) {

    }

    @FXML
    void btnEditClicked(ActionEvent event) {

    }


}
