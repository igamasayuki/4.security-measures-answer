package com.example.service;

import java.util.List;

import com.example.domain.Article;

/**
 * 記事を操作するサービスクラス.<br>
 * DBにはアクセスしないためリポジトリは呼びません。
 * 
 * @author igamasayuki
 *
 */
public class ArticleService {

	/**
	 * 記事を記事リストに追加します。<br>
	 * 本来であればここでリポジトリ(DAO)を呼び、記事をDBに保存します。
	 * 
	 * @param articleList
	 *            記事リスト
	 * @param article
	 *            記事情報
	 */
	public void postArticle(List<Article> articleList, Article article) {
		articleList.add(article);
	}

	/**
	 * 記事を記事リストから削除します。<br>
	 * 
	 * @param articleList
	 *            記事リスト
	 * @param index
	 *            削除する記事番号
	 */
	public void deleteArticle(List<Article> articleList, int index) {
		articleList.remove(index);
	}
}
