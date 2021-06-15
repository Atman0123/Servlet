package myproject;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mysql.fabric.xmlrpc.base.Data;
@Entity
@Table(name="notes")
public class note {
	@Id
	private int id;
	private String name;
	@Column(length = 1500)
	private String content;
	private Date adddate;
	
	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getAdddate() {
		return adddate;
	}
	
	public note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public note(String name, String content, Date date) {
		super();
		this.id = new Random().nextInt(1000);
		this.name = name;
		this.content = content;
		this.adddate = date;
	}
	
	
	
}
