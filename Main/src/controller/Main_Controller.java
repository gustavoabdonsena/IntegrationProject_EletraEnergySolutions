package controller;

import client.Lineup;
import client.Categoryes;
import client.Models;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.*;

public class Main_Controller implements Initializable {

    @FXML
    private ComboBox comboBox;

    @FXML
    private TreeView treeView;

    @FXML
    private TitledPane titledLineup;

    @FXML
    private TitledPane titledModels;

    @FXML
    private Accordion acordion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //Titled expanded 1
        acordion.setExpandedPane(titledLineup);
        titledModels.setDisable(true);

        // Line up Select Section
        comboBox.setItems(FXCollections.observableArrayList(Lineup.values()));

        // Evente Listener ComboBox
        comboBox.valueProperty().addListener((obs, oldValue, newValue) -> {
            treeReference();
            titledModels.setDisable(false);
            titledModels.setExpanded(true);
        });

    }

    public void treeReference(){

            //Categories

            TreeItem<String> treeRoot = new TreeItem<>(comboBox.getValue().toString());

            //Models
            Models[] m = Models.values();

            for(Models models: m){
                treeRoot.getChildren().add(new TreeItem(comboBox.getValue()));
            }

        treeView.setRoot(treeRoot);

    }

}