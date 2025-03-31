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
    @Test
    public void whenCytosine_thenReturnGuanine() {
        char complement = Nucleotide.getRNAComplement('C');
        assertThat(complement, is('G'));
    }
    @Test
    public void whenGuanine_thenReturnCytosine() {
        char complement = Nucleotide.getRNAComplement('G');
        assertThat(complement, is('C'));
    }

    @Test
    public void whenThymine_thenReturnAdenine() {
        char complement = Nucleotide.getRNAComplement('T');
        assertThat(complement, is('A'));
    }


}
