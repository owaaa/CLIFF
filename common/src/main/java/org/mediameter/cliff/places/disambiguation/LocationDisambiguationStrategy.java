package org.mediameter.cliff.places.disambiguation;

import java.util.List;

import org.mediameter.cliff.DisambiguationStrategy;
import org.mediameter.cliff.places.CliffLocationResolver;

import com.bericotech.clavin.resolver.ResolvedLocation;

/**
 * Wrapper around disambiguation strategies, so we can try and compare different ones
 * 
 * @author rahulb
 */
public interface LocationDisambiguationStrategy extends DisambiguationStrategy {

    /**
     * For each candidate list, select the best candidate.
     * 
     * @param allPossibilities
     *            Set of candidate lists to sort through.
     * @return Set of the best candidate choices.
     */
    public abstract List<ResolvedLocation> select(
            CliffLocationResolver resolver,
            List<List<ResolvedLocation>> allPossibilities);

    public abstract void logStats();
    
}