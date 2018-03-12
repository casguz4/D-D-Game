package dungeonchampions;
/**
 *
 * @author Casimer Guzdziol
 */
public class Wizard extends Player{
    private int agility, wisdom, strength;
    private String name = "Wizard";
    public Wizard(){
        super();
        agility += - 3;
        strength += - 5;
        wisdom += 5;
    }

    @Override
    public void attack(Npc target) {
        target.modHealth( strength );
    }
    
    @Override
    public void useAbility( Npc target ){
        Dice newDie = new Dice(10);
        target.modHealth( newDie.roll() );
    }
    
    @Override
    public String getName(){
        return name;
    }

}
