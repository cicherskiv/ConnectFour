package application;
import javafx.event.ActionEvent;
import java.io.FileWriter;   
import java.io.IOException;
import java.util.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.io.BufferedReader;
import java.io.FileReader;

public class SampleController {
@FXML private Label winner;
@FXML private GridPane g;
@FXML private Button load2;
@FXML private Button button1;
@FXML private Button button2;
@FXML private Button button3;
@FXML private Button button4;
@FXML private Button button5;
@FXML private Button button6;
@FXML private Button button7;
@FXML private Button submit;
@FXML private Button saveGame;
@FXML private Button resetGame;
@FXML private Circle c1;
@FXML private Circle c2;
@FXML private Circle c3;
@FXML private Circle c4;
@FXML private Circle c5;
@FXML private Circle c6;
@FXML private Circle c7;
@FXML private Circle c8;
@FXML private Circle c9;
@FXML private Circle c10;
@FXML private Circle c11;
@FXML private Circle c12;
@FXML private Circle c13;
@FXML private Circle c14;
@FXML private Circle c15;
@FXML private Circle c16;
@FXML private Circle c17;
@FXML private Circle c18;
@FXML private Circle c19;
@FXML private Circle c20;
@FXML private Circle c21;
@FXML private Circle c22;
@FXML private Circle c23;
@FXML private Circle c24;
@FXML private Circle c25;
@FXML private Circle c26;
@FXML private Circle c27;
@FXML private Circle c28;
@FXML private Circle c29;
@FXML private Circle c30;
@FXML private Circle c31;
@FXML private Circle c32;
@FXML private Circle c33;
@FXML private Circle c34;
@FXML private Circle c35;
@FXML private Circle c36;
@FXML private Circle c37;
@FXML private Circle c38;
@FXML private Circle c39;
@FXML private Circle c40;
@FXML private Circle c41;
@FXML private Circle c42;

ArrayList<ArrayList<Circle>> winArra = new ArrayList<ArrayList<Circle>>();



public void initialize() {
	button1 = new Button();
	button2 = new Button();
	button3 = new Button();
	button4 = new Button();
	button5 = new Button();
	button6 = new Button();
	button7 = new Button();
	submit = new Button();
	resetGame = new Button();
	saveGame = new Button();
	

	ArrayList<ArrayList<Circle>> winArra = new 
			ArrayList<ArrayList<Circle>>();
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());

