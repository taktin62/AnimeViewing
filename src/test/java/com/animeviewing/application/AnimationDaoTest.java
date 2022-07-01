package com.animeviewing.application;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.animeviewing.application.daos.AnimationDao;
import com.animeviewing.application.daos.Animations;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class AnimationDaoTest {

	@Autowired
	AnimationDao animationDao;

	@Test
	void testFindAll() {
		// execute
		Iterable<Animations> animations = animationDao.findAll();

		// assert
		System.out.println(animations);
	}

}
