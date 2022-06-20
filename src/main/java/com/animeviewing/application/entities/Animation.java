package com.animeviewing.application.entities;

import java.util.Optional;

/**
 * アニメーションエンティティ
 */
public class Animation {
	/**
	 * フィールド
	 */
	private AnimationId animationId;
	private String title;
	private String genre;
	private String author;
	private String publisher;
	private String magazine;

	/**
	 * コンストラクター
	 */
	public Animation(AnimationId animationId, String title, String genre, String author, String publisher,
			String magazine) {
		this.animationId = animationId;
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
		return animationId;
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

	public Optional<String> getMagazine() {

		return Optional.ofNullable(magazine);
	}

}
