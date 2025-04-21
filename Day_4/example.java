package Day_4;
class book{
	String authour;
	int cost;
	int pages;
	
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	String horror() {
		return "horror books are avilable";
	}
	String motivation() {
		return "motivation books are avilable";
	}
}
class specialbook extends  book{
	String coverpage;
	int size;
}

public class example {
	public static void main(String[] args) {
		
		
	}

}
