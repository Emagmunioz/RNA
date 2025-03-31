package dev;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
public class NucleotideTest {
    
    @Test
    public void whenAdenine_thenReturnUracil() {
        char complement = Nucleotide.getRNAComplement('A');
        assertThat(complement, is('U'));
    }   

}