	winArra.get(5).add( c1);
	winArra.get(5).add( c2);
	winArra.get(5).add( c3);
	winArra.get(5).add( c4);
	winArra.get(5).add( c5);
	winArra.get(5).add( c6);
	winArra.get(5).add( c7);
	winArra.get(4).add( c8);
	winArra.get(4).add( c9);
	winArra.get(4).add( c10);
	winArra.get(4).add( c11);
	winArra.get(4).add( c12);
	winArra.get(4).add( c13);
	winArra.get(4).add( c14);
	winArra.get(3).add( c15);
	winArra.get(3).add( c16);
	winArra.get(3).add( c17);
	winArra.get(3).add( c18);
	winArra.get(3).add( c19);
	winArra.get(3).add( c20);
	winArra.get(3).add( c21);
	winArra.get(2).add( c22);
	winArra.get(2).add( c23);
	winArra.get(2).add( c24);
	winArra.get(2).add( c25);
	winArra.get(2).add( c26);
	winArra.get(2).add( c27);
	winArra.get(2).add( c28);
	winArra.get(1).add( c29);
	winArra.get(1).add( c30);
	winArra.get(1).add( c31);
	winArra.get(1).add( c32);
	winArra.get(1).add( c33);
	winArra.get(1).add( c34);
	winArra.get(1).add( c35);
	winArra.get(0).add( c36);
	winArra.get(0).add( c37);
	winArra.get(0).add( c38);
	winArra.get(0).add( c39);
	winArra.get(0).add( c40);
	winArra.get(0).add( c41);
	winArra.get(0).add( c42);
	

	


}

	public void calcButton1(ActionEvent e) { 
		//disable buttons when game is over
		if(winner.getText() == "YOU WIN!!" || winner.getText() == "AI WINS!!" || winner.getText() == "Game Over!") {
			winner.setText("Game Over!");
			button1.setDisable(true);
			button2.setDisable(true);
			button3.setDisable(true);
			button4.setDisable(true);
			button5.setDisable(true);
			button6.setDisable(true);
			button7.setDisable(true);
			saveGame.setDisable(true);

			
			return;
		}
		//define 2d ArrayList
		ArrayList<ArrayList<Circle>> winArra = new 
				ArrayList<ArrayList<Circle>>();
		winArra.add(new ArrayList<Circle>());
		winArra.add(new ArrayList<Circle>());
		winArra.add(new ArrayList<Circle>());
		winArra.add(new ArrayList<Circle>());
		winArra.add(new ArrayList<Circle>());
		winArra.add(new ArrayList<Circle>());

		winArra.get(5).add( c1);
		winArra.get(5).add( c2);
		winArra.get(5).add( c3);
		winArra.get(5).add( c4);
		winArra.get(5).add( c5);
		winArra.get(5).add( c6);
		winArra.get(5).add( c7);
		winArra.get(4).add( c8);
		winArra.get(4).add( c9);
		winArra.get(4).add( c10);
		winArra.get(4).add( c11);
		winArra.get(4).add( c12);
		winArra.get(4).add( c13);
		winArra.get(4).add( c14);
		winArra.get(3).add( c15);
		winArra.get(3).add( c16);
		winArra.get(3).add( c17);
		winArra.get(3).add( c18);
		winArra.get(3).add( c19);
		winArra.get(3).add( c20);
		winArra.get(3).add( c21);
		winArra.get(2).add( c22);
		winArra.get(2).add( c23);
		winArra.get(2).add( c24);
		winArra.get(2).add( c25);
		winArra.get(2).add( c26);
		winArra.get(2).add( c27);
		winArra.get(2).add( c28);
		winArra.get(1).add( c29);
		winArra.get(1).add( c30);
		winArra.get(1).add( c31);
		winArra.get(1).add( c32);
		winArra.get(1).add( c33);
		winArra.get(1).add( c34);
		winArra.get(1).add( c35);
		winArra.get(0).add( c36);
		winArra.get(0).add( c37);
		winArra.get(0).add( c38);
		winArra.get(0).add( c39);
		winArra.get(0).add( c40);
		winArra.get(0).add( c41);
		winArra.get(0).add( c42);
		
		if(c36.getFill() != Color.WHITE) {
			winner.setText("Column full!");
		}
		//goes down column to make chip "fall" to bottom
		else {
		if(c1.getFill() == Color.WHITE) {
		c1.setFill(Color.RED);

		}
		else if(c8.getFill() == Color.WHITE) {
			c8.setFill(Color.RED);
			
			}
		else if(c15.getFill() == Color.WHITE) {
			c15.setFill(Color.RED);
			
			}
		else if(c22.getFill() == Color.WHITE) {
			c22.setFill(Color.RED);
			
			}
		else if(c29.getFill() == Color.WHITE) {
			c29.setFill(Color.RED);
		
			}
		else if(c36.getFill() == Color.WHITE) {
			c36.setFill(Color.RED);
			
			}
		//after user move, AI plays and we check for win
		randomAI();
		gameWon();
		}
		
	}
	public void calcButton2(ActionEvent e) { 
		
		if(winner.getText() == "YOU WIN!!" || winner.getText() == "AI WINS!!" || winner.getText() == "Game Over!") {
			winner.setText("Game Over!");
			button1.setDisable(true);
			button2.setDisable(true);
			button3.setDisable(true);
			button4.setDisable(true);
			button5.setDisable(true);
			button6.setDisable(true);
			button7.setDisable(true);
			saveGame.setDisable(true);

			
			return;
		}
		
		button2 = new Button();
		if(c37.getFill() != Color.WHITE) {
			winner.setText("Column full!");
		}
		else {
		if(c2.getFill() == Color.WHITE) {
		c2.setFill(Color.RED);

		}
		else if(c9.getFill() == Color.WHITE) {
			c9.setFill(Color.RED);
			
			}
		else if(c16.getFill() == Color.WHITE) {
			c16.setFill(Color.RED);
			
			}
		else if(c23.getFill() == Color.WHITE) {
			c23.setFill(Color.RED);
			
			}
		else if(c30.getFill() == Color.WHITE) {
			c30.setFill(Color.RED);
		
			}
		else if(c37.getFill() == Color.WHITE) {
			c37.setFill(Color.RED);
			
			}
		randomAI();
		gameWon();
		}
				
	}
	public void calcButton3(ActionEvent e) { 
		if(winner.getText() == "YOU WIN!!" || winner.getText() == "AI WINS!!" || winner.getText() == "Game Over!") {
			winner.setText("Game Over!");
			button1.setDisable(true);
			button2.setDisable(true);
			button3.setDisable(true);
			button4.setDisable(true);
			button5.setDisable(true);
			button6.setDisable(true);
			button7.setDisable(true);
			saveGame.setDisable(true);

			
			return;
		}
	
		button3 = new Button();
		if(c38.getFill() != Color.WHITE) {
			winner.setText("Column full!");
		}
		else {
		if(c3.getFill() == Color.WHITE) {
		c3.setFill(Color.RED);

		}
		else if(c10.getFill() == Color.WHITE) {
			c10.setFill(Color.RED);
			
			}
		else if(c17.getFill() == Color.WHITE) {
			c17.setFill(Color.RED);
			
			}
		else if(c24.getFill() == Color.WHITE) {
			c24.setFill(Color.RED);
			
			}
		else if(c31.getFill() == Color.WHITE) {
			c31.setFill(Color.RED);
		
			}
		else if(c38.getFill() == Color.WHITE) {
			c38.setFill(Color.RED);
			
			}
		randomAI();
		gameWon();
		}
	}
	public void calcButton4(ActionEvent e) { 
		if(winner.getText() == "YOU WIN!!" || winner.getText() == "AI WINS!!" || winner.getText() == "Game Over!") {
			winner.setText("Game Over!");
			button1.setDisable(true);
			button2.setDisable(true);
			button3.setDisable(true);
			button4.setDisable(true);
			button5.setDisable(true);
			button6.setDisable(true);
			button7.setDisable(true);
			saveGame.setDisable(true);

			
			return;
		}
		
		button4 = new Button();
		if(c39.getFill() != Color.WHITE) {
			winner.setText("Column full!");
		}
		else {
		if(c4.getFill() == Color.WHITE) {
		c4.setFill(Color.RED);

		}
		else if(c11.getFill() == Color.WHITE) {
			c11.setFill(Color.RED);
			
			}
		else if(c18.getFill() == Color.WHITE) {
			c18.setFill(Color.RED);
			
			}
		else if(c25.getFill() == Color.WHITE) {
			c25.setFill(Color.RED);
			
			}
		else if(c32.getFill() == Color.WHITE) {
			c32.setFill(Color.RED);
		
			}
		else if(c39.getFill() == Color.WHITE) {
			c39.setFill(Color.RED);
			
			}
		randomAI();
		gameWon();
		}
		
				
	}
	public void calcButton5(ActionEvent e) { 
		if(winner.getText() == "YOU WIN!!" || winner.getText() == "AI WINS!!" || winner.getText() == "Game Over!") {
			winner.setText("Game Over!");
			button1.setDisable(true);
			button2.setDisable(true);
			button3.setDisable(true);
			button4.setDisable(true);
			button5.setDisable(true);
			button6.setDisable(true);
			button7.setDisable(true);
			saveGame.setDisable(true);

			
			return;
		}
		
		button5 = new Button();
		if(c40.getFill() != Color.WHITE) {
			winner.setText("Column full!");
		}
		else {
		if(c5.getFill() == Color.WHITE) {
		c5.setFill(Color.RED);

		}
		else if(c12.getFill() == Color.WHITE) {
			c12.setFill(Color.RED);
			
			}
		else if(c19.getFill() == Color.WHITE) {
			c19.setFill(Color.RED);
			
			}
		else if(c26.getFill() == Color.WHITE) {
			c26.setFill(Color.RED);
			
			}
		else if(c33.getFill() == Color.WHITE) {
			c33.setFill(Color.RED);
		
			}
		else if(c40.getFill() == Color.WHITE) {
			c40.setFill(Color.RED);
			
			}
		randomAI();
		gameWon();
		}
	
	}
	public void calcButton6(ActionEvent e) { 
		if(winner.getText() == "YOU WIN!!" || winner.getText() == "AI WINS!!" || winner.getText() == "Game Over!") {
			winner.setText("Game Over!");
			button1.setDisable(true);
			button2.setDisable(true);
			button3.setDisable(true);
			button4.setDisable(true);
			button5.setDisable(true);
			button6.setDisable(true);
			button7.setDisable(true);
			saveGame.setDisable(true);

			
			return;
		}
		
		button6 = new Button();
		if(c41.getFill() != Color.WHITE) {
			winner.setText("Column full!");
		}
		else {
		if(c6.getFill() == Color.WHITE) {
		c6.setFill(Color.RED);

		}
		else if(c13.getFill() == Color.WHITE) {
			c13.setFill(Color.RED);
			
			}
		else if(c20.getFill() == Color.WHITE) {
			c20.setFill(Color.RED);
			
			}
		else if(c27.getFill() == Color.WHITE) {
			c27.setFill(Color.RED);
			
			}
		else if(c34.getFill() == Color.WHITE) {
			c34.setFill(Color.RED);
		
			}
		else if(c41.getFill() == Color.WHITE) {
			c41.setFill(Color.RED);
			
			}
		randomAI();
		gameWon();
		}
	
	
	}
	public void calcButton7(ActionEvent e) { 
		if(winner.getText() == "YOU WIN!!" || winner.getText() == "AI WINS!!" || winner.getText() == "Game Over!") {
			winner.setText("Game Over!");
			button1.setDisable(true);
			button2.setDisable(true);
			button3.setDisable(true);
			button4.setDisable(true);
			button5.setDisable(true);
			button6.setDisable(true);
			button7.setDisable(true);
			saveGame.setDisable(true);

			
			return;
		}
		
		button7 = new Button();
	
		if(c42.getFill() != Color.WHITE) {
			winner.setText("Column full!");
		}
		else {
		if(c7.getFill() == Color.WHITE) {
		c7.setFill(Color.RED);

		}
		else if(c14.getFill() == Color.WHITE) {
			c14.setFill(Color.RED);
			
			}
		else if(c21.getFill() == Color.WHITE) {
			c21.setFill(Color.RED);
			
			}
		else if(c28.getFill() == Color.WHITE) {
			c28.setFill(Color.RED);
			
			}
		else if(c35.getFill() == Color.WHITE) {
			c35.setFill(Color.RED);
		
			}
		else if(c42.getFill() == Color.WHITE) {
			c42.setFill(Color.RED);
			
			}
		randomAI();
		gameWon();
		}
	
	}
	public void gameReset(ActionEvent a) {
		//reset all circles to default
		c1.setFill(Color.WHITE);
		c2.setFill(Color.WHITE);
		c3.setFill(Color.WHITE);
		c4.setFill(Color.WHITE);
		c5.setFill(Color.WHITE);
		c6.setFill(Color.WHITE);
		c7.setFill(Color.WHITE);
		c8.setFill(Color.WHITE);
		c9.setFill(Color.WHITE);
		c10.setFill(Color.WHITE);
		c11.setFill(Color.WHITE);
		c12.setFill(Color.WHITE);
		c13.setFill(Color.WHITE);
		c14.setFill(Color.WHITE);
		c15.setFill(Color.WHITE);
		c16.setFill(Color.WHITE);
		c17.setFill(Color.WHITE);
		c18.setFill(Color.WHITE);
		c19.setFill(Color.WHITE);
		c20.setFill(Color.WHITE);
		c21.setFill(Color.WHITE);
		c22.setFill(Color.WHITE);
		c23.setFill(Color.WHITE);
		c24.setFill(Color.WHITE);
		c25.setFill(Color.WHITE);
		c26.setFill(Color.WHITE);
		c27.setFill(Color.WHITE);
		c28.setFill(Color.WHITE);
		c29.setFill(Color.WHITE);
		c30.setFill(Color.WHITE);
		c31.setFill(Color.WHITE);
		c32.setFill(Color.WHITE);
		c33.setFill(Color.WHITE);
		c34.setFill(Color.WHITE);
		c35.setFill(Color.WHITE);
		c36.setFill(Color.WHITE);
		c37.setFill(Color.WHITE);
		c38.setFill(Color.WHITE);
		c39.setFill(Color.WHITE);
		c40.setFill(Color.WHITE);
		c41.setFill(Color.WHITE);
		c42.setFill(Color.WHITE);
		winner.setText("");

	
		
		
	}
	public void randomAI() {
		g = new GridPane();

		ArrayList<ArrayList<Circle>> winArra = new 
				ArrayList<ArrayList<Circle>>();
		winArra.add(new ArrayList<Circle>());
		winArra.add(new ArrayList<Circle>());
		winArra.add(new ArrayList<Circle>());
		winArra.add(new ArrayList<Circle>());
		winArra.add(new ArrayList<Circle>());
		winArra.add(new ArrayList<Circle>());

		winArra.get(5).add( c1);
		winArra.get(5).add( c2);
		winArra.get(5).add( c3);
		winArra.get(5).add( c4);
		winArra.get(5).add( c5);
		winArra.get(5).add( c6);
		winArra.get(5).add( c7);
		winArra.get(4).add( c8);
		winArra.get(4).add( c9);
		winArra.get(4).add( c10);
		winArra.get(4).add( c11);
		winArra.get(4).add( c12);
		winArra.get(4).add( c13);
		winArra.get(4).add( c14);
		winArra.get(3).add( c15);
		winArra.get(3).add( c16);
		winArra.get(3).add( c17);
		winArra.get(3).add( c18);
		winArra.get(3).add( c19);
		winArra.get(3).add( c20);
		winArra.get(3).add( c21);
		winArra.get(2).add( c22);
		winArra.get(2).add( c23);
		winArra.get(2).add( c24);
		winArra.get(2).add( c25);
		winArra.get(2).add( c26);
		winArra.get(2).add( c27);
		winArra.get(2).add( c28);
		winArra.get(1).add( c29);
		winArra.get(1).add( c30);
		winArra.get(1).add( c31);
		winArra.get(1).add( c32);
		winArra.get(1).add( c33);
		winArra.get(1).add( c34);
		winArra.get(1).add( c35);
		winArra.get(0).add( c36);
		winArra.get(0).add( c37);
		winArra.get(0).add( c38);
		winArra.get(0).add( c39);
		winArra.get(0).add( c40);
		winArra.get(0).add( c41);
		winArra.get(0).add( c42);
		
	    ArrayList<Circle> arr = new ArrayList<Circle>();
	    arr.add(c1);
	    arr.add(c2);
	    arr.add(c3);
	    arr.add(c4);
	    arr.add(c5);
	    arr.add(c6);
	    arr.add(c7);
	    arr.add(c8);
	    arr.add(c9);
	    arr.add(c10);
	    arr.add(c11);
	    arr.add(c12);
	    arr.add(c13);
	    arr.add(c14);
	    arr.add(c15);
	    arr.add(c16);
	    arr.add(c17);
	    arr.add(c18);
	    arr.add(c19);
	    arr.add(c20);
	    arr.add(c21);
	    arr.add(c22);
	    arr.add(c23);
	    arr.add(c24);
	    arr.add(c25);
	    arr.add(c26);
	    arr.add(c27);
	    arr.add(c28);
	    arr.add(c29);
	    arr.add(c30);
	    arr.add(c31);
	    arr.add(c32);
	    arr.add(c33);
	    arr.add(c34);
	    arr.add(c35);
	    arr.add(c36);
	    arr.add(c37);
	    arr.add(c38);
	    arr.add(c39);
	    arr.add(c40);
	    arr.add(c41);
	    arr.add(c42);
	    Collections.shuffle(arr);
	    //shuffle a collection of the circles to get random position, could've just done random column
	 
	    	//if statements are so chip will fall to bottom
	    	if(winArra.get(5).get(GridPane.getColumnIndex(arr.get(0))).getFill() == Color.WHITE) {
	    		winArra.get(5).get(GridPane.getColumnIndex(arr.get(0))).setFill(Color.YELLOW);
	 
	    	}
	    	
	    	else if(winArra.get(4).get(GridPane.getColumnIndex(arr.get(0))).getFill() == Color.WHITE) {
	    		winArra.get(4).get(GridPane.getColumnIndex(arr.get(0))).setFill(Color.YELLOW);
	  
	    	}
	    	else if(winArra.get(3).get(GridPane.getColumnIndex(arr.get(0))).getFill() == Color.WHITE) {
	    		winArra.get(3).get(GridPane.getColumnIndex(arr.get(0))).setFill(Color.YELLOW);
	    
	    	}
	    	else if(winArra.get(2).get(GridPane.getColumnIndex(arr.get(0))).getFill() == Color.WHITE) {
	    		winArra.get(2).get(GridPane.getColumnIndex(arr.get(0))).setFill(Color.YELLOW);
	    	
	    	}
	    	else if(winArra.get(1).get(GridPane.getColumnIndex(arr.get(0))).getFill() == Color.WHITE) {
	    		winArra.get(1).get(GridPane.getColumnIndex(arr.get(0))).setFill(Color.YELLOW);
	
	    	}
	    	else if (winArra.get(0).get(GridPane.getColumnIndex(arr.get(0))).getFill() == Color.WHITE){
	    		winArra.get(0).get(GridPane.getColumnIndex(arr.get(0))).setFill(Color.YELLOW);
	    		
	    	}
	
	
	    
	}


	
