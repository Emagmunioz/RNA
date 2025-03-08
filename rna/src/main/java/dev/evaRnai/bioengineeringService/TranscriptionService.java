package dev.evaRnai.bioengineeringService;

import dev.evaRnai.bioengineeringModel.DNA;

public class TranscriptionService {
     public String transcribe(DNA dna) {
        String dnaSequence = dna.getSequence();
        StringBuilder rnaSequence = new StringBuilder();

        for (char nucleotide : dnaSequence.toCharArray()) {
            switch (nucleotide) {
                case 'G':
                    rnaSequence.append('C');
                    break;
                case 'C':
                    rnaSequence.append('G');
                    break;
                case 'T':
                    rnaSequence.append('A');
                    break;
                case 'A':
                    rnaSequence.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid nucleotide: " + nucleotide);
            }
        }

        return rnaSequence.toString();
    }

}
