package dungeonchampions;

/**
 *
 * @author casgu
 * @param <T>
 */
public interface PlayerInterface<T> {
    String getName();
    int getHealth();
    int getStrength();
    int getWisdom();
    int getAgility();
    boolean isAlive();
    boolean isStunned();
    void clearStatus();
    void sleep();
    void attack( Npc target );
    void useAbility( Npc target );
    void modHealth( int n );
    void modStrength( int n );
    void modWisdom( int n );
    void modAgility( int n );
    void pickupItem( T item );
    void useWeapon( Npc Target );
    String toString();
}
