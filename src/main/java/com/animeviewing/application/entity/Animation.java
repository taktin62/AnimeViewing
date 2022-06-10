package com.animeviewing.application.entity;

/**
 * ---エンティティ
 */
public class Animation {
	/**
	 * フィールド
	 */
	private Integer animationId;
	private String title;
	private String genre;
	private String authorId;
	private String publisherId;
	private String magazineId;

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

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}

	public String getMagazineId() {
		return magazineId;
	}

	public void setMagazineId(String magazineId) {
		this.magazineId = magazineId;
	}

}
