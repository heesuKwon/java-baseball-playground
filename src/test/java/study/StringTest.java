package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] split = "1,2".split(",");

        assertThat(split).contains("1","2");
        assertThat(split).containsExactly("1","2");

        split = "1".split(",");
        assertThat(split).containsExactly("1");
    }

    @Test
    void substring() {
        String substring = "(1,2)".substring(1,4);
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    void charAt() {

        assertThatThrownBy(()-> {
            "abc".charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class)
            .hasMessageContaining("String index out of range:");
    }
}
