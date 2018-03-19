
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.util.ArrayList;
import java.util.List; /** * Simple Java program to read CSV file in Java. In this program we will read * list of books stored in CSV file as comma separated values. * * @author WINDOWS 8 * */ 
public class Tutorial1 { 
	public static void main(String[] args) { 
		List<Book> books = readBooksFromCSV("books.txt"); 
		for (Book b : books) { 
			System.out.println(b); 
		} 
	} 
	private static List<Book> readBooksFromCSV(String fileName) { 
		List<Book> books = new ArrayList<>(); 
		Path pathToFile = Paths.get(fileName)
		(BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) { 
		String line = br.readLine(); 
		while (line != null) { 
			String[] attributes = line.split(","); 
			Book book = createBook(attributes);
			books.add(book); 
			line = br.readLine(); 
			} 
		} catch (IOException ioe) { 
			ioe.printStackTrace(); 
		} 
		return books; 
	} 
	private static Book createBook(String[] metadata) { 
		String name = metadata[0]; 
		int price = Integer.parseInt(metadata[1]); 
		String author = metadata[2]; 
		return new Book(name, price, author); 
		} 
	} 
	class Book { 
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
	Output 
	Book [name=Effective Java, price=42, author=Joshua Bloch]
	Book [name=Head First Java, price=39, author=Kathy Sierra] 
	Book [name=Head First Design Pattern, price=44, author=Kathy Sierra] 
	Book [name=Introduction to Algorithm, price=72, author=Thomas Cormen]

}
