import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;



public class SimleTests {
    @Test
    @DisplayName("Первый Смоук тест")
    @Tag("Smoke")
    void smokeOneTest() {
        assertThat(true, is(true));
    }

    @Test
    @DisplayName("Второй Смоук тест")
    @Tag("Smoke")
    void smokeTwoTest() {
        assertThat(true, is(true));
    }

    @Test
    @DisplayName("Третий Смоук тест")
    @Tag("Smoke")
    void smokeThreeTest() {
        assertThat(true, is(false));


}}
