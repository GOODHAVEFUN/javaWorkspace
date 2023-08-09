package review;

public class Book {
		//필드
	    private String title;
	    private String author;
	    private int publicationYear;
	    private int bookNumber;

	    //생성자
	    public Book(String title, String author, int publicationYear, int bookNumber) {
	        this.title = title;
	        this.author = author;
	        this.publicationYear = publicationYear;
	        this.bookNumber = bookNumber;
	    }

	    @Override
	    public String toString() {
	        return "Book{" +
	                "title='" + title + '\'' +
	                ", author='" + author + '\'' +
	                ", publicationYear=" + publicationYear +
	                ", bookNumber=" + bookNumber +
	                '}';
	    }

	    @Override
	    public boolean equals(Object obj) {
	    	//1. 동일한 객체인 경우 true
	    	if(this == obj) {
	    		return true;
	    	}
	    	
	    	//2. obj가 null이거나 클래스가 다른 클래스인 경우 false
	    	if(obj == null || getClass() != obj.getClass()) {
	    		return false;
	    	}
	    	
	    	//3. obj를 Book 객체로 캐스팅
	    	Book book = (Book) obj;
	    	
	    	//저자와 제목이 같은지 비교하여 동등성 여부 결정
	    	return title.equals(book.title) && author.equals(book.author);
	    	
		}

	    @Override
	    public int hashCode() {
	        return bookNumber;
	    }

	    public static void main(String[] args) {
	        Book book1 = new Book("Java", "홍길동", 2021, 1);
	        Book book2 = new Book("Python", "춘향이", 2020, 2);
	        Book book3 = new Book("Java", "홍길동", 2023, 3);

	        System.out.println("book1.equals(book2): " + book1.equals(book2));
	        System.out.println("book1.equals(book3): " + book1.equals(book3));

	        System.out.println("book1.hashCode(): " + book1.hashCode());
	        System.out.println("book2.hashCode(): " + book2.hashCode());
	        System.out.println("book3.hashCode(): " + book3.hashCode());

	        System.out.println("book1: " + book1);
	        System.out.println("book2: " + book2);
	        System.out.println("book3: " + book3);
	   }
}
