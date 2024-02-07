package com.crimson.CrimsonCards.models.PlayableCards;

import com.crimson.CrimsonCards.enums.Faction;
import com.crimson.CrimsonCards.models.Cards.Card;
import com.crimson.CrimsonCards.models.Cards.Monster;

import java.util.ArrayList;

public class PlayableMonsterCard extends PlayableCard{
    private int referenceHealth;
    public int health = referenceHealth; //On instancing sets card health to its reference's;
    private int referenceAttack;
    public  int attack = referenceAttack; // On instancing sets card attack to its reference's
    public Faction faction;



    public ArrayList<PlayableEquipmentCard> equipmentCards = new ArrayList<>();
    public PlayableMonsterCard(Monster card){
        super(card);
        referenceHealth = card.health;
        referenceAttack = card.attack;
        faction = card.faction;
    }

}
