package com.animeviewing.application;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.animeviewing.application.daos.Publish;
import com.animeviewing.application.daos.PublishDao;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PublishDaoTest {

	@Autowired
	PublishDao publishDao;

	@Test
	void testFindAll() {
		// execute
		Iterable<Publish> publish = publishDao.findAll();

		// assert
		System.out.println(publish);
	}

}
