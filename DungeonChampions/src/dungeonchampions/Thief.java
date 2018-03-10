package dungeonchampions;
/**
 *
 * @author Casimer Guzdziol
 */
public class Thief extends Player {
    private int agility, wisdom, strength;
    
    public Thief() {
        super();
        agility += 3;
        strength += -2;
        wisdom += 2;
    }
    
    @Override
    public void attack(Npc target) {
        target.modHealth( -strength );
    }
    
    @Override
    public void useAbility( Npc target){
        Dice newDie = new Dice(20);
        if( this.agility - newDie.roll() > 0 && target.weapon != null ){
            this.weapon = target.weapon;
            target.weapon = null;
        }else{
            System.out.println("OH NO! \nYou couldn'nt steal the weapon!");
        }
    }
    
}
