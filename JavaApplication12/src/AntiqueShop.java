
import java.util.Scanner;

public class AntiqueShop {
    private static ItemList itemList = new ItemList(); // Static instance for the shop
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice = 0;
        
        System.out.println("=== CHÀO MỪNG ĐÉN CỬA HÀNG ĐỒ CỔ ===");
        
        do {
            displayMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    addVase();
                    break;
                case 2:
                    addStatue();
                    break;
                case 3:
                    addPainting();
                    break;
                case 4:
                    displayAllItems();
                    break;
                case 5:
                    findItemByCreator();
                    break;
                case 6:
                    updateItemByIndex();
                    break;
                case 7:
                    removeItemByIndex();
                    break;
                case 8:
                    displayItemsByType();
                    break;
                case 9:
                    sortItemsByValue();
                    break;
                case 10:
                    System.out.println("Cảm ơn bạn đã sử dụng hệ thống! Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
                    break;
            }
            
            if (choice != 10) {
                System.out.println("\nNhấn Enter để tiếp tục...");
                sc.nextLine();
            }
            
        } while (choice != 10);
    }
    
    private static void displayMenu() {
        System.out.println("\n========== MENU ==========");
        System.out.println("1. Thêm bình mới");
        System.out.println("2. Thêm tượng mới");
        System.out.println("3. Thêm tranh mới");
        System.out.println("4. Hiển thị tất cả sản phẩm");
        System.out.println("5. Tìm sản phẩm theo tác giả");
        System.out.println("6. Cập nhật sản phẩm theo chỉ số");
        System.out.println("7. Xóa sản phẩm theo chỉ số");
        System.out.println("8. Hiển thị sản phẩm theo loại");
        System.out.println("9. Sắp xếp sản phẩm theo giá trị");
        System.out.println("10. Thoát");
        System.out.println("==========================");
    }
    
    private static void addVase() {
        Item vase = new Vase();
        vase.input();
        if (itemList.addItem(vase)) {
            System.out.println("✓ Đã thêm bình thành công!");
        } else {
            System.out.println("✗ Không thể thêm bình. Danh sách có thể đã đầy.");
        }
    }
    
    private static void addStatue() {
        Item statue = new Statue();
        statue.input();
        if (itemList.addItem(statue)) {
            System.out.println("✓ Đã thêm tượng thành công!");
        } else {
            System.out.println("✗ Không thể thêm tượng. Danh sách có thể đã đầy.");
        }
    }
    
    private static void addPainting() {
        Item painting = new Painting();
        painting.input();
        if (itemList.addItem(painting)) {
            System.out.println("✓ Đã thêm tranh thành công!");
        } else {
            System.out.println("✗ Không thể thêm tranh. Danh sách có thể đã đầy.");
        }
    }
    
    private static void displayAllItems() {
        System.out.println("\n=== DANH SÁCH TẤT CẢ SẢN PHẨM ===");
        itemList.displayAll();
    }
    
    private static void findItemByCreator() {
        System.out.print("Nhập tên tác giả: ");
        String creator = sc.nextLine();
        Item found = itemList.findItem(creator);
        
        if (found != null) {
            System.out.println("✓ Tìm thấy sản phẩm:");
            System.out.println(found);
        } else {
            System.out.println("✗ Không tìm thấy sản phẩm của tác giả: " + creator);
        }
    }
    
    private static void updateItemByIndex() {
        if (itemList.getNumberOfItems() == 0) {
            System.out.println("Danh sách trống, không có gì để cập nhật!");
            return;
        }
        
        displayAllItems();
        System.out.print("Nhập chỉ số cần cập nhật (0-" + (itemList.getNumberOfItems() - 1) + "): ");
        int index = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        if (itemList.updateItem(index)) {
            System.out.println("✓ Đã cập nhật sản phẩm thành công!");
        } else {
            System.out.println("✗ Chỉ số không hợp lệ!");
        }
    }
    
    private static void removeItemByIndex() {
        if (itemList.getNumberOfItems() == 0) {
            System.out.println("Danh sách trống, không có gì để xóa!");
            return;
        }
        
        displayAllItems();
        System.out.print("Nhập chỉ số cần xóa (0-" + (itemList.getNumberOfItems() - 1) + "): ");
        int index = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        if (itemList.removeItem(index)) {
            System.out.println("✓ Đã xóa sản phẩm thành công!");
        } else {
            System.out.println("✗ Chỉ số không hợp lệ!");
        }
    }
    
    private static void displayItemsByType() {
        System.out.println("Chọn loại sản phẩm:");
        System.out.println("1. Bình (Vase)");
        System.out.println("2. Tượng (Statue)");
        System.out.println("3. Tranh (Painting)");
        System.out.print("Nhập lựa chọn: ");
        
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        String type;
        switch (choice) {
            case 1:
                type = "Vase";
                break;
            case 2:
                type = "Statue";
                break;
            case 3:
                type = "Painting";
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }
        
        System.out.println("\n=== DANH SÁCH " + type.toUpperCase() + " ===");
        itemList.displayItemsByType(type);
    }
    
    private static void sortItemsByValue() {
        itemList.sortItems();
        System.out.println("✓ Đã sắp xếp sản phẩm theo giá trị tăng dần!");
        displayAllItems();
    }
}