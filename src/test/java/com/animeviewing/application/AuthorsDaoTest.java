package com.animeviewing.application;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.animeviewing.application.daos.Authors;
import com.animeviewing.application.daos.AuthorsDao;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class AuthorsDaoTest {

	@Autowired
	AuthorsDao authorsDao;

	@Test
	void testFindAll() {
		// execute
		Iterable<Authors> authors = authorsDao.findAll();

		// assert
		System.out.println(authors);
	}

}
