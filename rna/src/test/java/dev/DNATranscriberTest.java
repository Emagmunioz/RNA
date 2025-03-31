package dev;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

public class DNATranscriberTest {
    private final DNATranscriber transcriber = new DNATranscriber();
    
    @Test
    public void whenEmptyDNA_thenReturnEmptyRNA() {
        String rna = transcriber.transcribe("");
        assertThat(rna, is(emptyString()));
    }
    @Test
    public void whenSingleG_thenReturnC() {
        String rna = transcriber.transcribe("G");
        assertThat(rna, is("C"));
    }

    @Test
    public void whenSingleC_thenReturnG() {
        String rna = transcriber.transcribe("C");
        assertThat(rna, is("G"));
    }

    @Test
    public void whenAllNucleotides_thenReturnCorrectRNA() {
        String rna = transcriber.transcribe("GCTA");
        assertThat(rna, is("CGAU"));
    }


}
