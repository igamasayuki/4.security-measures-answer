package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * アプリケーション全体をコントロールするコントローラ.
 * 
 * @author igamasayuki
 *
 */
@Controller
@RequestMapping("/")
public class AppController {
	/**
	 * トップ画面を表示します.
	 * 
	 * @return トップ画面
	 */
	@RequestMapping("")
	public String index() {
		return "index";
	}

	/**
	 * SQLインジェクション説明画面を表示します.
	 * 
	 * @return SQLインジェクション説明画面
	 */
	@RequestMapping("/sqlinjection")
	public String sqlInjection() {
		return "sqlinjectionindex";
	}

	/**
	 * クロスサイトスクリプティング説明画面を表示します.
	 * 
	 * @return クロスサイトスクリプティング説明画面
	 */
	@RequestMapping("/toxssindex")
	public String toXssIndex() {
		return "xssindex";
	}

	/**
	 * クロスサイトリクエストフォージェリ説明画面を表示します.
	 * 
	 * @return クロスサイトリクエストフォージェリ説明画面
	 */
	@RequestMapping("/tocsrfindex")
	public String toCsrfIndex() {
		return "csrfindex";
	}
}
