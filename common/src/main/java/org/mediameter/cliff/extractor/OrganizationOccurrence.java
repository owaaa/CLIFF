package org.mediameter.cliff.extractor;

public class OrganizationOccurrence {
    
    // text representation of the org
    public final String text;
    
    // number of UTF-16 code units from the start of the document
    public final int position;
    public final double score;

    public OrganizationOccurrence(String text, int position) {
        this.text = text;
        this.position = position;
        this.score = 0;
    }

    public OrganizationOccurrence(String text, int position, double score) {
        this.text = text;
        this.position = position;
        this.score = score;
    }

}