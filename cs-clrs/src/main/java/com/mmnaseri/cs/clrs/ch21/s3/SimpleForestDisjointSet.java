package com.mmnaseri.cs.clrs.ch21.s3;

/**
 * @author Mohammad Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (8/2/15, 11:54 AM)
 */
public class SimpleForestDisjointSet<I> extends AbstractForestDisjointSet<SimpleTreeElement<I>, I> {

    @Override
    protected SimpleTreeElement<I> newRoot(I representative) {
        final SimpleTreeElement<I> element = new SimpleTreeElement<>();
        element.setValue(representative);
        return element;
    }

}
