package com.animeviewing.application.form;

/**
* タイトル一覧画面用フォーム
*/
public class TitleListForm {
	//タイトル一覧画面（titleList.html）の入力値を取得
	private Integer animationId;
	private String title;
	private String genre;
	private String author;
	private String publisher;
	private String magazine;

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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getMagazine() {
		return magazine;
	}

	public void setMagazine(String magazine) {
		this.magazine = magazine;
	}

}
