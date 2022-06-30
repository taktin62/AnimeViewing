package com.animeviewing.application.daos;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.animeviewing.application.entities.AnimationId;

/**
 * アニメーションダオクラス
 */
@Repository
public interface AnimationDao extends CrudRepository<AnimationId, String>{

	/**
	 * タイトル一覧取得クエリ文
	 */
	@Query("SELECT a.title, a.genre, t.name, ps.name, m.name\r\n"
			+ "	FROM animation_view.animations a\r\n"
			+ "		LEFT JOIN animation_view.publish p ON a.animation_id = p.animation_id\r\n"
			+ "		LEFT JOIN animation_view.magazines m ON p.magazine_id = m.magazine_id\r\n"
			+ "		INNER JOIN animation_view.authors t ON a.author_id = t.author_id\r\n"
			+ "		INNER JOIN animation_view.publishers ps ON a.publisher_id = ps.publisher_id;")
	Iterable<AnimationId> findAll();
}
