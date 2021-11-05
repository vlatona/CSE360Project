
public class Nurse {
	
	private String fName, lName;
	private int month, day, year, id;
	
	
	public void setFirstName(String firstName) {
		fName = firstName;
	}
	
	public void setLastName(String lastName) {
		lName = lastName;
	}
	
	public void setDOB(int monthOfBirth, int dayOfBirth, int yearOfBirth) {
		month = monthOfBirth;
		day = dayOfBirth;
		year = yearOfBirth;
	}
	
	public String getFirstName() {
		return fName;
	}
	
	public String getLastName() {
		return lName;
	}
	
	public int getMonthOfBirth() {
		return month;
	}
	
	public int getDayOfBirth() {
		return day;
	}
	
	public int getYearOfBirth() {
		return year;
	}
	
	
	public String toString() {
		return ("\nNurse Name:\t" + getFirstName() + getLastName() + 
				"\nNurse ID:\t" + getMonthOfBirth() + "/" + getDayOfBirth() + "/" + getYearOfBirth() + "\n\n");
	}

}
