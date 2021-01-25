/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuprojekt;

import java.awt.Color;

/**
 *
 * @author user
 */
public class SudokuProjekt {

        public static boolean latwy=false;
        public static boolean sredni=false;
        public static boolean trudny=false;
        public static boolean latwybinarny=false;
        public static boolean srednibinarny=false;
        public static boolean trudnybinarny=false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int N = 9, K = 20; 
        //SudokuSolver sudoku = new SudokuSolver(N, K); 
        //sudoku.fillValues(); 
        //sudoku.printSudoku();
        OknoLogowania frame=new OknoLogowania();
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(219, 215, 217));
        
       
   }
    
}
