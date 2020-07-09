import java.util.ArrayList;

public class Student {

	private int num;
	private String name;
	private ArrayList<Book> bookList = new ArrayList<Book>();
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public void addBook(String bookname, String author) {
		
		Book book = new Book(bookname, author);
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		
		System.out.print(name +" 학생이 읽은 책은 : ");
		
		for(int i = 0 ; i < bookList.size(); i ++) {
			System.out.print(bookList.get(i).getBookName() +" " );
		}
		
		System.out.println("입니다");
		
	}
	
	
}
