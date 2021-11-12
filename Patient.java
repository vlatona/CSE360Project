import java.util.ArrayList; //import ArrayList

//Patient Class is the Child class of Parent User Class
public class Patient extends User
{
	//Instance variables
	private String pharmacy;
	private ArrayList<String> medications;
	private ArrayList<String> visualHistory;
	private ArrayList<String> immunizations;

	//Default Constructor
	public Patient()
	{
		pharmacy = "undetermined";
		medications = new ArrayList<String>();
		immunizations = new ArrayList<String>();
	}

	//Custom Constructor
	public Patient(String first, String last, String dob, int phone, String mail, String pharmacy, ArrayList<String> medications, ArrayList<String> immunizations)
	{
		super(first, last, dob, phone, mail); //call default constructor of Parent User class
		this.pharmacy = pharmacy;
		this.medications = medications;
		this.immunizations = immunizations;
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

	public boolean changePharmcy(String pharma) //change pharmacy
	{
		pharmacy = pharma;

		return true;
	}

	public boolean updateImmunizations(String newImm) //update and add immunization
	{
		immunizations.add(newImm);

		return true;
	}

	public boolean addMed(String newMed) //add medication
	{
		medications.add(newMed);

		return true;
	}

	public void viewMeds() //print medication list
	{
		System.out.print("\nMedications");
		System.out.print("\n-----------");
		for(int i = 0; i < medications.size(); i++)
		{
			System.out.print("\n\t" + medications.get(i));
		}
	}

	public void viewHistory() //print history list
	{
		System.out.print("\nHistory");
		System.out.print("\n-----------");
		for(int i = 0; i < medications.size(); i++)
		{
			System.out.print("\n\t" + visualHistory.get(i));
		}
	}
}
