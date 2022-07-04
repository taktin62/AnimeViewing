package com.animeviewing.application.daos;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Publish {

	/**
	 * フィールド
	 */
	@Id
	private Integer animationId;
	private Integer magazineId;

}
