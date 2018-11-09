import static org.assertj.core.api.Assertions.assertThat;


public class CollectionTest {

    @Test
    public void arrayList() {
        List<String> values = ArrayList<String>();
        
        values.add("first");
        values.add("second");
        
        assertThat(values.add("third")).isTrue();
        assertThat(values.size()).isEqualTo(3);
        assertThat(values.get(0)).isEquslTo("first");
        assertThat(values.contains("first")).isTrue();
        assertThat(values.remove(2)).isEqualTo("third");
        assertThat(values.size()).isEqualTo(2);
    }
}