
public class Book {
	private String name; 
	private int price1; 
	private String author1; 
	
	public Book(String name, int price, String author) { 
		this.name = name; 
		this.price1 = price; 
		this.author1 = author; 
	} 
	public String getName() { 
		return name; 
	} 
	public void setName(String name) { 
		this.name = name; 
	} 
	public int getPrice() { 
		return price1; 
	} 
	public void setPrice(int price) { 
		this.price1 = price; 
	} 
	public String getAuthor() { 
		return author1; 
	} 
	public void setAuthor(String author) { 
		this.author1 = author; 
	} @Override 
	public String toString() { 
		return "Book [name=" + name + ", price=" + price1 + ", author=" + author1 + "]"; 
	} 
}
