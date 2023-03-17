package main;

public class Doctor extends HospitalEmployee {
	protected String specialty;
	public Doctor(String name, int number,String specialty) {
		super(name, number);
		specialty = this.specialty;
		
	}
	
	public String getSpecialty() {return specialty;}
	public void setSpecialty(String specialty) {specialty = this.specialty;}
	
	@Override
	public String toString() {
		return name + " "+number+ " "+specialty;
	}
	
	@Override
	public void work() {
		System.out.println(name+" works for the hospital"+ " "
	+ name+" is a(n) "+ specialty+ "doctor.");
	}

}
