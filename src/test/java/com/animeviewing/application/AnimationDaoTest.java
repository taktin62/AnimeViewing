package com.animeviewing.application;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.transaction.annotation.Transactional;

import com.animeviewing.application.daos.AnimationDao;
import com.animeviewing.application.entities.AnimationId;

@DataJdbcTest
@Transactional
class AnimationDaoTest {

	@Autowired
	AnimationDao animationDao;

	@Test
	void testFindAll() {
		// execute
		Iterable<AnimationId> animationTitleFindAll = animationDao.findAll();

		// assert
        assertThat(animationTitleFindAll);
	}

}
