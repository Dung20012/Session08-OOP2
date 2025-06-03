package Session08_OOP.Exercise06;

public class Book {
    private String title; // tiêu đề sách
    private String author; //tác giả sách
    private String isbn; // mã ISBN
    private int year; // năm xuất bản

//    Constructor k tham số
    public Book(){
    }
//    Constructor có tham số

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

//    Trả về thông tin chi tiết của sách
    public String getDetails(){
        return "Tiêu đề: " + title + "," + " Tác giả: " + author + "," + " ISBN: " + isbn + "," + " Năm: " + year;
    }

    public String getIsbn(){
        return isbn;
    }
}
