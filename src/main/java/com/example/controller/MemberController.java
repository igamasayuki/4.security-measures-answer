package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;
import com.example.service.MemberService;

/**
 * メンバー検索アプリケーションのコントローラ.
 * 
 * @author igamasayuki
 *
 */
@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService memberService;

	/**
	 * メンバー検索画面を表示します.
	 * 
	 * @return メンバー検索画面
	 */
	@RequestMapping("/show")
	public String showSearchMember() {
		return "searchmember";
	}

	/**
	 * メンバーを検索します.
	 * 
	 * @param name  入力された名前
	 * @param model モデル
	 * @return メンバー検索画面
	 */
	@RequestMapping("/search")
	public String serchMemberByLikeName(String name, Model model) {
		List<Member> members = memberService.findByLikeName(name);
		model.addAttribute("members", members);
		return "searchmember";
	}
}
