package me.zeph.techstack.pss.vo;


import org.hibernate.validator.constraints.NotEmpty;

public class UserVO {

	@NotEmpty
	private String username;
	@NotEmpty
	private String password;

	public UserVO(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
