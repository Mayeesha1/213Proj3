package payroll;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
//import javafx.scene.control.Alert.AlertType;

public class SampleController {

    @FXML
    private TextField name;

    @FXML
    private TextField dateHired;

    @FXML
    private TextField annSal;

    @FXML
    private TextField hrsWorked;

    @FXML
    private TextField rate;

    @FXML
    private Button clearButton;

    @FXML
    private Button addButton;

    @FXML
    private Button removeButton;

    @FXML
    private Button sethrButton;

    @FXML
    private TextArea messageArea1;

    @FXML
    private TextArea messageArea2;
    
    @FXML
    /**
     * Event Handler for the add button
     * @param event
     */
    void add(ActionEvent event) {
    	//messageArea.clear(); //clear the TextArea.
    	try {
    		String emp = name.getText();
    		Employee employee = name.getText();
    		//sum.setText(String.valueOf(result));
    		//employee.add();
    	}
    	//Show the error message with a pop-up window.
    	catch (Exception e) {
			messageArea1.appendText("Please enter an integer.\n");
    	}
    }

}