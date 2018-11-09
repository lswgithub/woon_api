import static org.assertj.core.api.Assertions.assertThat

public class StirngTest {

    @Test
    public void split() {
        String[] values = "1".split(",");
        assertThat(values).contains("1");
        
        values = "1,2".split(",");
        assertThat(vlaues).containsExactly("1","2");
    }
    
    @Test
    public void substring(String input) {
        String input = "(1,2)";
        String result = input.substring(1, input.length() -1);
        assertThat(result).isEqualTo("1,2");
    }
}