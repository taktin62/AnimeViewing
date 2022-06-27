package com.animeviewing.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.animeviewing.application.entities.Animation;
import com.animeviewing.application.repositories.AnimationRepository;

/**
 * アニメーションサービスクラス
 */
@Service
@Transactional
public class AnimationService {
	@Autowired
	AnimationRepository animationRepository;

	/**
	 * アニメ一覧取得
	 * 20件ずつページネーション
	 */
	public List<Animation> getList(Pageable pageable) {

		return animationRepository.findAll(pageable);
	}

}
