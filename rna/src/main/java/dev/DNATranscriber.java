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

    private void validateDNA(String dna) throws InvalidDNAException {
        if (dna == null) {
            throw new InvalidDNAException("DNA sequence cannot be null");
        }
        
        for (char nucleotide : dna.toCharArray()) {
            if (!Nucleotide.isValid(nucleotide)) {
                throw new InvalidDNAException(
                    String.format("Invalid nucleotide '%c' in DNA sequence", nucleotide)
                );
            }
        }
    }
}  

