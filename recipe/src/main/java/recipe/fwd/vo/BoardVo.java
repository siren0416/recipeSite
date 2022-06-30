package recipe.fwd.vo;

import java.util.Date;

public class BoardVo {
	private int r_no;
	private String r_title;
	private String r_writer;
	private String r_content;
	private Date r_date;
	private int r_viewcnt;
	public BoardVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardVo(int r_no, String r_title, String r_writer, String r_content, Date r_date, int r_viewcnt) {
		super();
		this.r_no = r_no;
		this.r_title = r_title;
		this.r_writer = r_writer;
		this.r_content = r_content;
		this.r_date = r_date;
		this.r_viewcnt = r_viewcnt;
	}
	public int getR_no() {
		return r_no;
	}
	public void setR_no(int r_no) {
		this.r_no = r_no;
	}
	public String getR_title() {
		return r_title;
	}
	public void setR_title(String r_title) {
		this.r_title = r_title;
	}
	public String getR_writer() {
		return r_writer;
	}
	public void setR_writer(String r_writer) {
		this.r_writer = r_writer;
	}
	public String getR_content() {
		return r_content;
	}
	public void setR_content(String r_content) {
		this.r_content = r_content;
	}
	public Date getR_date() {
		return r_date;
	}
	public void setR_date(Date r_date) {
		this.r_date = r_date;
	}
	public int getR_viewcnt() {
		return r_viewcnt;
	}
	public void setR_viewcnt(int r_viewcnt) {
		this.r_viewcnt = r_viewcnt;
	}
	
	
}
