public class User
{
	protected String firstName;
	protected String lastName;
	protected String dateOfBirth;
	protected int phoneNumber;
	protected String email;

	public User()
	{
		firstName = "John";
		lastName = "Doe";
		dateOfBirth = "01/01/2000";
		phoneNumber = 0;
		email = "someperson@gmail.com";
	}

	public User(String first, String last, String dob, int phone, String mail)
	{
		firstName = first;
		lastName = last;
		dateOfBirth = dob;
		phoneNumber = phone;
		email = mail;
	}

	public boolean changeName(String first, String last)
	{
		firstName = first;
		lastName = last;

		return true;
	}

	public boolean changePhone(int newPhone)
	{
		phoneNumber = newPhone;

		return true;
	}

	public boolean changeEmail(String newEmail)
	{
		email = newEmail;

		return true;
	}
}