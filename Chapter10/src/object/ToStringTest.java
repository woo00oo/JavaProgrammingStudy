package object;

class Book implements Cloneable{
	String title;
	String author;
	
	public Book(String title,String author) {
		this.title  = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author +", " + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// 직접 호출 되는 메서드x ,인스턴스가 
		// 힙 메모리 영역에서 해제될 때 가비지컬렉터에 의해 수행되는 메소드
		super.finalize();
	}
	
	
	

	
}



public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Book book = new Book("토지","박경리");
		
		System.out.println(book);
		
		//String str = new String("토지");
		//System.out.println(str.toString());

		
		Book book2 = (Book)book.clone();
		System.out.println(book2);
		
	}


	

}
