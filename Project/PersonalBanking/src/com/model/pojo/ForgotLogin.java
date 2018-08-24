package com.model.pojo;

public class ForgotLogin {
	String emailID;
	String question;
	String answer;
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "ForgotLogin [emailID=" + emailID + ", question=" + question
				+ ", answer=" + answer + "]";
	}
	public ForgotLogin(String emailID, String question, String answer) {
		super();
		this.emailID = emailID;
		this.question = question;
		this.answer = answer;
	}
}
