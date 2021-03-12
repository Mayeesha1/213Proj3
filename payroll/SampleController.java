package payroll;


import java.time.format.DateTimeFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SampleController {
	Company company = new Company();
	private String depart;
    @FXML
    private TextField name;

    @FXML
    private DatePicker dateHired;

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
    private ToggleGroup dep, empType, mgmtType;
    
    @FXML
    private RadioButton csID, itID, eceID, FullTimeID, PartTimeID, ManagementID;
    
    @FXML
    /**
     * Event Handler for the add button
     * @param event
     */
    void add(ActionEvent event) {
    	//messageArea.clear(); //clear the TextArea.
    	//try {
		String emp = name.getText();
		//String date = dateHired.getValue().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));

		System.out.println();
    	if(csID.isSelected()) {
    		Profile profile = new Profile(emp, "CS", "06/16/2000");
    		
    		
    	}
    		//RadioButton selectDep = (RadioButton) dep.getSelectedToggle();
    		//String dept = selectDep.getText();
    		//System.out.println(dept);
		    Profile profile = new Profile(emp, "CS", "06/16/2000");



    		
    		//Employee employee = new Employee(profile);
    		
    		//RadioButton selectEmp = (RadioButton) empType.getSelectedToggle();
    		String employeeType = "Full Time";/*selectEmp.getText();*/
    		if(employeeType.equals("Full Time")) {
    	    	System.out.println("IM IN FULLTIME");
    			String annualSal = annSal.getText();
				double annSalary = Double.parseDouble(annualSal);
				Fulltime fulltime = new Fulltime(profile, annSalary);
        		company.add(fulltime);
				messageArea1.appendText("Employee added!");

    		} else if (employeeType.contentEquals("Management")) {
    			String annualSal = annSal.getText();
				double annSalary = Double.parseDouble(annualSal);
	    		RadioButton selectMgmt = (RadioButton) mgmtType.getSelectedToggle();
	    		String mgmtRole = selectMgmt.getText();
	    		
	    		 if(mgmtRole.contentEquals("Manager")) {
	    			Management management = new Management(profile, annSalary, mgmtRole);
					management.setRole("Manager");
					company.add(management);
				
	    		}else if(mgmtRole.contentEquals("Department Head")) {
					Management management = new Management(profile, annSalary, mgmtRole);
					management.setRole("Department Head");
					company.add(management);
					
	    		}else if(mgmtRole.contentEquals("Director")) {
					Management management = new Management(profile, annSalary, mgmtRole);
					management.setRole("Director");
					company.add(management);
					messageArea1.appendText("Employee added!");
	    		}
	    		
    		} else if (employeeType.contentEquals("Parttime")) {
			
    		}
    	//}
    	//Show the error message with a pop-up window.
    	//catch (Exception e) {
			//messageArea1.appendText("Error.\n");
    	//}
    }
    
    @FXML
    /**
     * Event Handler for the remove button
     * @param event
     */
    void remove(ActionEvent event) {
		String emp = name.getText();
	

    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}