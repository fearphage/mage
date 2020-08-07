package mage.filter.common;

import mage.constants.CardType;
import mage.filter.FilterSpell;
import mage.filter.predicate.Predicates;

public class FilterInstantSpell extends FilterSpell {

    public FilterInstantSpell() {
        this("instant spell");
    }

    public FilterInstantSpell(String name) {
        super(name);
        this.add(CardType.INSTANT.getPredicate());
    }

    public FilterInstantSpell(final FilterInstantSpell filter) {
        super(filter);
    }

    @Override
    public FilterInstantSpell copy() {
        return new FilterInstantSpell(this);
    }

}