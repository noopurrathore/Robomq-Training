public abstract class Item{
	private int id;
	private String title;
	private int noOfCopies;
	
	public Item(int id,String title, int noOfCopies) {
		super();
		this.id=id;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
	public int setId(int i){
		id = i;
		return i;
		}
	public String setTitle(String s){
		title = s;
		return s;
		}
	public int setNoOfCopies(int n){
		noOfCopies = n;
		return n;
		}
	public int getId() {
			return id;
		}
	public String getTitle() {
			return title;
		}
	public int getNoOfCopies() {
			return noOfCopies;
		}
    public boolean equals() {
    	System.out.println("hey..!! I'm equals function..!!");
    }

	/*
	 * public void checkIn(){ noOfCopies = noOfCopies + 1; } 
	 * public void checkOut(){ noOfCopies = noOfCopies - 1; }
	 */
	public String toString(){ 
		  return id+" "+title+" "+noOfCopies;  
		 }  
	public void print(){
		System.out.println("ID: " +id);
		System.out.println("Title: " +title);
		System.out.println("Number of copies: " +noOfCopies);
		}
	
	public static void main(String args[]){ 
		Item[] it = new Item[4];

		
	}
}

	
	

public abstract class WrittenItem extends Item{
	public WrittenItem(int id, String title, int noOfCopies, String author) {
		super(id,title,noOfCopies);
		this.author = author;
	}

	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString(){
	return super.toString();
	}
	public int getId(){
	return super.getId();
	}
	public String getTitle(){
	return super.getTitle();
	}
	public int getNoOfCopies(){
	return super.getNoOfCopies();
	}
	public void print(){
	System.out.println("Book information: ");
	super.print();
	}
	
	public String setAuthor(String auth) {
		author=auth;
		return auth;
	}
	public String getAuthor() {
		return auth;
	}
}
public class Book extends WrittenItem{
	public Book(int id,String title, int noOfCopies, String author, int book_pages, String book_name) {
		super(id, title, noOfCopies, author);
		this.book_pages = book_pages;
		this.book_name = book_name;
	}
	int book_pages;
	String book_name;
	
	public int getBook_pages() {
		return book_pages;
	}
	public void setBook_pages(int book_pages) {
		this.book_pages = book_pages;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	
	public void display() { }
}

public class JournalPaper extends WrittenItem{
	public JournalPaper(int id, String title, int noOfCopies, String author, int year_of_pub) {
		super(id, title, noOfCopies, author);
		this.year_of_pub = year_of_pub;
	}

	private int year_of_pub;

	public int getYear_of_pub() {
		return year_of_pub;
	}

	public void setYear_of_pub(int year_of_pub) {
		this.year_of_pub = year_of_pub;
	}
	
	public void display() {	}
}

public abstract class MediaItem extends Item{
	public MediaItem(int id, String title, int noOfCopies int runtime) {
		super(id, title, noOfCopies);
		this.runtime = runtime;
	}

	private int runtime;

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
}

public class Video extends MediaItem{
	ppublic ClassVideo(int id, String title, int noOfCopies, int runtime, String director, String genre,
			String year_released) {
		super(id,title, noOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.year_released = year_released;
	}
	private String director;
	private String genre;
	private String year_released;
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getYear_released() {
		return year_released;
	}
	public void setYear_released(String year_released) {
		this.year_released = year_released;
	}
	
	public void display() {	}
}

public class CD extends MediaItem{
	public ClassCD(int id, String title, int noOfCopies, int runtime, String artist, String genre) {
		super(id, title, noOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	private String artist;
	private String genre;
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void display() {	}
}

	






