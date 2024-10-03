package herenciaPerson;

public class Student extends Person{
	private String programa;
	private int year;
	private double feet;
	
	public Student(String name, String address, String programa, int year, double feet) {
		super(name, address);
		this.programa = programa;
		this.year = year;
		this.feet = feet;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFeet() {
		return feet;
	}

	public void setFeet(double feet) {
		this.feet = feet;
	}

	@Override
	public String toString() {
		return "Student [programa=" + programa + ", year=" + year + ", feet=" + feet + "]";
	}
	
	
	
	
}

