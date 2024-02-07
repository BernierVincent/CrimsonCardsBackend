package com.crimson.CrimsonCards.models.PlayableCards;

import com.crimson.CrimsonCards.models.Cards.Card;

public abstract class PlayableCard {
    protected Card cardReference;
    public String name;
    public int manaCost;
    public PlayableCard(Card card){
        cardReference = card;
        name = card.name;
        manaCost = card.manaCost;
    }
}
