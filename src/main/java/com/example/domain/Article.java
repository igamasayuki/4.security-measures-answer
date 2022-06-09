package com.example.domain;

/**
 * 掲示板の記事を表すクラス.
 * 
 * @author igamasayuki
 *
 */
public class Article {
	/** 名前 */
	private String name;
	/** 内容 */
	private String body;

	public Article() {
	}

	public Article(String name, String body) {
		this.name = name;
		this.body = body;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
