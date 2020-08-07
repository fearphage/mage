package mage.cards.i;

import mage.abilities.dynamicvalue.common.PermanentsOnBattlefieldCount;
import mage.abilities.effects.common.continuous.BoostTargetEffect;
import mage.abilities.hint.common.ArtifactYouControlHint;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.filter.common.FilterControlledArtifactPermanent;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 * @author LoneFox
 */
public final class Irradiate extends CardImpl {

    public Irradiate(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{3}{B}");

        // Target creature gets -1/-1 until end of turn for each artifact you control.
        PermanentsOnBattlefieldCount count = new PermanentsOnBattlefieldCount(new FilterControlledArtifactPermanent(), -1);
        this.getSpellAbility().addEffect(new BoostTargetEffect(count, count, Duration.EndOfTurn, true));
        this.getSpellAbility().addTarget(new TargetCreaturePermanent());
        this.getSpellAbility().addHint(ArtifactYouControlHint.instance);
    }

    public Irradiate(final Irradiate card) {
        super(card);
    }

    @Override
    public Irradiate copy() {
        return new Irradiate(this);
    }
}
