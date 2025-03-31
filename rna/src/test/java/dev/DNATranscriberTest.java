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

}
