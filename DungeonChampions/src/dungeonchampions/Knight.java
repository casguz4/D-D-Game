package dungeonchampions;

import ArrayBag.ArrayBag;

/**
 *
 * @author Casimer Guzdziol
 */
public class Knight extends Player{
    private int agility, wisdom, strength;
    public Knight(){
        super();
        strength += 3;
        wisdom += -3;
    }

    @Override
    public void attack( Npc target ){
        target.modHealth( this.getStrength() );
    }
    
    @Override
    public void useAbility( Npc target ){
        target.stunned = true;
        target.modHealth( strength );
    }

    @Override
    public void useWeapon(Npc target ) {
        target.modHealth( strength + weapon.damage);
    }
}