public void gameWon() {
	
	
	ArrayList<ArrayList<Circle>> winArra = new 
			ArrayList<ArrayList<Circle>>();
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());

	winArra.get(5).add( c1);
	winArra.get(5).add( c2);
	winArra.get(5).add( c3);
	winArra.get(5).add( c4);
	winArra.get(5).add( c5);
	winArra.get(5).add( c6);
	winArra.get(5).add( c7);
	winArra.get(4).add( c8);
	winArra.get(4).add( c9);
	winArra.get(4).add( c10);
	winArra.get(4).add( c11);
	winArra.get(4).add( c12);
	winArra.get(4).add( c13);
	winArra.get(4).add( c14);
	winArra.get(3).add( c15);
	winArra.get(3).add( c16);
	winArra.get(3).add( c17);
	winArra.get(3).add( c18);
	winArra.get(3).add( c19);
	winArra.get(3).add( c20);
	winArra.get(3).add( c21);
	winArra.get(2).add( c22);
	winArra.get(2).add( c23);
	winArra.get(2).add( c24);
	winArra.get(2).add( c25);
	winArra.get(2).add( c26);
	winArra.get(2).add( c27);
	winArra.get(2).add( c28);
	winArra.get(1).add( c29);
	winArra.get(1).add( c30);
	winArra.get(1).add( c31);
	winArra.get(1).add( c32);
	winArra.get(1).add( c33);
	winArra.get(1).add( c34);
	winArra.get(1).add( c35);
	winArra.get(0).add( c36);
	winArra.get(0).add( c37);
	winArra.get(0).add( c38);
	winArra.get(0).add( c39);
	winArra.get(0).add( c40);
	winArra.get(0).add( c41);
	winArra.get(0).add( c42);
	for(int j = 0; j< 7; j++) {//check column wins for user
		for(int k = 0; k<3; k++) {
			if(winArra.get(k).get(j).getFill() == Color.RED && winArra.get(k+1).get(j).getFill() == Color.RED && winArra.get(k+2).get(j).getFill() == Color.RED && winArra.get(k+3).get(j).getFill() == Color.RED) {
			
				winner.setText("YOU WIN!!");
				break;
				
				
		
				
			}
		}
}
	for(int j = 0; j< 6; j++) {//check row wins for user
		for(int k = 0; k<4; k++) {
			if(winArra.get(j).get(k).getFill() == Color.RED && winArra.get(j).get(k+1).getFill() == Color.RED && winArra.get(j).get(k+2).getFill() == Color.RED && winArra.get(j).get(k+3).getFill() == Color.RED) {
			
				winner.setText("YOU WIN!!");
				
				break;
				
			}
		}
		

}
	for(int j = 0; j< 7; j++) {//check column wins for AI
		for(int k = 0; k<3; k++) {
			if(winArra.get(k).get(j).getFill() == Color.YELLOW && winArra.get(k+1).get(j).getFill() == Color.YELLOW && winArra.get(k+2).get(j).getFill() == Color.YELLOW && winArra.get(k+3).get(j).getFill() == Color.YELLOW) {
				
				winner.setText("AI WINS!!");
				
				
				break;
				
			}
		}
}
	for(int j = 0; j< 6; j++) {//check row wins for AI
		for(int k = 0; k<4; k++) {
			if(winArra.get(j).get(k).getFill() == Color.YELLOW && winArra.get(j).get(k+1).getFill() == Color.YELLOW && winArra.get(j).get(k+2).getFill() == Color.YELLOW && winArra.get(j).get(k+3).getFill() == Color.YELLOW) {
				winner.setText("AI WINS!!");
			
				
				break;
				
			}
		}
		

}
	for(int r = 3; r<6; r++) {//check diagonal for user
		for(int c = 0; c<4; c++) {
			if(winArra.get(r).get(c).getFill() == Color.RED && winArra.get(r-1).get(c+1).getFill()==Color.RED && winArra.get(r-2).get(c+2).getFill()==Color.RED && winArra.get(r-3).get(c+3).getFill() == Color.RED) {
				winner.setText("YOU WIN!!");
				
				break;
			}
		}
	}
	for(int r = 0; r<3; r++) {//diagonal for user
		for(int c = 0; c<4; c++) {
			if(winArra.get(r).get(c).getFill() == Color.RED && winArra.get(r+1).get(c+1).getFill()==Color.RED && winArra.get(r+2).get(c+2).getFill()==Color.RED && winArra.get(r+3).get(c+3).getFill() == Color.RED) {
				winner.setText("YOU WIN!!");
			
				break;
			}
		}
	}
	for(int r = 3; r<6; r++) {//diagonal for AI
		for(int c = 0; c<4; c++) {
			if(winArra.get(r).get(c).getFill() == Color.YELLOW && winArra.get(r-1).get(c+1).getFill()==Color.YELLOW && winArra.get(r-2).get(c+2).getFill()==Color.YELLOW && winArra.get(r-3).get(c+3).getFill() == Color.YELLOW) {
				winner.setText("AI WINS!!");
				
				break;
			}
		}
	}
	for(int r = 0; r<3; r++) {//diagonal for AI
		for(int c = 0; c<4; c++) {
			if(winArra.get(r).get(c).getFill() == Color.YELLOW && winArra.get(r+1).get(c+1).getFill()==Color.YELLOW && winArra.get(r+2).get(c+2).getFill()==Color.YELLOW && winArra.get(r+3).get(c+3).getFill() == Color.YELLOW) {
				winner.setText("AI WINS!!");
				
				break;
			}
		}
	}
	            
	
	
	}

