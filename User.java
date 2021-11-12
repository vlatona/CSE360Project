//Parent class of Doctor, Patient, and Nurse
public class User
{
	//Instance variables
	protected String firstName;
	protected String lastName;
	protected String dateOfBirth;
	protected int phoneNumber;
	protected String email;

	//Default constructor
	public User()
	{
		firstName = "John";
		lastName = "Doe";
		dateOfBirth = "01/01/2000";
		phoneNumber = 0;
		email = "someperson@gmail.com";
	}

	//Custom constructor
	public User(String first, String last, String dob, int phone, String mail)
	{
		firstName = first;
		lastName = last;
		dateOfBirth = dob;
		phoneNumber = phone;
		email = mail;
	}

	//setter methods
	public boolean changeName(String first, String last) //change first and last name
	{
		firstName = first;
		lastName = last;

		return true;
	}

	public boolean changePhone(int newPhone) //change phone number
	{
		phoneNumber = newPhone;

		return true;
	}

	public boolean changeEmail(String newEmail) //change email
	{
		email = newEmail;

		return true;
	}
}
