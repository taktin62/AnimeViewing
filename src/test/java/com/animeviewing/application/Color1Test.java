package com.animeviewing.application;

import static org.hamcrest.CoreMatchers.*;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Color1Test {

	//	@Test
	//	void testGetColor() {
	//		fail("まだ実装されていません");
	//	}

	private void assertThat(String t1, Matcher<String> matcher) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Test
	@DisplayName("1つめのテスト")
	public void testGetColor1() {
		Color1 c1 = new Color1();
		String t1 = c1.getColor(1);
		assertThat(t1, is("赤"));
	}

	@Test
	@DisplayName("2つめのテスト")
	public void testGetColor2() {
		Color1 c1 = new Color1();
		String t1 = c1.getColor(2);
		assertThat(t1, is("青"));
	}

	@Test
	@DisplayName("3つめのテスト")
	public void testGetColor3() {
		Color1 c1 = new Color1();
		String t1 = c1.getColor(3);
		assertThat(t1, is("1or2を入力して下さい"));
	}
}
