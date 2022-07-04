package com.animeviewing.application.daos;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Publishers {

	/**
	 * フィールド
	 */
	@Id
	private Integer publisherId;
	private String name;

}
