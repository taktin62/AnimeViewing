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

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public String getAuthorId() {
		return authorId;
	}

	public String getPublisherId() {
		return publisherId;
	}

	public String getMagazineId() {
		return magazineId;
	}

}
