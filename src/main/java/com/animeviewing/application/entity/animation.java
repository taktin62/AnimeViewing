package com.animeviewing.application.entity;

/**
 * ---エンティティ
 */
public class animation {
	/**
	 * フィールド
	 */
	private Integer animationId;
	private String title;
	private String genre;
	private String author_id;
	private String publisher_id;
	private String magazine_id;

	public Integer getAnimationId() {
		return animationId;
	}

	public void setAnimationId(Integer animationId) {
		this.animationId = animationId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}

	public String getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(String publisher_id) {
		this.publisher_id = publisher_id;
	}

	public String getMagazine_id() {
		return magazine_id;
	}

	public void setMagazine_id(String magazine_id) {
		this.magazine_id = magazine_id;
	}

}
