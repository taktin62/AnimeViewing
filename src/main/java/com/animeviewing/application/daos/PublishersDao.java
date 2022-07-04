package com.animeviewing.application.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * パブリッシャーズダオクラス
 */
@Component
public interface PublishersDao extends CrudRepository<Publishers, Integer> {

}
