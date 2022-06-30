package com.animeviewing.application;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Color1Test {
	@Test
	public void test1() {
		// 期待する値
		Integer expected = 1;
		// 実際の実行結果を受けての値
		Integer actual = 1;
		// 比較検証
		assertEquals(expected, actual);
	}

}
