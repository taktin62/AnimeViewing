package com.animeviewing.application.repositories.impl;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.animeviewing.application.entities.Animation;
import com.animeviewing.application.repositories.AnimationRepository;

/**
* アニメーションリポジトリーインプルクラス
*/
@Repository
public class AnimationRepositoryImpl implements AnimationRepository {

	@Override
	public List<Animation> findAll(Pageable pageable) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
