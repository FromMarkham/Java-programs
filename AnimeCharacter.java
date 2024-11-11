
public class AnimeCharacter{
	
	private String name;
	
	private String series;
	
	private int FirstAppearance;

	public AnimeCharacter(String name2,String series2,int FirstApperance2){
		
		
		
		name=name2;
		
		series=series2;
		
		FirstAppearance=FirstApperance2;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public int getFirstAppearance() {
		return FirstAppearance;
	}

	public void setFirstAppearance(int firstAppearance) {
		FirstAppearance = firstAppearance;
	}
	
	
	
	
}
