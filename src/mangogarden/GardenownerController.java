/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangogarden;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class GardenownerController implements Initializable {

    @FXML
    private PieChart pieChart;
    @FXML
    private Label statusLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void checkWorkerDeTxt(ActionEvent event) {
    }

    @FXML
    private void sendTaskTxt(ActionEvent event) {
    }

    @FXML
    private void progressReTxt(ActionEvent event) {
         ObservableList <PieChart.Data> list = FXCollections.observableArrayList(
            new PieChart.Data("Mango cultivated",30),
            new PieChart.Data("Mango Sellings",20),
            new PieChart.Data("Total worker",10),
            new PieChart.Data("Investment",20),
            new PieChart.Data("Profit",30)
        );
        pieChart.setData(list);
        
        for(PieChart.Data data: pieChart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    statusLabel.setText(String.valueOf(data.getPieValue()));
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            }
            );
        }
    }        
    }
    

