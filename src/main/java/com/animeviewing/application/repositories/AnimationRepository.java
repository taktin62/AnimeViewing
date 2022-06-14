package com.animeviewing.application.repositories;

import java.util.List;

import com.animeviewing.application.entity.Animation;

public interface AnimationRepository {
	/**
	 * 全件取得
	 */
	public List<Animation> findAll();

	/**
	 * 条件指定指定
	 */
	public List<Animation> find(Animation AnimationInfo);
}
