

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class rnaiTest {
    
    @Test
    public void whenEmptyDNA_thenReturnEmptyRNA() {
        DNATranscriber transcriber = new DNATranscriber();
        String rna = transcriber.transcribe("");
        assertThat(rna, is(emptyString()));
    }
}

