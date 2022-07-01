package com.animeviewing.application.daos;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Magazines {

	/**
	 * フィールド
	 */
	@Id
	private Integer magazineId;
	private Integer publisherId;
	private String name;
}
