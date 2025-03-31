package dev;
import dev.Nucleotide;
    
public class DNATranscriber {
    
    public String transcribe(String dna) {
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

    private void validateDNA(String dna) {
       
        throw new UnsupportedOperationException("Unimplemented method 'validateDNA'");
    }

    
        }
    


