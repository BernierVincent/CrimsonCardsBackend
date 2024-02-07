package com.crimson.CrimsonCards.models.PlayableCards;

import com.crimson.CrimsonCards.models.Cards.Card;
import com.crimson.CrimsonCards.models.Cards.Equipment;
import com.crimson.CrimsonCards.models.Cards.Monster;
import com.crimson.CrimsonCards.models.Cards.Spell;

import java.util.ArrayList;

public class PlayableCardFactory {
    //Needs testing
    public static PlayableCard createPlayableCard(Card card) {
        if (card instanceof Monster) {
            return new PlayableMonsterCard((Monster)card);
        } else if (card instanceof Spell) {
            return new PlayableSpellCard((Spell)card);
        } else if (card instanceof Equipment) {
            return new PlayableEquipmentCard((Equipment)card);
        } else {
            throw new IllegalArgumentException("Unsupported card type");
        }
    }

    public static ArrayList<PlayableCard> batchPlayableCards(ArrayList<Card> cards) {
        ArrayList<PlayableCard> cardBatch = new ArrayList<>();
        for (Card c : cards
        ) {
            cardBatch.add(createPlayableCard(c));
        }
        return cardBatch;
    }
}
