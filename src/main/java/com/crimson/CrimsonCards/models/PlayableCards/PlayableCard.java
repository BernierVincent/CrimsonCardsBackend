package com.crimson.CrimsonCards.models.PlayableCards;

import com.crimson.CrimsonCards.models.Cards.Card;

public abstract class PlayableCard {
    protected Card cardReference;
    public PlayableCard(Card card){
        cardReference = card;
    }
}
