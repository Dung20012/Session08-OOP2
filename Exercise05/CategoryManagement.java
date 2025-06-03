package Session08_OOP.Exercise05;

public class CategoryManagement implements ICRUD {
    private Category[] categories;
    private int size; // số lượng danh mục hiện tại

//    Constructor
    public CategoryManagement(){
        categories = new Category[100];
        size = 0;
    }

    @Override
    public Category[] findAll() {
//        Trả về mảng chứa phần tử đang dùng
        Category[] currentCategories = new Category[size];
        for (int i = 0; i < size; i++){
            currentCategories[i] = categories[i];
        }
        return currentCategories;
    }

    @Override
    public void addCategory(Category category) {
        if (size >= categories.length){
            System.out.println("Danh mục đã đầy không thể thêm!");
            return;
        }
        categories[size] = category;
        size++;
        System.out.println("Danh mục đã được cập nhật");
    }

    @Override
    public void updateCategory(Category category) {
        for (int i = 0; i < size; i++){
            if (categories[i].getId() == category.getId()){
                categories[i].setName(category.getName());
                categories[i].setDescription(category.getDescription());
                System.out.println("Cập nhật danh mục thành công!");
                return;
            }
        }
        System.out.printf("Danh mục không tồn tại: " + category.getId());
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < size; i++){
            if (categories[i].getId() == id){
//                Dịch mảng để xóa phần tử i
                for (int j = i; j < size - 1; j++){
                    categories[j] = categories[j + 1];
                }
                categories[size - 1] = null;
                size--;
                System.out.println("Xóa danh mục thành công!");
                return;
            }
        }
        System.out.println("Danh mục không tồn tại: " + id);
    }
}
