package dev;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class NucleotideTest {
    
    @Test
    public void whenAdenine_thenReturnUracil() {
        char complement = Nucleotide.getRNAComplement('A');
        assertThat(complement, is('U'));
    }   

}
