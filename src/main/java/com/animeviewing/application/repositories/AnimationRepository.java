package com.animeviewing.application.repositories;

import java.util.List;

import com.animeviewing.application.entities.Animation;

/**
 * アニメーションリポジトリークラス
 */
public interface AnimationRepository {
	/**
	 * アニメ一覧取得
	 */
	public List<Animation> findAll(Integer limit, Integer offset);

}
