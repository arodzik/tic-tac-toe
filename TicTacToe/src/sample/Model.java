package sample;

import java.lang.ref.SoftReference;

/**
 * Created by Adrian on 2016-04-10.
 */
public class Model {

    public static final int X = 1;
    public static final int O = -1;
    public static final int BLANK = 0;

    public static final int SIZE =3;
    private int[][] table;
    private int activePlayer;

    public void setValue(int x, int y, int value){

        table[x][y]=value;
    }

    public int getValue(int x, int y){

        return table[x][y];
    }

    public int getActivePlayer(){

        return activePlayer;
    }

    public void swichPlayer(){

        activePlayer= -activePlayer;
    }

    /*
    --------------------------------------------------------------------------------------------------------
    Konstruktor
     */

    public Model(){
        table = new int[SIZE][SIZE];
        activePlayer=O;
    }

    /*
    ---------------------------------------------------------------------------------------------------------
    Metoda sprawdzająca zwycięzcę
     */

    public int getWinner() {
        int winner = BLANK;

        //Sprawdzanie wierszy
        for (int row = 0; row < SIZE; row++) {
            for (int col=1; col<SIZE; col++){
                if(table[row][col] != table[row][col-1]){
                    break;
                }else if (col==SIZE-1){
                    winner = table[row][col];
                    return winner;
                }
            }
        }

        //Sprawdzanie kolumn
        for(int row=0; row<SIZE; row++){
            for (int col=1; col<SIZE; col++){
                if(table[col][row] != table[col-1][row]) {
                    break;
                }else if(col==SIZE-1){
                    winner = table[col][row];
                    return winner;
                }
            }
        }

        //Sprwadzanie pierwszej przekątnej
        for(int i=1; i<SIZE; i++){
            if(table[i][i] != table[i-1][i-1]){
                break;
            }else if (i==SIZE-1){
                winner = table[i][i];
                return winner;
            }
        }

        //Sprawdzanie drugiej przekątniej
        for (int i=0; i<SIZE-1; i++){
            if(table[i][SIZE-1 - i] != table[i+1][SIZE-2 - i]){
                break;
            }else if (i==SIZE-2){
                winner = table[i][i];
                return winner;
            }
        }

        return winner;
    }


}
