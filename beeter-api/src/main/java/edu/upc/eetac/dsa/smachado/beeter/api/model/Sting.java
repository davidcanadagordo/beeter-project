package edu.upc.eetac.dsa.smachado.beeter.api.model;

public class Sting {

	private String stingid;
	private String username;
	private String authors;
	private String subject;
	private String content;
	private long creationTimestamp;
	private long lastmodified;
	
	public String getStingid() {
		return stingid;
	}
	public void setStingid(String stingid) {
		this.stingid = stingid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getCreationTimestamp() {
		return creationTimestamp;
	}
	public void setCreationTimestamp(long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}
	public long getLastmodified() {
		return lastmodified;
	}
	public void setLastmodified(long lastmodified) {
		this.lastmodified = lastmodified;
	}
	
	
}
