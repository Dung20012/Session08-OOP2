package Session08_OOP.Exercise05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CategoryManagement manager = new CategoryManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("*****QUẢN LÝ DANH MỤC*****");
            System.out.println("1. Thêm danh mục");
            System.out.println("2. Hiển thị danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    System.out.println("Nhập ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên danh mục: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập mô tả: ");
                    String description = scanner.nextLine();

                    Category newCategory = new Category(id, name, description);
                    manager.addCategory(newCategory);
                    break;
                case 2:
                    System.out.println("Danh sách danh mục");
                    Category[] allCategories = manager.findAll();
                    if (allCategories.length == 0){
                        System.out.println("Chưa có danh mục nào");
                    }
                    for (Category category : allCategories){
                        category.display();
                    }
                    break;
                case 3:
                    System.out.println("Nhập ID danh mục cần cập nhật");
                    int updateID = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.println("Nhập mô tả mới: ");
                    String newDescription = scanner.nextLine();

                    Category updatedCategory = new Category(updateID, newName, newDescription);
                    manager.updateCategory(updatedCategory);
                    break;
                case 4:
                    System.out.println("Nhập ID danh mục cần xóa: ");
                    int deleteID = Integer.parseInt(scanner.nextLine());
                    manager.deleteById(deleteID);
                    break;
                case 5:
                    System.out.println("Thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }while (true);
    }
}
