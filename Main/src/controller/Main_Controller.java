package controller;

import client.Lineup;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.ContextMenuEvent;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Main_Controller implements Initializable {


    @FXML
    private ComboBox comboBox;

    @FXML
    private TreeView treeView;

    @FXML
    void selectItem(ContextMenuEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
b
        // Line up Select Section
        comboBox.setItems(FXCollections.observableArrayList(Lineup.values()));
        comboBox.valueProperty().addListener((obs, oldValue, newValue) -> {
            
        });

        TreeItem<String> rootItem = new TreeItem<>("Tree");
        TreeItem<String> branch = new TreeItem<>("Branch");

        //rootItem.getChildren().addAll(Models.getBranches());

        treeView.setRoot(rootItem);

    }

    @FXML
    void selectLineup(ActionEvent event) {

    }
}