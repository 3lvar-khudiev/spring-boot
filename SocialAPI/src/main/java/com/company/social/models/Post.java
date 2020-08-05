package com.company.social.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Post extends Auditable<String> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "userId", insertable = false, updatable = false)
	private User user;

	private Integer userId;
	private LocalDateTime postDate;
	private String details;

	public Post() {
	}

	public Post(Integer id, LocalDateTime postdate, User user, Integer userId, String details) {
		this.id = id;
		this.postDate = postdate;
		this.user = user;
		this.userId = userId;
		this.details = details;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getPostdate() {
		return postDate;
	}

	public void setPostdate(LocalDateTime postdate) {
		this.postDate = postdate;
	}

	@JsonBackReference
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}
