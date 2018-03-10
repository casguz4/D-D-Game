

package dungeonchampions;

/**
 *
 * @author Casimer Guzdziol
 */
public class Armour {
    private int rank;
    public String name;
    private int damageReduction;
    private int durability;
    
    public Armour(){
        Dice rankDie = new Dice(3);
        rank = rankDie.roll();
        
        switch( rank ){
            case 1:
                damageReduction = 1;
                name = "Leather Armour";
                break;
            
            case 2:
                damageReduction = 2;
                name = "Steel Armour";
                break;
                
            case 3:
                damageReduction = 3;
                name = "Elvin Armour";
                break;
        }
        
        Dice durabilityDie = new Dice(20);
        durability = durabilityDie.roll();
    }
    
    public Armour( int n ){
        rank = n;
        
        switch( rank ){
            case 1:
                damageReduction = 1;
                name = "Leather Armour";
                break;
            
            case 2:
                damageReduction = 2;
                name = "Steel Armour";
                break;
                
            case 3:
                damageReduction = 3;
                name = "Elvin Armour";
                break;
        }
        
        Dice durabilityDie = new Dice(20);
        durability = durabilityDie.roll();
        while( durability < 10 ){
            durability = durabilityDie.roll();
        }
    }

    public int getRank() {
        return rank;
    }

    public int getDamageReduction() {
        return damageReduction;
    }

    public int getDurability() {
        return durability;
    }
    
    @Override
    public String toString(){
        return "Name: " + this.name 
                + ", Rank: " + this.rank 
                + ", Damage: " + this.damageReduction
                + ", Durability: " + this.durability;
    }
}
