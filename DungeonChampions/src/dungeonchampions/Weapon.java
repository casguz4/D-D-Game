

package dungeonchampions;

/**
 *
 * @author Casimer Guzdziol
 */
public class Weapon {
    public int rank;
    public String name;
    public int damage;
    public int durability;
    
    public Weapon(){
        Dice rankDie = new Dice(3);
        rank = rankDie.roll();
        
        switch( rank ){
            case 1:
                damage = 1;
                name = "Dagger";
                break;
            
            case 2:
                damage = 2;
                name = "Battle Axe";
                break;
                
            case 3:
                damage = 3;
                name = "Enchanted Long Sword";
                break;
        }
        
        Dice durabilityDie = new Dice(20);
        durability = durabilityDie.roll();
    }
    
    public Weapon( int n ){
        rank = n;
        switch( rank ){
            case 1:
                damage = 1;
                name = "Dagger";
                break;
            
            case 2:
                damage = 2;
                name = "Battle Axe";
                break;
                
            case 3:
                damage = 3;
                name = "Enchanted Long Sword";
                break;
        }
        
        Dice durabilityDie = new Dice(20);
        durability = durabilityDie.roll();
        while(durability < 10){
            durability = durabilityDie.roll();
        }
    }
    
    @Override
    public String toString(){
        return "Name: " + this.name 
                + ", Rank: " + this.rank 
                + ", Damage: " + this.damage
                + ", Durability: " + this.durability;
    }
}
