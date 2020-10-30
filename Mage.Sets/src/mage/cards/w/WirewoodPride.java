package mage.cards.w;

import java.util.UUID;

import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.dynamicvalue.common.PermanentsOnBattlefieldCount;
import mage.abilities.effects.common.continuous.BoostTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.filter.FilterPermanent;
import mage.target.common.TargetCreaturePermanent;

/**
 * @author djbrez
 */
public final class WirewoodPride extends CardImpl {

    private static final FilterPermanent filter = new FilterPermanent(SubType.ELF, "Elves");
    private static final DynamicValue xValue = new PermanentsOnBattlefieldCount(filter);

    public WirewoodPride(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{G}");

        // Target creature gets +X/+X until end of turn, where X is the number of Elves on the battlefield.
        this.getSpellAbility().addEffect(new BoostTargetEffect(xValue, xValue, Duration.EndOfTurn, true)
                .setText("Target creature gets +X/+X until end of turn, where X is the number of Elves on the battlefield"));
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());
    }

    public WirewoodPride(final WirewoodPride card) {
        super(card);
    }

    @Override
    public WirewoodPride copy() {
        return new WirewoodPride(this);
    }
}
