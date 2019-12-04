package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.DirectoryChooser;
import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;


public class DictionaryWindow {
    @FXML
    TableView table;


    public void initialize(){ }


    public void insertData(ArrayList<Pair<String,String>> dictionary){

        TableColumn<String, DictionaryViewObject> column1 = new TableColumn<>("Term");
        column1.setCellValueFactory(new PropertyValueFactory<>("Term"));


        TableColumn<String, DictionaryViewObject> column2 = new TableColumn<>("Amount");
        column2.setCellValueFactory(new PropertyValueFactory<>("Amount"));

        table.getColumns().add(column1);
        table.getColumns().add(column2);
        for (int i = 0; i <dictionary.size() ; i++)
            table.getItems().add(new DictionaryViewObject(dictionary.get(i).getKey(),dictionary.get(i).getValue()));

    }


}
