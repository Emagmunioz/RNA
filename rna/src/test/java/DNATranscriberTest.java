
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
}

