package com.animeviewing.application.controllers;

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
		//サービスクラスのgetList()を呼び出す
		return "/list";

	}

	/**
	 * タイトル検索画面遷移 初回用
	 * タイトル一覧画面から検索ボタンを押下時、
	 * 遷移の仕方が下記の通りでよいいのか仕様を再度読み込んでから作り込みする
	 */
	@RequestMapping("/select")
	public String select(Model model) {
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
	public String update(Model model) {
		return "edit";
	}

	/**
	 * タイトル検索画面遷移 初回用
	 * タイトル一覧画面から削除ボタンを押下時、
	 * 遷移の仕方が下記の通りでよいいのか仕様を再度読み込んでから作り込みする
	 */
	@RequestMapping("/delete")
	public String delete(Model model) {
		return "/list";

	}
}
