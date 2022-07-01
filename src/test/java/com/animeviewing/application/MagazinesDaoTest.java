package com.animeviewing.application;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.animeviewing.application.daos.Magazines;
import com.animeviewing.application.daos.MagazinesDao;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class MagazinesDaoTest {

	@Autowired
	MagazinesDao magazinesDao;

	@Test
	void testFindAll() {
		// execute
		Iterable<Magazines> magazines = magazinesDao.findAll();

		// assert
		System.out.println(magazines);
	}

}
