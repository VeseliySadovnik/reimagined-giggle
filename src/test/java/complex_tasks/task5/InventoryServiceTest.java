package complex_tasks.task5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class InventoryServiceTest {

    @Test
    void testAddAndRetrieveProduct() {
        InventoryService service = new InventoryService();
        Product phone = new Product("Phone", 799.99, "Electronics");

        service.addProduct(phone);
        Product retrieved = service.getProductByCategory("Electronics");

        assertEquals("Phone", retrieved.getName());
    }

    @Test
    void testAddProductWhenInventoryClosed() {
        InventoryService service = new InventoryService();
        service.setInventoryOpen(false);

        service.addProduct(new Product("TV", 1000, "Electronics"));

        assertThrows(OutOfStockException.class, () ->
                service.getProductByCategory("Electronics"));
    }

    @Test
    void testOutOfStock() {
        InventoryService service = new InventoryService();

        assertThrows(OutOfStockException.class, () ->
                service.getProductByCategory("Books"));
    }

    @Test
    void testFilterByPrice() {
        InventoryService service = new InventoryService();
        service.addProduct(new Product("Phone", 800, "Electronics"));
        service.addProduct(new Product("Book", 20, "Books"));

        List<Product> filtered = service.filterByPrice(100);
        assertEquals(1, filtered.size());
        assertEquals("Phone", filtered.get(0).getName());
    }
}
