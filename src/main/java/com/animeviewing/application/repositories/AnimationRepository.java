package com.animeviewing.application.repositories;

import java.util.List;

import com.animeviewing.application.entities.Animation;

public interface AnimationRepository {
	/**
	 * 全件取得
	 */
	public List<Animation> findAll();

	/**
	 * 条件指定
	 */
	public List<Animation> find(Animation animation);

	/**
	 * 登録
	 */
	public void create(Animation animation);

	/**
	 * 更新
	 */
	public void update(Animation animation);

	/**
	 * 削除
	 */
	public void delete(Integer animationId);
}
