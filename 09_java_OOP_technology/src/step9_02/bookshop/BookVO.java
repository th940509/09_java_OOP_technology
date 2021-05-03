package step9_02.bookshop;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//	책 1권의 정보를 기억하는 클래스
public class BookVO {

	private String title;		// 도서명 * private 변수는 외부에서 접근 불가
	private String author;		// 저자
	private String publisher;	// 출판사
	private Date date;			// 출판일
	private int price;			// 가격
	
	public BookVO() {
		// TODO Auto-generated constructor stub
	}
	
	public BookVO(String title, String author, String publisher, Date date, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.date = date;
		this.price = price;
	}
	
	public String getTitle() { // get을 사용하여 title을 외부로 꺼내기
		return title;
	}
	
	public void setTitle(String title) { // set을 사용하여 title 수정하기
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() { // private 내부에서는 접근 가능...
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		DecimalFormat df = new DecimalFormat("#,##0원");
		
//		return "BookVO [title=" + title + ", author=" + author + ", publisher=" + publisher + ", date=" + sdf.format(date)
//				+ ", price=" + df.format(price) + "]";
		
		return String.format("%s %s %s %s %s", title, author, publisher, sdf.format(date), df.format(price));
	} // %s 서식문자 출력 (뒤에 있는 문자열을 출력)
	
}
















