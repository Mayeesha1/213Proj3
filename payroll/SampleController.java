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
    private RadioButton csID, itID, eceID, FullTimeID, PartTimeID, ManagementID, 
    						managerID, depheadID, directorID;
    
    @FXML
    /**
     * Event Handler for the add button
     * @param event
     */
    void add(ActionEvent event) {
    	try {
		String emp = name.getText();
		String[] dateSplit = dateHired.getValue().toString().split("-");
        String formattedDate = dateSplit[1] + "/" + dateSplit[2] + "/" + dateSplit[0];
        
        
    	if(FullTimeID.isSelected()) {
    		String annualSal = annSal.getText();
			double annSalary = Double.parseDouble(annualSal);
    		  if(csID.isSelected()) {
    			 Profile profile = new Profile(emp, "CS", formattedDate);
    			 Fulltime fulltime = new Fulltime(profile, annSalary);
    		     company.add(fulltime);
			     messageArea1.appendText("Employee added!\n");
			     System.out.println(company.getnumEmployee());
    		} else if(itID.isSelected()) {
        		Profile profile = new Profile(emp, "IT", formattedDate);
        		Fulltime fulltime = new Fulltime(profile, annSalary);
        		company.add(fulltime);
    			messageArea1.appendText("Employee added!\n");
    		} else if(eceID.isSelected()) {
        		Profile profile = new Profile(emp, "ECE", formattedDate);
        		Fulltime fulltime = new Fulltime(profile, annSalary);
        		company.add(fulltime);
    			messageArea1.appendText("Employee added!\n");
    		}
    		
    	} else if(ManagementID.isSelected()) {
    		String annualSal = annSal.getText();
			double annSalary = Double.parseDouble(annualSal);
    		if(managerID.isSelected()) {
    		   if(csID.isSelected()) {
    					Profile profile = new Profile(emp, "CS", formattedDate);
    					Management management = new Management(profile, annSalary, "Manager");
    					management.setRole("Manager");
    					company.add(management);
    					messageArea1.appendText("Employee added!\n");
    	    		} else if(itID.isSelected()) {
    	        		Profile profile = new Profile(emp, "IT", formattedDate);
    	        		Management management = new Management(profile, annSalary, "Manager");
        				management.setRole("Manager");
        				company.add(management);
        				messageArea1.appendText("Employee added!\n");
    	    		} else if(eceID.isSelected()) {
    	        		Profile profile = new Profile(emp, "ECE", formattedDate);
    	        		Management management = new Management(profile, annSalary, "Manager");
        				management.setRole("Manager");
        				company.add(management);
        				messageArea1.appendText("Employee added!\n");
    	    		}
    		} else if (depheadID.isSelected()) {
    				  if(csID.isSelected()) {
    					Profile profile = new Profile(emp, "CS", formattedDate);
    					Management management = new Management(profile, annSalary, "Department Head");
    					management.setRole("Department Head");
    					company.add(management);
    					messageArea1.appendText("Employee added!\n");
    	    		} else if(itID.isSelected()) {
    	        		Profile profile = new Profile(emp, "IT", formattedDate);
    	        		Management management = new Management(profile, annSalary, "Department Head");
        				management.setRole("Department Head");
        				company.add(management);
        				messageArea1.appendText("Employee added!\n");
    	    		} else if(eceID.isSelected()) {
    	        		Profile profile = new Profile(emp, "ECE", formattedDate);
    	        		Management management = new Management(profile, annSalary, "Department Head");
        				management.setRole("Department Head");
        				company.add(management);
    			        messageArea1.appendText("Employee added!\n");
    	    		}
    		} else if (directorID.isSelected()) {
    			    if(csID.isSelected()) {
    			       Profile profile = new Profile(emp, "CS", formattedDate);
    			       Management management = new Management(profile, annSalary, "Director");
 					   management.setRole("Director");
 					   company.add(management);
   			           messageArea1.appendText("Employee added!\n");
 	    		  } else if(itID.isSelected()) {
 	        		   Profile profile = new Profile(emp, "IT", formattedDate);
 	        		   Management management = new Management(profile, annSalary, "Director");
     				   management.setRole("Director");
     				   company.add(management);
   			           messageArea1.appendText("Employee added!\n");
 	    		 } else if(eceID.isSelected()) {
 	        		   Profile profile = new Profile(emp, "ECE", formattedDate);
 	        		   Management management = new Management(profile, annSalary, "Director");
     				   management.setRole("Director");
     				   company.add(management);
   			           messageArea1.appendText("Employee added!\n");
 	    		}
    		}
    	} else if(PartTimeID.isSelected()){
    		String hrRate = rate.getText();
			double hrlyRate = Double.parseDouble(hrRate);
    		 if(csID.isSelected()) {
    			 Profile profile = new Profile(emp, "CS", formattedDate);
    			 Parttime parttime = new Parttime(profile, hrlyRate);
    		     company.add(parttime);
			     messageArea1.appendText("Employee added!\n");
    		} else if(itID.isSelected()) {
        		Profile profile = new Profile(emp, "IT", formattedDate);
        		Parttime parttime = new Parttime(profile, hrlyRate);
   		        company.add(parttime);
			    messageArea1.appendText("Employee added!\n");
    		} else if(eceID.isSelected()) {
        		Profile profile = new Profile(emp, "ECE", formattedDate);
        		Parttime parttime = new Parttime(profile, hrlyRate);
   		        company.add(parttime);
			    messageArea1.appendText("Employee added!\n");
    		}
    	  }
        }
    	catch (Exception e) {
		messageArea1.appendText("Error.\n");
    	}
    }
    
    @FXML
    /**
    Event Handler for the remove button
    @param event
    */
    void remove(ActionEvent event) {
		System.out.println("Im in Remove!");
    	try {
    		System.out.println("Im in Remove!");
    		String emp = name.getText();
    		String[] dateSplit = dateHired.getValue().toString().split("-");
            String formattedDate = dateSplit[1] + "/" + dateSplit[2] + "/" + dateSplit[0];
          if(csID.isSelected()) {
            Profile profile = new Profile(emp, "CS", formattedDate);
        	Employee employee = new Employee(profile);
        	if(company.remove(employee)) {
				messageArea1.appendText("Employee removed. \n");
			}
			else if(company.getnumEmployee()==0) { 
				messageArea1.appendText("Employee database is empty. \n");
		  } else {
				messageArea1.appendText("Employee does not exist. \n");
		  }
   		} else if(itID.isSelected()) {
   			Profile profile = new Profile(emp, "IT", formattedDate);
    		Employee employee = new Employee(profile);
    		if(company.remove(employee)) {
				messageArea1.appendText("Employee removed. \n");
			}
			else if(company.getnumEmployee()==0) { 
			    messageArea1.appendText("Employee database is empty. \n");
		  } else {
			    messageArea1.appendText("Employee does not exist. \n");
		  }
   		} else if(eceID.isSelected()) {
   			Profile profile = new Profile(emp, "ECE", formattedDate);
    		Employee employee = new Employee(profile);
    		  if(company.remove(employee)) {
				messageArea1.appendText("Employee removed. \n");
			  }
			  else if(company.getnumEmployee()==0) { 
			    messageArea1.appendText("Employee database is empty. \n");
		    } else {
			    messageArea1.appendText("Employee does not exist. \n");
			}
   		  }
        }
    	catch (Exception e) {
    		messageArea1.appendText("Error. \n");
      }
    }
    
    @FXML
    /**
    Event Handler for the add button
    @param event
    */
    void calculatePayments(ActionEvent event) {
    	company.processPayments();
    	messageArea1.appendText("Calculation of employee payments is done \n");
    }
    	
    @FXML
    /**
    Event Handler for the add button
    @param event
    */
    void setHours(ActionEvent event) {
    	String emp = name.getText();
		RadioButton selectDep = (RadioButton) dep.getSelectedToggle();
		String dept = selectDep.getText();
		String date = dateHired.getValue().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		Profile profile = new Profile(emp, dept, date);
		String hours = hrsWorked.getText();
		double hourss = Double.parseDouble(hours);
		Parttime parttime=new Parttime(profile, 0);
		parttime.setHours(hourss);
		if(hourss<0) {
			messageArea1.appendText("Working hours cannot be negative. \n");
		}
		else if(hourss>100) {
			messageArea1.appendText("Invalid Hours: over 100. \n");
		}
		else {
			if(company.setHours(parttime)) {
				messageArea1.appendText("Working hours set. \n");
			} //no print for if employee doesnt exist or isnt parttime
		}
    }

    @FXML
    /**
    Event Handler for the add button
    @param event
    */
    void print(ActionEvent event) { //either separate or combine like did for add
    	company.print();
    }
    	
    @FXML
    /**
    Event Handler for the add button
    @param event
    */
    void printByDept(ActionEvent event) {
    	company.printByDepartment();
    }
    
    @FXML
    /**
    Event Handler for the add button
    @param event
    */
    void printByDate(ActionEvent event) {
    	company.printByDate();
    }
    
    
    
    
    
    
    
    
    
    
    
    
}