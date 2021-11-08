import java.util.*;

//Child Patient class for patients
public class Patient extends User
{
	
	//Private variables
	private String pharmacy;
	private String insurance;
	private History history;
	
	//Constructor
	Patient(boolean dr, boolean nurse, boolean pat, String fName, String lName, String dob, String uname, String pass, String phone, String mail)
	{
		
		//Use user
		super(dr, nurse, pat, fName, lName, dob, uname, pass, phone, mail);
		
	}//End of Constructor
	
	

}//End of Patient class
