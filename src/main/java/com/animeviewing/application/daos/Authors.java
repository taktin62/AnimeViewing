package com.animeviewing.application.daos;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Authors {

	/**
	 * フィールド
	 */
	@Id
	private Integer authorId;
	private String name;

}
