package dungeonchampions;

/**
 *
 * @author Owner
 */
public class Npc
{
    private int rank, hitpoints, strength, wisdom, agility;
    Weapon weapon;
    Armour armour;
    
    public boolean stunned = false;
    Dice npcDice = new Dice(3);
    
    public Npc()
    {
            this.rank = (int)(Math.random() * 6 + 1);
            this.hitpoints = npcDice.roll(rank);
            this.strength = npcDice.roll(rank);
            this.wisdom = npcDice.roll(rank);
            this.agility = npcDice.roll(rank);
            
            //determine if it has weapon
            createWeapon( rank );
            createArmour( rank );
    }//default ctor
    
    public Npc( int rank ){
        this.rank = rank;
        this.hitpoints = npcDice.roll(rank);
            this.strength = npcDice.roll(rank);
            this.wisdom = npcDice.roll(rank);
            this.agility = npcDice.roll(rank);
            
            //determine if it has weapon
            createWeapon( rank );
            createArmour( rank );
    }
    public int getRank()
    {
        return rank;
    }
    
    public int getHitpoints()
    {
        return hitpoints;
    }
    
    public int getStrength()
    {
        return strength;
    }
    
    public int getWisdom()
    {
        return wisdom;
    }
      
    public int getAgility()
    {
        return agility;
    }

    public String getWeapon()
    {
        return weapon.name;
    }
    
    public int armor()
    {
        return armour.getRank();
    }
    
    public void attack(Player target) {
        int attackDamage = strength - target.armour.getDamageReduction();
        target.modHealth(attackDamage);
    }
    
    public void clearStatus() {
        stunned = false;
    }
    
    public boolean isAlive() {
        return hitpoints > 0;
    }

    public boolean isStunned() {
        return stunned;
    }
    
    public void modHealth( int n ){
        hitpoints += n;
    }
    
    private void createWeapon( int rank ){
        Dice itemDice = new Dice(10);
        int roll = itemDice.roll();
        
        if(roll == 10){
            weapon = new Weapon(3);
        }else if(roll > 5 && roll <= 9){
            weapon = new Weapon(2);
        }else if(roll > 1 && roll <= 4){
            weapon = new Weapon(1);
        }else if(roll == 1){//create random if roll == 1 b/c why not
            weapon = new Weapon();
        }
    }

    private void createArmour(int rank) {
        Dice itemDice = new Dice(10);
        int roll = itemDice.roll();
        
        if(roll == 10 || rank == 6){
            armour = new Armour(3);
        }else if(roll > 5 && roll <= 9){
            armour = new Armour(2);
        }else if(roll > 1 && roll <= 4){
            armour = new Armour(1);
        }else if(roll == 1){//create random if roll == 1 b/c why not
            armour = new Armour();
        }
    }
}
