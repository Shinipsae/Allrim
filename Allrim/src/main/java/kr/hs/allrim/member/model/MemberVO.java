package kr.hs.allrim.member.model;

public class MemberVO {
	
	private String userEmail;
	private String userPw;
	private String userGrade;
	private String userClass;
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}
	public String getUserClass() {
		return userClass;
	}
	public void setUserClass(String userClass) {
		this.userClass = userClass;
	}
	
	@Override
	public String toString() {
		return "MemberVO [userEmail=" + userEmail + ", userPw=" + userPw + ", userGrade=" + userGrade + ", userClass="
				+ userClass + "]";
	}

}
