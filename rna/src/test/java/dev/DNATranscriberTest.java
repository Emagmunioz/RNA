package dev;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DNATranscriberTest {
    private final DNATranscriber transcriber = new DNATranscriber();
    
    @Test
    public void whenEmptyDNA_thenReturnEmptyRNA() {
        String rna = transcriber.transcribe("");
        assertThat(rna, is(emptyString()));
    }

}
