package Session08_OOP.Exercise06;

public class BookManager implements IBookManager {
    private Book[] books = new Book[100];
    private int size = 0;

    @Override
    public void addBook(Book book) {
        if (size < books.length){
            books[size] = book;
            size++;
            System.out.println("Đã thêm sách");
        }else {
            System.out.println("Sách đã đầy không thể thêm");
        }
    }

    @Override
    public void removeBook(String isbn) {
        boolean found = false;
        for (int i = 0; i < size; i++){
            if (books[i].getIsbn().equals(isbn)){
//                dịch các phần tử phía sau lên
                for (int j = i; j < size - 1; j++){
                    books[j] = books[j + 1];
                }
                books[size - 1] = null;
                size--;
                found = true;
                System.out.println("Đã xóa sách với ISBN: " + isbn);
                break;
            }
        }
        if (!found){
            System.out.println("Không tìm thấy sách có ISBN: " + isbn);
        }
    }

    @Override
    public Book[] displayBooks() {
        Book[] currentBooks = new Book[size];
        for (int i = 0; i < size; i++){
            currentBooks[i] = books[i];
        }
        return currentBooks;
    }
}
