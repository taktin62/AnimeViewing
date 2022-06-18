package com.animeviewing.application.entities;

/**
 * アニメーションエンティティ
 */
public class Animation {
	/**
	 * フィールド
	 */
	private String title;
	private String genre;
	private String authorId;
	private String publisherId;
	private String magazineId;

	/**
	 * コンストラクター
	 */
	public Animation(String title, String genre, String authorId, String publisherId,
			String magazineId) {

		this.title = title;
		this.genre = genre;
		this.authorId = authorId;
		this.publisherId = publisherId;
		this.magazineId = magazineId;
	}

	/**
	 * getterメソッド
	 */
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
