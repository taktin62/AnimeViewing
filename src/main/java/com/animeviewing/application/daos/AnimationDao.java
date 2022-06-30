package com.animeviewing.application.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * アニメーションダオクラス
 */
@Component
public interface AnimationDao extends CrudRepository<Animations, Integer> {

}
