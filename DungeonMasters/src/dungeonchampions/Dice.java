
package dungeonchampions;

/**
 *
 * @author Casimer Guzdziol
 */
public class Dice implements DiceInterface{
    private int value;
    private int sides;
    
    public Dice(){
        sides = 6;
    } 
    
    public Dice( int sides ){
        this.sides = sides;
    }
    
    @Override
    public int roll(){
        value = 0;
        return value = (int)(Math.random() * sides + 1);
    }
    
    @Override
    public int roll(int rolls) {
        value = 0;
        for( int i = 0; i < rolls; i++ ){
            value += (int)(Math.random() * sides + 1);
        }
        return value;
    }
}
