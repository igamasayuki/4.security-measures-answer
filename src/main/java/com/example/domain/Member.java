package com.example.domain;

/**
 * メンバー情報を保持するエンティティ.
 * @author igamasayuki
 */
public class Member{
	/** id(主キー) */
	private Integer id;
	/** 名前 */
	private String name;
	/** メールアドレス */
	private String mailAddress;
	/** パスワード */
	private String password;
	/** 管理者フラグ */
	private boolean isAdmin;
	
	public Member() {}
	public Member(Integer id, String name, String mailAddress, String password, boolean isAdmin) {
		this.id = id;
		this.name = name;
		this.mailAddress = mailAddress;
		this.password = password;
		this.isAdmin = isAdmin;
	}
	/**
	 * 権限名を返します.
	 * @return 一般利用者 or 管理者(通常管理者はセキュリティの関係上検索されません)
	 */
	public String getRoleName() {
		if(isAdmin) {
			return "管理者(通常は一覧に出てきません)";
		} else {
			return "一般利用者";
		}
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
}
