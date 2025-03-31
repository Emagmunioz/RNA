package dev;

public class DNATranscriber {
    public String transcribe(String dna) {
        return "";
    }
public String transcribe(String dna) {
    if (dna.isEmpty()) return "";
    return "C";
    }   
public String transcribe(String dna) {
    if (dna.isEmpty()) return "";
        
    char nucleotide = dna.charAt(0);
    if (nucleotide == 'G') return "C";
    if (nucleotide == 'C') return "G";
    return "";
    }
public String transcribe(String dna) {
    if (dna.isEmpty()) return "";
        
    StringBuilder rna = new StringBuilder();
    for (char nucleotide : dna.toCharArray()) {
        switch (nucleotide) {
            case 'G': rna.append('C'); break;
            case 'C': rna.append('G'); break;
            case 'T': rna.append('A'); break;
            case 'A': rna.append('U'); break;
            }
        }
    return rna.toString();
    }    
}
