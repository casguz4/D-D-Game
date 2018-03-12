/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmasters;
import dungeonchampions.*;
import dungeonmasters.DungeonMasters;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author casgu
 */
public class FXMLController implements Initializable {

    @FXML
    private BorderPane borderPane;
    @FXML
    private GridPane heroGrid;
    @FXML
    private TitledPane player1;
    @FXML
    private Label p1Health;
    @FXML
    private Label p1Agility;
    @FXML
    private Label p1Strength;
    @FXML
    private Label p1Wisdom;
    @FXML
    private Label p1Weapon;
    @FXML
    private Label p1Armour;
    @FXML
    private TitledPane player2;
    @FXML
    private AnchorPane player3;
    @FXML
    private AnchorPane player4;
    @FXML
    private AnchorPane player5;
    @FXML
    private AnchorPane player6;
    @FXML
    private GridPane enemyGrid;
    @FXML
    private Button start;
    @FXML
    private Label p2Health;
    @FXML
    private Label p2Strength;
    @FXML
    private Label p2Wisdom;
    @FXML
    private Label p2Weapon;
    @FXML
    private Label p2Armour;
    @FXML
    private Label p2Agility;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void startGame(MouseEvent event) {
        int numberOfHeroes;
        
        String input = JOptionPane.showInputDialog("How many HEROES will enter?");
        numberOfHeroes = Integer.parseInt(input);
        
        Player[] playerArr = new Player[numberOfHeroes];
        
        for(int i = 0; i < numberOfHeroes; i++){
            Player player = null;
            playerArr[i] = player;
        }
        
        for(int i = 0; i < numberOfHeroes; i++){
            input = JOptionPane.showInputDialog("What is your heroes class?\nChoose:\n"
                    + "\n1 - Knight"
                    + "\n2 - Thief"
                    + "\n3 - Wizard"
                    + "\n4 - Priest");
            int chooseClass = Integer.parseInt(input);
            while(chooseClass < 1 && chooseClass > 4){
                JOptionPane.showMessageDialog(null, "What are you doing? Choose 1-4...");
                input = JOptionPane.showInputDialog("What is your heroes class?\nChoose:"
                    + "\n1 - Knight"
                    + "\n2 - Thief"
                    + "\n3 - Wizard"
                    + "\n4 - Priest");
                chooseClass = Integer.parseInt(input);
            }
            
            
            switch(chooseClass){
                case 1:
                     playerArr[i] = new Knight();
                    break;
                case 2:
                    playerArr[i] = new Thief();
                    break;
                case 3:
                    playerArr[i] = new Wizard();
                    break;
                case 4:
                    playerArr[i] = new Priest();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "You must've messed something big up this time");
            }
            
            if( i == 0){
                player1.setText("Player 1 " + playerArr[i].getName());
                p1Health.setText("Health: " + playerArr[i].getHealth() );
                p1Agility.setText("Agility: " + playerArr[i].getAgility() );
                p1Strength.setText("Strength: " + playerArr[i].getStrength());
                p1Wisdom.setText("Wisdom: " + playerArr[i].getWisdom());
                p1Weapon.setText("Weapon: Empty");
                p1Armour.setText("Armour: Cloak");
            }
            // TODO: construct player initializer
            else if( i == 1 ){
                player2.setText("Player 2 " + playerArr[i].getName());
                p2Health.setText("Health: " + playerArr[i].getHealth() );
                p2Agility.setText("Agility: " + playerArr[i].getAgility() );
                p2Strength.setText("Strength: " + playerArr[i].getStrength());
                p2Wisdom.setText("Wisdom: " + playerArr[i].getWisdom());
                p2Weapon.setText("Weapon: Empty");
                p2Armour.setText("Armour: Cloak");
            }
//            else if( i == 2 ){
//                player3.setText("Player 3");
//                p3Health.setText("Health: " + playerArr[i].getHealth() );
//                p3Agility.setText("Agility: " + playerArr[i].getAgility() );
//                p3Strength.setText("Strength: " + playerArr[i].getStrength());
//                p3Wisdom.setText("Wisdom: " + playerArr[i].getWisdom());
//                p3Weapon.setText("Weapon: Empty");
//                p3Armour.setText("Armour: Cloak");
//            }
//            else if( i == 3 ){
//                player4.setText("Player 4");
//                p4Health.setText("Health: " + playerArr[i].getHealth() );
//                p4Agility.setText("Agility: " + playerArr[i].getAgility() );
//                p4Strength.setText("Strength: " + playerArr[i].getStrength());
//                p4Wisdom.setText("Wisdom: " + playerArr[i].getWisdom());
//                p4Weapon.setText("Weapon: Empty");
//                p4Armour.setText("Armour: Cloak");
//            }
//            else if( i == 4 ){
//                player5.setText("Player 5");
//                p5Health.setText("Health: " + playerArr[i].getHealth() );
//                p5Agility.setText("Agility: " + playerArr[i].getAgility() );
//                p5Strength.setText("Strength: " + playerArr[i].getStrength());
//                p5Wisdom.setText("Wisdom: " + playerArr[i].getWisdom());
//                p5Weapon.setText("Weapon: Empty");
//                p5Armour.setText("Armour: Cloak");
//            }
//            else if( i == 5 ){
//                player6.setText("Player 6");
//                p6Health.setText("Health: " + playerArr[i].getHealth() );
//                p6Agility.setText("Agility: " + playerArr[i].getAgility() );
//                p6Strength.setText("Strength: " + playerArr[i].getStrength());
//                p6Wisdom.setText("Wisdom: " + playerArr[i].getWisdom());
//                p6Weapon.setText("Weapon: Empty");
//                p6Armour.setText("Armour: Cloak");
//            }
        }
    }
    
}
