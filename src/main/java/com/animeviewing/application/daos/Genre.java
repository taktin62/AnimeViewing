package com.animeviewing.application.daos;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Genre {

	/**
	 * フィールド
	 */
	@Id
	private String label;

}
