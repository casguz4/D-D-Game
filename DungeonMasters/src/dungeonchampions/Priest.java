

package dungeonchampions;

/**
 *
 * @author Casimer Guzdziol
 */
public class Priest extends Player{
    
    private int agility, wisdom, strength, health;
    private String name = "Priest";
    
    public Priest() {
        super();
        health += 5;
        strength += -5;
        agility += -8;
        wisdom += 8;
    }

    @Override
    public void attack(Npc target) {
        target.modHealth(-strength);
    }
    
    public void useAbility(Player target){
        Dice die = new Dice(6);
        int heal =  die.roll(3);
        target.modHealth(heal);
    }
    
    @Override
    public void useAbility(Npc target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
