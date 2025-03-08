package dev.evaRnaiTest.bioengineeringModelTest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import dev.evaRnai.bioengineeringModel.DNA;

public class DNATest {
    @Test
    public void testGetSequence() {
        DNA dna = new DNA("GCTA");
        assertThat(dna.getSequence(), is("GCTA"));
    }
    @Test
    public void testSetSequence() {
        DNA dna = new DNA("");
        dna.setSequence("GCTA");
        assertThat(dna.getSequence(), is("GCTA"));
    }   

}
