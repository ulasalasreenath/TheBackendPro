import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class ListTest {

    @Test
    public void compareListIgnoringOrder() {
        List<String> list1 = List.of("A", "B", "C");
        List<String> list2 = List.of("B", "C", "D");
        assertTrue(CollectionUtils.isEqualCollection(list1, list2));
    }
}
