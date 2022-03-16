package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i = 0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		} // 새로운 객체를 만듦 (깊은 복사, 다른 객체를 가르킴)
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나무");
		
		System.out.println("== library ==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		// 같은 주소라서 하나의 값을 바꾸면 같이 바뀜 (얕은 복사, 같은 객체를 가르킴)
		
		System.out.println("== copylibrary ==");
		for(Book copybook : copyLibrary) {
			System.out.println(copybook);
			copybook.showInfo();
		}


	}

}
