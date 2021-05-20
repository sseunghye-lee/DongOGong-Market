package com.dongogong.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserInfo implements Serializable {

    //회원 ID
    private String userId;

    //회원 이름
    private String name;

    //회원 닉네임
    private String nickName;

    //회원 전화번호
    private String phone;

    //회원 비밀번호
    private String password;

    public UserInfo() {

    }

    public UserInfo(String userId, String name, String nickName, String phone, String password) {
        this.userId = userId;
        this.name = name;
        this.nickName = nickName;
        this.phone = phone;
        this.password = password;
    }

    //getters & setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	/*public String getIndividual_corporation_status() {
		return individual_corporation_status;
	}

	public void setIndividual_corporation_status(String individual_corporation_status) {
		this.individual_corporation_status = individual_corporation_status;
	}
	 */

}
