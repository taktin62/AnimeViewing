package com.animeviewing.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * タイトル一覧画面周りコントローラ
 */
@Controller
public class AnimeTitleController {

	/**
	 * タイトル一覧画面遷移 初回用
	 */
	@RequestMapping("/")
	public String index(Model model) {
		return "/list";

	}

	/**
	 * タイトル新規登録画面遷移
	 */
	@RequestMapping("new")
	public String creat(Model model) {
		return "new";
	}

	/**
	 * タイトル更新画面遷移
	 */
	@RequestMapping("edit")
	public String upDate(Model model) {
		return "edit";
	}
}
