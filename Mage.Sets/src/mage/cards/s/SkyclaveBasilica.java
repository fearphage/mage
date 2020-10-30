package mage.cards.s;

import mage.abilities.common.EntersBattlefieldTappedAbility;
import mage.abilities.mana.WhiteManaAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class SkyclaveBasilica extends CardImpl {

    public SkyclaveBasilica(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.LAND}, "");

        this.modalDFC = true;
        this.nightCard = true;

        // Skyclave Basilica enters the battlefield tapped.
        this.addAbility(new EntersBattlefieldTappedAbility());

        // {T}: Add {W}.
        this.addAbility(new WhiteManaAbility());
    }

    private SkyclaveBasilica(final SkyclaveBasilica card) {
        super(card);
    }

    @Override
    public SkyclaveBasilica copy() {
        return new SkyclaveBasilica(this);
    }
}
