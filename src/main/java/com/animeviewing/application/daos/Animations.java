package com.animeviewing.application.daos;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Animations {

	/**
	 * フィールド
	 */
	@Id
	private Integer animationId;
	private String title;
	private String genre;
	private Integer authorId;
	private Integer publisherId;

}
