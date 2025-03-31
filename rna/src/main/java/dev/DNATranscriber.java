package dev;
import dev.Nucleotide;

public class DNATranscriber {
    
    public String transcribe(String dna) throws InvalidDNAException {
        validateDNA(dna);
        
        if (dna.isEmpty()) {
            return "";
        }
        
        StringBuilder rna = new StringBuilder();
        for (char nucleotide : dna.toCharArray()) {
            rna.append(Nucleotide.getRNAComplement(nucleotide));
        }
        return rna.toString();
    }

}
