package Beans;

import java.sql.Date;

public class IssueBookBean {
	private String callno;
	private String studentid;
	private String studentname;
	private int studentmobile;
	private Date issueddate;
	private String returnstatus;
	//
	public IssueBookBean() {
		super();
	}
	//
	public IssueBookBean(String callno, String studentid, String studentname, int studentmobile) {
		super();
		this.callno = callno;
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentmobile = studentmobile;
	}
	//
	public String getCallno() {
		return callno;
	}
	public void setCallno(String callno) {
		this.callno = callno;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentmobile() {
		return studentmobile;
	}
	public void setStudentmobile(int studentmobile) {
		this.studentmobile = studentmobile;
	}
	public Date getIssueddate() {
		return issueddate;
	}
	public void setIssueddate(Date issueddate) {
		this.issueddate = issueddate;
	}
	public String getReturnstatus() {
		return returnstatus;
	}
	public void setReturnstatus(String returnstatus) {
		this.returnstatus = returnstatus;
	}
	
}
