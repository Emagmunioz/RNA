package dev.evaRnai;

import dev.evaRnai.bioengineeringModel.DNA;
import dev.evaRnai.bioengineeringService.TranscriptionService;

public final class App {
    public static void main(String[] args) {
        DNA dna = new DNA("GCTA");
        TranscriptionService service = new TranscriptionService();
        String rna = service.transcribe(dna);
        System.out.println("DNA: " + dna.getSequence());
        System.out.println("RNA: " + rna);
    }
  
}
