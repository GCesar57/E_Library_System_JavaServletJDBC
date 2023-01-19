package Beans;

public class BookBean {
	private String callno;
	private String name;
	private String author;
	private String publisher;
	private int quantity;
	private int issues;
	//
	public BookBean() {
		super();
	}
	//
	public BookBean(String callno, String name, String author, String publisher, int quantity, int issues) {
		super();
		this.callno = callno;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
		this.issues = issues;
	}
	//
	public BookBean(String callno, String name, String author, String publisher, int quantity) {
		super();
		this.callno = callno;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	//
	public String getCallno() {
		return callno;
	}
	public void setCallno(String callno) {
		this.callno = callno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getIssues() {
		return issues;
	}
	public void setIssues(int issues) {
		this.issues = issues;
	}
	
}
