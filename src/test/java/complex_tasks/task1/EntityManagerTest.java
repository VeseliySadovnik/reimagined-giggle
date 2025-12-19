package complex_tasks.task1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {

    private EntityManager<Entity> manager;
    private Entity alice;
    private Entity bob;
    private Entity charlie;
    private Entity diana;

    @BeforeEach
    void setUp() {
        manager = new EntityManager<>();
        alice = new Entity("Alice", 30, true);
        bob = new Entity("Bob", 22, false);
        charlie = new Entity("Charlie", 28, true);
        diana = new Entity("Diana", 35, false);

        manager.add(alice);
        manager.add(bob);
        manager.add(charlie);
        manager.add(diana);
    }

    @Test
    void testAddAndGetAllSize() {
        List<Entity> all = manager.getAll();
        assertEquals(4, all.size());
    }

    @Test
    void testGetAllIsSnapshotNotLiveView() {
        List<Entity> snapshot = manager.getAll();
        Entity extra = new Entity("Extra", 40, true);
        manager.add(extra);
        assertEquals(4, snapshot.size());
        assertEquals(5, manager.getAll().size());
    }

    @Test
    void testRemoveByEqualEntity() {
        Entity bobCopy = new Entity("Bob", 22, false);
        boolean removed = manager.remove(bobCopy);
        assertTrue(removed);
        assertEquals(3, manager.getAll().size());
    }

    @Test
    void testFilterByAge() {
        List<Entity> inRange = manager.filterByAge(25, 30);
        assertEquals(2, inRange.size());
        assertTrue(inRange.stream().anyMatch(e -> "Alice".equals(e.getName())));
        assertTrue(inRange.stream().anyMatch(e -> "Charlie".equals(e.getName())));
    }

    @Test
    void testFilterByName() {
        List<Entity> found = manager.filterByName("Alice");
        assertEquals(1, found.size());
        assertEquals("Alice", found.get(0).getName());
    }

    @Test
    void testFilterByActiveTrue() {
        List<Entity> active = manager.filterByActive(true);
        assertEquals(2, active.size());
        assertTrue(active.stream().allMatch(Entity::isActive));
    }

    @Test
    void testFilterByActiveFalse() {
        List<Entity> inactive = manager.filterByActive(false);
        assertEquals(2, inactive.size());
        assertTrue(inactive.stream().allMatch(e -> !e.isActive()));
    }
}
