package com.animeviewing.application.repositories;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.animeviewing.application.entities.Animation;

/**
 * アニメーションリポジトリークラス
 */
public interface AnimationRepository {
	/**
	 * アニメ一覧取得
	 */
	public List<Animation> findAll(Pageable pageable);

}
