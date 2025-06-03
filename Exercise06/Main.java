package Session08_OOP.Exercise06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Thoát");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    System.out.println("Nhập tiêu đề: ");
                    String title = scanner.nextLine();
                    System.out.println("Nhập tác giả: ");
                    String author = scanner.nextLine();
                    System.out.println("Nhập ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.println("Nhập năm xuất bản: ");
                    int year = Integer.parseInt(scanner.nextLine());

                    Book newBook = new Book(title, author, isbn, year);
                    manager.addBook(newBook);
                    break;

                case 2:
                    Book[] books = manager.displayBooks();
                    if (books.length == 0){
                        System.out.println("Không có sách nào");
                    }else {
                        for (Book book : books){
                            System.out.println(book.getDetails());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Nhập ISBN sách cần xóa: ");
                    String delIsbn = scanner.nextLine();
                    manager.removeBook(delIsbn);
                    break;
                case 4:
                    System.out.println("Thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }while (true);
    }
}
