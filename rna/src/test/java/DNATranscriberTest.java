
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

import dev.DNATranscriber;

public class DNATranscriberTest {
    
    @Test
    public void whenEmptyDNA_thenReturnEmptyRNA() {
        DNATranscriber transcriber = new DNATranscriber();
        String rna = transcriber.transcribe("");
        assertThat(rna, is(emptyString()));
    }
    @Test
    public void whenSingleG_thenReturnC() {
        DNATranscriber transcriber = new DNATranscriber();
        String rna = transcriber.transcribe("G");
        assertThat(rna, is("C"));
}
    @Test
    public void whenSingleC_thenReturnG() {
        DNATranscriber transcriber = new DNATranscriber();
        String rna = transcriber.transcribe("C");
        assertThat(rna, is("G"));
}
    @Test
    public void whenAllNucleotides_thenReturnCorrectRNA() {
        DNATranscriber transcriber = new DNATranscriber();
        String rna = transcriber.transcribe("GCTA");
        assertThat(rna, is("CGAU"));
}
    @Test(expected = InvalidDNAException.class)
    public void whenInvalidDNA_thenThrowException() {
        DNATranscriber transcriber = new DNATranscriber();
        transcriber.transcribe("GATB");
}
}

