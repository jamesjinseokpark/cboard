package kr.co.vo;

public class Member {
	String id;
	String pwd;
	String name;
	String email;
	String pnum;
	String userZipCode;
	String userFirstAddr;
	String userSecondAddr;
	String userExtraAddr;
	String cardCheck;
	String likeStore;
	String udCheck;
	String pwQuestion;
	String pwAnswer;
	String reason;
	String grade;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getUserZipCode() {
		return userZipCode;
	}
	public void setUserZipCode(String userZipCode) {
		this.userZipCode = userZipCode;
	}
	public String getUserFirstAddr() {
		return userFirstAddr;
	}
	public void setUserFirstAddr(String userFirstAddr) {
		this.userFirstAddr = userFirstAddr;
	}
	public String getUserSecondAddr() {
		return userSecondAddr;
	}
	public void setUserSecondAddr(String userSecondAddr) {
		this.userSecondAddr = userSecondAddr;
	}
	public String getUserExtraAddr() {
		return userExtraAddr;
	}
	public void setUserExtraAddr(String userExtraAddr) {
		this.userExtraAddr = userExtraAddr;
	}
	public String getCardCheck() {
		return cardCheck;
	}
	public void setCardCheck(String cardCheck) {
		this.cardCheck = cardCheck;
	}
	public String getLikeStore() {
		return likeStore;
	}
	public void setLikeStore(String likeStore) {
		this.likeStore = likeStore;
	}
	public String getUdCheck() {
		return udCheck;
	}
	public void setUdCheck(String udCheck) {
		this.udCheck = udCheck;
	}
	public String getPwQuestion() {
		return pwQuestion;
	}
	public void setPwQuestion(String pwQuestion) {
		this.pwQuestion = pwQuestion;
	}
	public String getPwAnswer() {
		return pwAnswer;
	}
	public void setPwAnswer(String pwAnswer) {
		this.pwAnswer = pwAnswer;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", pnum=" + pnum
				+ ", userZipCode=" + userZipCode + ", userFirstAddr=" + userFirstAddr + ", userSecondAddr="
				+ userSecondAddr + ", userExtraAddr=" + userExtraAddr + ", cardCheck=" + cardCheck + ", likeStore="
				+ likeStore + ", udCheck=" + udCheck + ", pwQuestion=" + pwQuestion + ", pwAnswer=" + pwAnswer
				+ ", reason=" + reason + ", grade=" + grade + "]";
	}


}