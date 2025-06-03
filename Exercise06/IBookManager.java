package Session08_OOP.Exercise06;

public interface IBookManager{
    void addBook(Book book); // thêm sách mới
    void removeBook(String isbn); // xóa sách theo mã ISBN
    Book[] displayBooks(); // hiển thị danh sách các quyển sách
}
