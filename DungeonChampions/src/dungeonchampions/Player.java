package dungeonchampions;

import java.util.ArrayList;

/**
 *
 * @author Casimer Guzdziol
 */
public abstract class Player implements PlayerInterface{
    private int health,
               strength,
               wisdom,
               agility;
    
    public Weapon weapon;
    public Armour armour;
    
    public boolean stunned = false;
    
    public Player(){
        Dice playerDice = new Dice();
        
        health = 20;
        strength = playerDice.roll(3);
        wisdom = playerDice.roll(3);
        agility = playerDice.roll(3);
    }
    @Override
    public abstract void attack(Npc target);
    @Override
    public abstract void useAbility(Npc target);
    
    @Override
    public void useWeapon( Npc target ){
        target.modHealth( - (strength + weapon.damage) );
        weapon.durability--;
    }
    
    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getWisdom() {
        return wisdom;
    }

    @Override
    public int getAgility() {
        return agility;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public boolean isStunned() {
        return stunned;
    }

    @Override
    public void sleep() {
        health += 1;
    }

    @Override
    public void clearStatus() {
        stunned = false;
    }

    @Override
    public void modAgility( int n ){
        agility += n;
    }

    @Override
    public void modWisdom( int n ){
        agility += n;
    }

    @Override
    public void modStrength( int n ){
        agility += n;
    }

    @Override
    public void modHealth( int n){
        agility += n;
    }

    @Override
    public void pickupItem(Object item){
        if( item.getClass().equals(weapon.getClass()) ){
            weapon = (Weapon)item;
        }else{
            armour = (Armour)item;
        }
    }
}
