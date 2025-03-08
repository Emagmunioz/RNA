package dev.evaRnaiTest.bioengineeringServiceTest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

import dev.evaRnai.bioengineeringModel.DNA;
import dev.evaRnai.bioengineeringService.TranscriptionService;

public class TranscriptionServiceTest {
    @Test
    public void testTranscribe() {
        DNA dna = new DNA("GCTA");
        TranscriptionService service = new TranscriptionService();
        String rna = service.transcribe(dna);
        assertThat(rna, is("CGAU"));
    }
@Test
public void testTranscribeInvalidNucleotide() {
    DNA dna = new DNA("GCTX");
    TranscriptionService service = new TranscriptionService();
    try {
        service.transcribe(dna);
    } catch (IllegalArgumentException e) {
        assertThat(e.getMessage(), is("Invalid nucleotide: X"));
    }
}
}