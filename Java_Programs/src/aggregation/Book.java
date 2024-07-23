package aggregation;

public class Book 
{
	String title;
	String type;
	int pages;
	
Author a;
	
public Book(String title, String type, int pages, Author a)
{
	this.title=title;
	this.type=type;
	this.pages=pages;
	this.a=a;
}

public void details()
{
	System.out.println(" Title of the Book is " +title);
	System.out.println(" Type: " +type);
	System.out.println(" Total number of pages: " +pages);
	
	System.out.println("Author - " +a.name);
	System.out.println("Place - " +a.place);
	
}


	public static void main(String[] args) 
	{
		Author obj = new Author("Robin", "Canada");
		
		Book b = new Book("Monk", "SelfHelp", 263, obj);
		b.details();
		// TODO Auto-generated method stub

	}

}
