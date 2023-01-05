package controller;

import client.Lineup;
import client.Models;
import client.SubModels;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javax.sound.sampled.Line;
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
    private Accordion acordion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //Titled expanded 1
        acordion.setExpandedPane(titledLineup);

        // Line up Select Section
        comboBox.setItems(FXCollections.observableArrayList(Lineup.values()));

        // Evente Listener ComboBox
        comboBox.valueProperty().addListener((obs, oldValue, newValue) -> {
            selectBox(comboBox);
        });

    }

    public void selectBox(ComboBox comboBox){

        if (comboBox.getSelectionModel().getSelectedItem().equals(Lineup.CRONOS)) {
            //Categories
            TreeItem<String> treeRoot = new TreeItem<>(Models.values().toString());

            //Models
            SubModels[] m = SubModels.values();

            for(SubModels models: m){
                treeRoot.getChildren().add(new TreeItem(models));
            }

            treeView.setRoot(treeRoot);

        }else

            //Model AresTB
        
            if(comboBox.getSelectionModel().getSelectedItem().equals(Lineup.ARES)){
            System.out.println("Ares Selected");

            TreeItem<String> rootItemTB = new TreeItem<>(Models.ARESTB.toString());

            rootItemTB.getChildren().addAll(new TreeItem<>(SubModels.values().toString()));

            treeView.setRoot(rootItemTB);

            //Model AresTHS
            TreeItem<String> rootItemTHS = new TreeItem<>(Models.ARESTHS.toString());
            TreeItem<String> branchTHS = new TreeItem<>(SubModels.values().toString());

            rootItemTHS.getChildren().add(branchTHS);

            treeView.setRoot(rootItemTHS);

        }

    }

}