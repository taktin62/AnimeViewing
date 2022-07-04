package com.animeviewing.application.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * マガジンズダオクラス
 */
@Component
public interface MagazinesDao extends CrudRepository<Magazines, Integer> {

}
