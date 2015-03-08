/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Maciel B
 *
 */
@Entity
@Table(name = "session")
public class Session {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="TesterId")
	private int testerId; 
	@Column(name="testerName")
	private String testerName;
	@Column(name="duration")
	private String duration;
	@Column(name="comments")
	private String comments;
	@JoinColumn(name="charter", referencedColumnName="fk_charter")
	@ManyToOne(optional= false)
	private Charter charter;
	@JoinColumn(name="product", referencedColumnName="fk_product")
	@ManyToOne(optional= false)
	private Product product;
	@OneToMany(cascade = CascadeType.ALL,mappedBy="session")
	private List<Issue> issues;
	@Column(name="currenttime")
	private int currentTime;

	public Session(){
		this.id = 0;
		this.testerId = 0;
		this.testerName = "";
		this.duration = "";
		this.comments = "";
		this.charter = new Charter();
		this.product = new Product();
		this.issues = new ArrayList<Issue>();
		this.currentTime = 0;
	}

	public int getId() {
		return id;
	}

	public int getTesterId() {
		return testerId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTesterId(int testerId) {
		this.testerId = testerId;
	}

	public String getTesterName() {
		return testerName;
	}

	public void setTesterName(String testerName) {
		this.testerName = testerName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Charter getCharter() {
		return charter;
	}

	public void setCharter(Charter charter) {
		this.charter = charter;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Issue> getIssues() {
		return issues;
	}

	public void setIssues(List<Issue> issues) {
		this.issues = issues;
	}

	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
}
