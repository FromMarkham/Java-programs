
public class Treaty{
	
	private String name;
	
	private int number;
	
	private int StartYear;
	
	private int EndYear;

	
	
	public Treaty(String name, int number, int startYear, int endYear) {
		super();
		
		this.name = name;
		
		this.number = number;
		
		StartYear = startYear;
		
		EndYear = endYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getStartYear() {
		return StartYear;
	}

	public void setStartYear(int startYear) {
		StartYear = startYear;
	}

	public int getEndYear() {
		return EndYear;
	}

	public void setEndYear(int endYear) {
		EndYear = endYear;
	}

	@Override
	public String toString() {
		return "Treaty [name=" + name + ", number=" + number + ", StartYear=" + StartYear + ", EndYear=" + EndYear
				+ "]";
	}
	
	
}
