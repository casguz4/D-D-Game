//package dungeonchampions;
//
//import java.util.ArrayList;
//
//
///**
// *
// * @author casgu
// */
//public class DungeonChampions {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        
//        ArrayList<Object> fightQueue = new ArrayList<Object>();
//        
//        Npc npc = new Npc();
//                
//        System.out.println("Rank " + npc.getRank());
//        System.out.println("Hitpoints " + npc.getHitpoints());
//        System.out.println("Strength " + npc.getStrength());
//        System.out.println("Wisdom " + npc.getWisdom());
//        System.out.println("Agility " + npc.getAgility());
//        System.out.println("");  
//
//         Knight k1 = new Knight();
//         Thief t1 = new Thief();
//         Wizard w1 = new Wizard();
//         
//         System.out.println(k1.getStrength());
//         System.out.println(t1.getStrength());
//         System.out.println(w1.getStrength());
//         System.out.println("");
//         
//         System.out.println(k1.getAgility());
//         System.out.println(t1.getAgility());
//         System.out.println(w1.getAgility());
//         System.out.println("");
//         
//         System.out.println(k1.getWisdom());
//         System.out.println(t1.getWisdom());
//         System.out.println(w1.getWisdom());
//        
//         
//         System.out.println("NPC weapon: " + npc.getWeapon());
//         
//         t1.useAbility(npc);
//         
//         if(t1.weapon != null){
//             System.out.println("Thief weapon now: " + t1.weapon.toString());
//         }
//    }
//    
//}
