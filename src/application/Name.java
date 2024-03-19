package application;

public class Name implements Comparable<Name> {
	String name;
	char gender;
	int freg;
	

	public Name(String name, char gender, int freg) {
		
		this.name = name;
		this.gender = gender;
		this.freg = freg;
	}
	
	


	




	public String getName() {
		return name;
	}









	public void setName(String name) {
		this.name = name;
	}









	public char getGender() {
		return gender;
	}









	public void setGender(char gender) {
		if(gender == 'f'|| gender == 'm') {
		this.gender = gender;
		}
		else
			System.out.println("al7md llah ala al-islam");
	}









	public int getFreg() {
		return freg;
	}









	public void setFreg(int freg) {
		this.freg = freg;
	}









	









	@Override
	public int compareTo(Name o) {
		
		return 0;
	}

}
