package com.crimson.CrimsonCards.models.Cards;

import java.util.UUID;

public abstract class Card {
    public UUID cardId;
    public String name;
    public int manaCost;
    public String imgUrl; //not sure how I'll implement the image yet.

}
