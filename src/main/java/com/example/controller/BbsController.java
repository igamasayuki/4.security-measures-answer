package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Article;
import com.example.service.ArticleService;

/**
 * 掲示板アプリケーションのコントローラ.
 * 
 * @author igamasayuki
 *
 */
@Controller
@RequestMapping("/bbs")
public class BbsController {
	@Autowired
	private HttpSession session;

	/**
	 * 投稿画面を表示します.
	 * 
	 * @return 掲示板画面
	 */
	@RequestMapping("/show")
	public String showBbs() {
		@SuppressWarnings("unchecked")
		List<Article> articleList = (List<Article>) session.getAttribute("articleList");
		if(articleList == null) {
			articleList = new ArrayList<Article>();
		}
		session.setAttribute("articleList", articleList);	
		
		// 投稿画面へ遷移
		return "bbs";
	}

	/**
	 * 記事を投稿します.
	 * 
	 * @param name
	 *            リクエストパラメータのname
	 * @param body
	 *            リクエストパラメータのbody
	 * @return 掲示板画面
	 */
	@RequestMapping("/postArticle")
	public String postArticle(String name, String body) {
		@SuppressWarnings("unchecked")
		List<Article> articleList = (List<Article>) session.getAttribute("articleList");
		Article article = new Article(name, body);
		ArticleService articleService = new ArticleService();
		articleService.postArticle(articleList, article);
		return "redirect:/bbs/show";
	}

	/**
	 * 記事を削除します.
	 * 
	 * @param index
	 *            リクエストパラメータのindex
	 * @return 掲示板画面
	 */
	@RequestMapping("/deleteArticle")
	public String deleteArticle(String index) {
		@SuppressWarnings("unchecked")
		List<Article> articleList = (List<Article>) session.getAttribute("articleList");
		ArticleService articleService = new ArticleService();
		int intIndex = Integer.parseInt(index); //indexをStringからintに変換
		articleService.deleteArticle(articleList, intIndex);
		return "redirect:/bbs/show";
	}
}
