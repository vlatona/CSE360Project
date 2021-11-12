import java.util.ArrayList;

public class Patient extends User
{
	private String pharmacy;
	private ArrayList<String> medications;
	private ArrayList<String> visualHistory;
	private ArrayList<String> immunizations;

	public Patient()
	{
		pharmacy = "undetermined";
		medications = new ArrayList<String>();
		immunizations = new ArrayList<String>();
	}

	public Patient(String first, String last, String dob, int phone, String mail, String pharmacy, ArrayList<String> medications, ArrayList<String> immunizations)
	{
		super(first, last, dob, phone, mail);
		this.pharmacy = pharmacy;
		this.medications = medications;
		this.immunizations = immunizations;
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

	public boolean changePharmcy(String pharma)
	{
		pharmacy = pharma;

		return true;
	}

	public boolean updateImmunizations(String newImm)
	{
		immunizations.add(newImm);

		return true;
	}

	public boolean addMed(String newMed)
	{
		medications.add(newMed);

		return true;
	}

	public void viewMeds()
	{
		for(int i = 0; i < medications.size(); i++)
		{
			System.out.print("\n\tMedication: " + medications.get(i));
		}
	}

	public void viewHistory()
	{
		for(int i = 0; i < visualHistory.size(); i++)
		{
			System.out.print("\n\tHistory: " + visualHistory.get(i));
		}
	}
}