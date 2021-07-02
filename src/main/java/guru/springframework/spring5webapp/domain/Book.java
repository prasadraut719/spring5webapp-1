package guru.springframework.spring5webapp.domain;

import java.util.Set;

public class Book {
	private String title;
	private String sbin;
	private Set<Author> authors;
	
	public Book(String title, String sbin, Set<Author> authors) {
		super();
		this.title = title;
		this.sbin = sbin;
		this.authors = authors;
	}

	public Book() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSbin() {
		return sbin;
	}

	public void setSbin(String sbin) {
		this.sbin = sbin;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	
	
}
