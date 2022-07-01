package com.animeviewing.application;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.animeviewing.application.daos.Publishers;
import com.animeviewing.application.daos.PublishersDao;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PublishersDaoTest {

	@Autowired
	PublishersDao publishersDao;

	@Test
	void testFindAll() {
		// execute
		Iterable<Publishers> publishers = publishersDao.findAll();

		// assert
		System.out.println(publishers);
	}

}
