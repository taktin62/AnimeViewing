package com.animeviewing.application;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.animeviewing.application.daos.Genre;
import com.animeviewing.application.daos.GenreDao;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class GenreDaoTest {

	@Autowired
	GenreDao genreDao;

	@Test
	void testFindAll() {
		// execute
		Iterable<Genre> genre = genreDao.findAll();

		// assert
		System.out.println(genre);
	}

}
