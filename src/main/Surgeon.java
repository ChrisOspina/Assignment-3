package main;

public class Surgeon extends Doctor{
	private boolean operating;

	public Surgeon(String name, int number, String specialty, boolean operating) {
		super(name, number, specialty);
		this.operating = operating;
		// TODO Auto-generated constructor stub
	}

	public boolean isOperating() {
		return operating;
	}

	public void setOperating(boolean operating) {
		this.operating = operating;
	}
	
	@Override
	public String toString() {
		return name + " "+number+ " "+specialty+" Operating:"+operating;
	}
	
	@Override
	public void work() {
		if(!isOperating()) {
			operating = true;
			work();
		}
		else {
			System.out.println(name+" works for the hospital. "+
		name+" is operating now");
		}
	}

}
