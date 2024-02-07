package com.crimson.CrimsonCards.models.PlayableCards;

import com.crimson.CrimsonCards.enums.Target;
import com.crimson.CrimsonCards.models.Cards.Spell;

public class PlayableSpellCard extends PlayableCard{
    public int power;
    public Target target;
    public PlayableSpellCard(Spell card){
        super(card);
        power = card.power;
        target = card.target;
    }

}
