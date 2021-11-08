import java.util.*;

public class User 
{
	
	//Protected variables
	protected String fName;
	protected String lName;
	protected String dob;
	protected String username;
	protected String password;
	protected String phone;
	protected String email;

	//Constructor
	User(String fname, String lname, String birthDate, String uname, String pass, String phoneNumber, String mail)
	{
		
		//Assign data members
		fName = fname;
		lName = lname;
		dob = birthDate;
		username = uname;
		password = pass;
		phone = phoneNumber;
		email = mail;
		
	}//End of Constructor
	
	
	
}//End of class User
