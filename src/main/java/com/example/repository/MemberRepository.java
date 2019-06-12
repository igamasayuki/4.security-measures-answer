package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Member;

/**
 * membersテーブル操作用のリポジトリクラス.
 * 
 * @author igamasayuki
 */
@Repository
public class MemberRepository {

	/**
	 * ResultSetオブジェクトからMemberオブジェクトに変換するためのクラス実装&インスタンス化
	 */
	private static final RowMapper<Member> MEMBER_ROW_MAPPER = (rs, i) -> {
		Integer id = rs.getInt("id");
		String name = rs.getString("name");
		String mailAddress = rs.getString("mail_address");
		String password = rs.getString("password");
		boolean isAdmin = rs.getBoolean("is_admin");
		return new Member(id, name, mailAddress, password, isAdmin);
	};

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	/**
	 * 名前からメンバーを曖昧検索する.
	 * 
	 * @param name
	 *            名前
	 * @return 検索されたメンバー一覧 
	 */
	public List<Member> findByLikeName(String name) {
		String sql = "SELECT id, name, mail_address, password, is_admin "
				   + "FROM members WHERE name like :name "
				   + "AND is_admin != true";
		SqlParameterSource param = new MapSqlParameterSource().addValue("name", "%" + name + "%");
		
		return jdbcTemplate.query(sql, param, MEMBER_ROW_MAPPER);
	}
}
