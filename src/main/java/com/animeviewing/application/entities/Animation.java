package com.animeviewing.application.entities;

/**
 * アニメーションエンティティ
 */
public class Animation {
	/**
	 * フィールド
	 */
	private AnimationId AnimationId;
	private String title;
	private String genre;
	private String author;
	private String publisher;
	private String magazine;

	/**
	 * コンストラクター
	 */
	public Animation(AnimationId AnimationId, String title, String genre, String author, String publisher,
			String magazine) {
		this.AnimationId = AnimationId;
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.publisher = publisher;
		this.magazine = magazine;
	}

	/**
	 * getterメソッド
	 */
	public AnimationId getAnimationId() {
		return AnimationId;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getMagazineId() {
		return magazine;
	}

}
