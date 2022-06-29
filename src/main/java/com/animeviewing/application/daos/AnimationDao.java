package com.animeviewing.application.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * アニメーションダオクラス
 */
@Repository
public class AnimationDao {

	private final NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public AnimationDao(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
	/**
	 * アニメ一覧取得
	 */

}
