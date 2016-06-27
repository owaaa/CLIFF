package org.mediameter.cliff.extractor;

public class PersonOccurrence {
    
    // text representation of the person (i.e., his/her name)
    public final String text;
    
    // number of UTF-16 code units from the start of the document at
    // which the person name starts
    public final int position;
    public final double score;

    public PersonOccurrence(String text, int position) {
        this.text = text;
        this.position = position;
        this.score = 0;
    }

    public PersonOccurrence(String text, int position, double score) {
        this.text = text;
        this.position = position;
        this.score = score;
    }

}