package com.crimson.CrimsonCards.models.PlayableCards;

import com.crimson.CrimsonCards.enums.EquipmentType;
import com.crimson.CrimsonCards.models.Cards.Card;
import com.crimson.CrimsonCards.models.Cards.Equipment;

public class PlayableEquipmentCard extends PlayableCard{
    public int value;
    public EquipmentType type;
    public PlayableEquipmentCard(Equipment card){
        super(card);
        value =  card.value;
        type = card.type;
    }
}
