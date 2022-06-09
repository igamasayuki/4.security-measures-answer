package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Member;
import com.example.repository.MemberRepository;

/**
 * メンバーを操作するサービスクラス.
 * 
 * @author igamasayuki
 *
 */
@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;

	/**
	 * 名前からメンバーを曖昧検索する.
	 * 
	 * @param name 名前
	 * @return 検索されたメンバー一覧
	 */
	public List<Member> findByLikeName(String name) {
		return memberRepository.findByLikeName(name);
	}

}
