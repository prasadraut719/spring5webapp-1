package guru.springframework.spring5webapp.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String sbin;
	@ManyToMany
	@JoinTable(name = "author_book", joinColumns = @JoinColumn(name ="book_id"),
	inverseJoinColumns = @JoinColumn(name = "author_id"))
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

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