public void fileWrite() {//log of moves 
	saveGame = new Button();
	ArrayList<ArrayList<Circle>> winArra = new 
			ArrayList<ArrayList<Circle>>();
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());
	winArra.add(new ArrayList<Circle>());

	winArra.get(5).add( c1);
	winArra.get(5).add( c2);
	winArra.get(5).add( c3);
	winArra.get(5).add( c4);
	winArra.get(5).add( c5);
	winArra.get(5).add( c6);
	winArra.get(5).add( c7);
	winArra.get(4).add( c8);
	winArra.get(4).add( c9);
	winArra.get(4).add( c10);
	winArra.get(4).add( c11);
	winArra.get(4).add( c12);
	winArra.get(4).add( c13);
	winArra.get(4).add( c14);
	winArra.get(3).add( c15);
	winArra.get(3).add( c16);
	winArra.get(3).add( c17);
	winArra.get(3).add( c18);
	winArra.get(3).add( c19);
	winArra.get(3).add( c20);
	winArra.get(3).add( c21);
	winArra.get(2).add( c22);
	winArra.get(2).add( c23);
	winArra.get(2).add( c24);
	winArra.get(2).add( c25);
	winArra.get(2).add( c26);
	winArra.get(2).add( c27);
	winArra.get(2).add( c28);
	winArra.get(1).add( c29);
	winArra.get(1).add( c30);
	winArra.get(1).add( c31);
	winArra.get(1).add( c32);
	winArra.get(1).add( c33);
	winArra.get(1).add( c34);
	winArra.get(1).add( c35);
	winArra.get(0).add( c36);
	winArra.get(0).add( c37);
	winArra.get(0).add( c38);
	winArra.get(0).add( c39);
	winArra.get(0).add( c40);
	winArra.get(0).add( c41);
	winArra.get(0).add( c42);
	 try {//researched this
	      FileWriter myWriter = new FileWriter("connectLog.txt");
	      //writes coordinates and color(whose move) to a txt file
	      for(int i = 5; i>=0; i--){
	    	  for(int j = 0; j<7; j++){
	    	  myWriter.write(winArra.get(i).get(j).getFill().toString() + " Row: "+i + " Column:" +j+"\n"); 
	      }
	      }
	     
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	 //resets game because button is "save and quit"
	 c1.setFill(Color.WHITE);
		c2.setFill(Color.WHITE);
		c3.setFill(Color.WHITE);
		c4.setFill(Color.WHITE);
		c5.setFill(Color.WHITE);
		c6.setFill(Color.WHITE);
		c7.setFill(Color.WHITE);
		c8.setFill(Color.WHITE);
		c9.setFill(Color.WHITE);
		c10.setFill(Color.WHITE);
		c11.setFill(Color.WHITE);
		c12.setFill(Color.WHITE);
		c13.setFill(Color.WHITE);
		c14.setFill(Color.WHITE);
		c15.setFill(Color.WHITE);
		c16.setFill(Color.WHITE);
		c17.setFill(Color.WHITE);
		c18.setFill(Color.WHITE);
		c19.setFill(Color.WHITE);
		c20.setFill(Color.WHITE);
		c21.setFill(Color.WHITE);
		c22.setFill(Color.WHITE);
		c23.setFill(Color.WHITE);
		c24.setFill(Color.WHITE);
		c25.setFill(Color.WHITE);
		c26.setFill(Color.WHITE);
		c27.setFill(Color.WHITE);
		c28.setFill(Color.WHITE);
		c29.setFill(Color.WHITE);
		c30.setFill(Color.WHITE);
		c31.setFill(Color.WHITE);
		c32.setFill(Color.WHITE);
		c33.setFill(Color.WHITE);
		c34.setFill(Color.WHITE);
		c35.setFill(Color.WHITE);
		c36.setFill(Color.WHITE);
		c37.setFill(Color.WHITE);
		c38.setFill(Color.WHITE);
		c39.setFill(Color.WHITE);
		c40.setFill(Color.WHITE);
		c41.setFill(Color.WHITE);
		c42.setFill(Color.WHITE);
		winner.setText("");
}

