package recipe.fwd.vo;

import java.util.Date;

public class MemberVo {
	private int m_no;
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_email;
	private int m_phone;
	private String m_gender;
	private String email_status;
	private String email_key;
	private Date reg_date;
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberVo(int m_no, String m_id, String m_pw, String m_name, String m_email, int m_phone, String m_gender,
			String email_status, String email_key, Date reg_date) {
		super();
		this.m_no = m_no;
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_phone = m_phone;
		this.m_gender = m_gender;
		this.email_status = email_status;
		this.email_key = email_key;
		this.reg_date = reg_date;
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public int getM_phone() {
		return m_phone;
	}
	public void setM_phone(int m_phone) {
		this.m_phone = m_phone;
	}
	public String getM_gender() {
		return m_gender;
	}
	public void setM_gender(String m_gender) {
		this.m_gender = m_gender;
	}
	public String getEmail_status() {
		return email_status;
	}
	public void setEmail_status(String email_status) {
		this.email_status = email_status;
	}
	public String getEmail_key() {
		return email_key;
	}
	public void setEmail_key(String email_key) {
		this.email_key = email_key;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		return "MemberVo [m_no=" + m_no + ", m_id=" + m_id + ", m_pw=" + m_pw + ", m_name=" + m_name + ", m_email="
				+ m_email + ", m_phone=" + m_phone + ", m_gender=" + m_gender + ", email_status=" + email_status
				+ ", email_key=" + email_key + ", reg_date=" + reg_date + "]";
	}
		
}
