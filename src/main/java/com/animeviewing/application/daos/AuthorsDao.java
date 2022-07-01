package com.animeviewing.application.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * アーサーダオクラス
 */
@Component
public interface AuthorsDao extends CrudRepository<Authors, Integer> {

}
