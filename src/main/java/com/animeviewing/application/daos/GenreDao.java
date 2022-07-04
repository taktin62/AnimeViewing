package com.animeviewing.application.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * ジャンルーダオクラス
 */
@Component
public interface GenreDao extends CrudRepository<Genre, String> {

}
