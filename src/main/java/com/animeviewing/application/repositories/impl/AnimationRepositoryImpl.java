package com.animeviewing.application.repositories.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.animeviewing.application.entity.Animation;
import com.animeviewing.application.repositories.AnimationRepository;

@Service
public class AnimationRepositoryImpl implements AnimationRepository {
	/**
	 * 全件取得
	 */
	@Override
	public List<Animation> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	/**
	 * 条件指定指定
	 */
	@Override
	public List<Animation> find(Animation animation) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	/**
	 * 登録
	 */
	@Override
	public void insert(Animation animation) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * 更新
	 */
	@Override
	public void update(Animation animation) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * 削除
	 */
	@Override
	public void delete(Integer animationId) {
		// TODO 自動生成されたメソッド・スタブ

	}
}