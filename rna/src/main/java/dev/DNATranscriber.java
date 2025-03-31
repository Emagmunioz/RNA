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
}
