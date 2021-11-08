import java.util.*;

//Class UserDatabase for user maintenance
public class UserDatabase 
{
	
	//Private variables
	private ArrayList<User> users;
	
	//Public methods
	//Create User
	public User createUser(String type, String fName, String lName, String dob, String uname, String pass, String phone, String email)
	{
		
		//Doctor case
		if(type.equalsIgnoreCase("Doctor"))
		{
			
			//Create new doctor
			Doctor dr = new Doctor(fName, lName, dob, uname, pass, phone, email);
			
			//Add user to list of users
			boolean bool = users.add(dr);
			
			//Successful add
			if(bool)
			{
				
				//Return pointer
				return dr;
				
			}//End of successful add
			
			//Unsuccessful add
			else
			{
				
				//Return null pointer
				return null;
				
			}//End of unsuccessful add
			
		}//End of doctor case
		
		//Nurse case
		else if(type.equalsIgnoreCase("Nurse"))
		{
			
			//Create new nurse
			Nurse nurse = new Nurse(fName, lName, dob, uname, pass, phone, email);
			
			//Add user to list of users
			boolean bool = users.add(nurse);
			
			//Successful add
			if(bool)
			{
				
				//Return pointer
				return nurse;
				
			}//End of successful add
			
			//Unsuccessful add
			else
			{
				
				//Return null pointer
				return null;
				
			}//End of unsuccessful add
			
		}//End of nurse case
		
		//Patient case
		else
		{
			
			//Create new patient
			Patient patient = new Patient(fName, lName, dob, uname, pass, phone, email);
			
			//Add user to list of users
			boolean bool = users.add(patient);
			
			//Successful add
			if(bool)
			{
				
				//Return pointer
				return patient;
				
			}//End of successful add
			
			//Unsuccessful add
			else
			{
				
				//Return null pointer
				return null;
				
			}//End of unsuccessful add
			
		}//End of patient case
		
	}//End of method createUser
	
	//User Authentication
	public User authenticate(String uname, String pass)
	{
		
		//User iterator
		for(int a = 0; a < users.size(); a++)
		{
			
			//Check for user
			if(users.get(a).getUsername().equals(uname) && users.get(a).getPassword().equals(pass))
			{
				
				//Return found user
				return users.get(a);
				
			}//End of user check
			
		}//End of user iterator
		
		//Return null for non-existent
		return null;
		
	}//End of method authenticate
	
	//Write users to file
	public boolean writeUsers()
	{
		
		
		
	}//End of method writeUsers
	
	//Read users from file
	public boolean readUsers()
	{
		
		
		
	}//End of method readUsers

}//End of class UserDatabase
