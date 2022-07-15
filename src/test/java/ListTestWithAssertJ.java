import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ListTestWithAssertJ {

    @Test
    public void compareListIgnoreOrder() {
        List list1 = List.of("A", "B", "C");
        List list2 = List.of("B", "C", "A", "A");

        Assertions.assertThat(list1).hasSameElementsAs(list2);
    }

}
