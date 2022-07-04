package com.animeviewing.application.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * パブリッシュダオクラス
 */
@Component
public interface PublishDao extends CrudRepository<Publish, Integer> {

}
