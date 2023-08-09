package com.app.domain;

public class UserVO {
//	user_id NUMBER CONSTRAINT pk_user PRIMARY KEY,
//	USER_IDENTIFIcation varchar2(500) UNIQUE NOT NULL,
//	USER_password varchar2(500) NOT NULL,
//	USER_name varchar2(500) NOT NULL,
//	USER_phone varchar2(500) NOT NULL,
//	USER_nickname varchar2(500),
//	USER_email varchar2(500) NOT NULL ,
//	USER_ADDRESS varchar2(500) ,
//	USER_BIRTH DATE ,
//	USER_RECOMMENDER_ID VARCHAR2(500)
	
	private long userId;
	private String userIdetification;
	private String userPassword;
	private String userName;
	private String userPhone;
	private String userNickname;
	private String userEmail;
	private String userAddress;
	private String userBirth;
	private String userRecommenderId;
	
//	public UserVO(long userId, String userPassword, String userName) {
//		super();
//		this.userId = userId;
//		this.userPassword = userPassword;
//		this.userName = userName;
//	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserIdetification() {
		return userIdetification;
	}

	public void setUserIdetification(String userIdetification) {
		this.userIdetification = userIdetification;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	public String getUserRecommenderId() {
		return userRecommenderId;
	}

	public void setUserRecommenderId(String userRecommenderId) {
		this.userRecommenderId = userRecommenderId;
	}
	
	
	
	
}
