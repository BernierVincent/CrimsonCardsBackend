package com.crimson.CrimsonCards.models.Cards;

import com.crimson.CrimsonCards.enums.EquipmentType;
import com.crimson.CrimsonCards.models.Cards.Card;

public class Equipment extends Card {
 public int value; //Might Refactor this to a Map<BuffType,int> should I decide to make equipments give more than a single buffs.
 public EquipmentType type;
}