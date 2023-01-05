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
import java.util.stream.Stream;

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

            //Lineup
            TreeItem treeRoot = new TreeItem<>(comboBox.getValue());

            //Models
            for(Categoryes cat: Categoryes.values()){

                if(cat.getLineup().equals(comboBox.getValue())){
                    TreeItem categoryItem = new TreeItem(cat);
                    treeRoot.getChildren().add(categoryItem);

                    for (Models mod: Models.values()){
                        if (mod.getCategoryes().equals(categoryItem.getValue())){
                            categoryItem.getChildren().add( new TreeItem<>(mod));
                        }

                    }
                }

            }

            treeView.setRoot(treeRoot);


    }

}