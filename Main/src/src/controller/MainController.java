package src.controller;

import src.model.Categories;
import src.model.Lineup;
import src.model.Models;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private ComboBox<Lineup> comboBox;

    @FXML
    private TreeView<Lineup> treeView;

    @FXML
    private TitledPane titledLineup;

    @FXML
    private TitledPane titledModels;

    @FXML
    private Accordion accordion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //Titled expanded 1
        accordion.setExpandedPane(titledLineup);
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

            ComboBox<Lineup> newValue = comboBox;

            TreeItem setTreeView = new TreeItem<>(newValue.getValue());
            setTreeView.setExpanded(true);

            //Models
            for(Categories cat: Categories.values()){

                if(cat.getLineup().equals(newValue.getValue())){
                    TreeItem<Categories> categoriItem = new TreeItem<>(cat);
                    setTreeView.getChildren().add(categoriItem);

                    for (Models mod: Models.values()){
                        if (mod.getCategories().equals(categoriItem.getValue())){
                            categoriItem.getChildren().add( new TreeItem(mod));
                        }

                    }
                }
            }
            treeView.setRoot(setTreeView);
    }

}