public void load() {
	load2 = new Button();
	ArrayList<Circle> arr = new ArrayList<Circle>();
    arr.add(c1);
    arr.add(c2);
    arr.add(c3);
    arr.add(c4);
    arr.add(c5);
    arr.add(c6);
    arr.add(c7);
    arr.add(c8);
    arr.add(c9);
    arr.add(c10);
    arr.add(c11);
    arr.add(c12);
    arr.add(c13);
    arr.add(c14);
    arr.add(c15);
    arr.add(c16);
    arr.add(c17);
    arr.add(c18);
    arr.add(c19);
    arr.add(c20);
    arr.add(c21);
    arr.add(c22);
    arr.add(c23);
    arr.add(c24);
    arr.add(c25);
    arr.add(c26);
    arr.add(c27);
    arr.add(c28);
    arr.add(c29);
    arr.add(c30);
    arr.add(c31);
    arr.add(c32);
    arr.add(c33);
    arr.add(c34);
    arr.add(c35);
    arr.add(c36);
    arr.add(c37);
    arr.add(c38);
    arr.add(c39);
    arr.add(c40);
    arr.add(c41);
    arr.add(c42);
	BufferedReader reader;

	try {//researched this
		reader = new BufferedReader(new FileReader("connectLog.txt"));
		String line = reader.readLine();
		int i =0;
		while (line != null && i<42) {
			//for each line, gets color code and assigns to the correct circle
			//file written in order
			
			if(line.split(" ")[0].contains ("0xffffffff")) {
				arr.get(i).setFill(Color.WHITE);
			
			}
			else if(line.split(" ")[0].contains("0xff0000ff")) {
				arr.get(i).setFill(Color.RED);
			
			}
			else if (line.split(" ")[0].contains("0xffff00ff")){
				arr.get(i).setFill(Color.YELLOW);
				
			}
			i++;
				
			line = reader.readLine();
		}

		reader.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}

}

	
		



