
public class Book{
	
	private String Title;
	
	private String Author;
	
	private int PageCount;
	
	private int YearPublished;
	
	private double Isbn;
	
	private double Cost;
	
	
	
	public Book(String title, String author, int pageCount, int yearPublished, double isbn, double cost) {
		super();
		Title = title;
		
		Author = author;
		PageCount = pageCount;
		
		YearPublished = yearPublished;
		
		Isbn = isbn;
		Cost = cost;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getPageCount() {
		return PageCount;
	}

	public void setPageCount(int pageCount) {
		PageCount = pageCount;
	}

	public int getYearPublished() {
		return YearPublished;
	}

	public void setYearPublished(int yearPublished) {
		YearPublished = yearPublished;
	}

	public double getIsbn() {
		return Isbn;
	}

	public void setIsbn(double isbn) {
		Isbn = isbn;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	@Override
	public String toString() {
		return "Book [Title=" + Title + ", Author=" + Author + ", PageCount=" + PageCount + ", YearPublished="
				+ YearPublished + ", Isbn=" + Isbn + ", Cost=" + Cost + "]";
	}
	
	
	
}
