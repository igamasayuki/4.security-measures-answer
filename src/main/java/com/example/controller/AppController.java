package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	@GetMapping("")
	public String index() {
		return "index";
	}

	/**
	 * SQLインジェクション説明画面を表示します.
	 * 
	 * @return SQLインジェクション説明画面
	 */
	@GetMapping("/sqlinjection")
	public String sqlInjection() {
		return "sqlinjectionindex";
	}

	/**
	 * クロスサイトスクリプティング説明画面を表示します.
	 * 
	 * @return クロスサイトスクリプティング説明画面
	 */
	@GetMapping("/toxssindex")
	public String toXssIndex() {
		return "xssindex";
	}

	/**
	 * クロスサイトリクエストフォージェリ説明画面を表示します.
	 * 
	 * @return クロスサイトリクエストフォージェリ説明画面
	 */
	@GetMapping("/tocsrfindex")
	public String toCsrfIndex() {
		return "csrfindex";
	}
}
