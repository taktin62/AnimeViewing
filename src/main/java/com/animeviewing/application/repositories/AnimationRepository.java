package com.animeviewing.application.repositories;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.animeviewing.application.entities.Animation;

public interface AnimationRepository {
	/**
	 * 全件取得
	 */
	public List<Animation> findAll(Pageable pageable);

	/**
	 * 条件指定
	 */
	public List<Animation> find(Animation animation);

	/**
	 * 登録
	 */
	public void create(Animation animation);

}
