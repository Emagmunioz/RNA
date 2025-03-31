package dev;

public enum Nucleotide {

    ADENINE('A', 'U'),
    CYTOSINE('C', 'G'),
    GUANINE('G', 'C'),
    THYMINE('T', 'A');

    private final char dnaSymbol;
    private final char rnaComplement;
    
    Nucleotide(char dnaSymbol, char rnaComplement) {
        this.dnaSymbol = dnaSymbol;
        this.rnaComplement = rnaComplement;
    }
    public static char getRNAComplement(char dnaSymbol) {
        for (Nucleotide n : values()) {
            if (n.dnaSymbol == dnaSymbol) {
                return n.rnaComplement;
            }
        }

throw new IllegalArgumentException("Invalid DNA nucleotide: " + dnaSymbol);
    }
}
