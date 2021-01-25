/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuprojekt;

import java.util.ArrayList;
import java.util.Random;

public class SudokuSolver {

    int[] mat[]; 
    int N; //ile wierszy 
    int SRN; //pierwastek z N
    int K; // ilosc pozycji do usuniecia
  
    // Konstruktor
    SudokuSolver(int N, int K) 
    { 
        this.N = N; 
        this.K = K; 
  
        // Obliczenie pierwiastka z N
        Double SRNd = Math.sqrt(N); 
        SRN = SRNd.intValue();
  
        mat = new int[N][N]; 
    } 
  
    // Sudoku Generator 
    public void fillValues() 
    { 
        // Uzupełnienie przekątnych SRN x SRN macierzy
        fillDiagonal(); 
  
        // Uzupełnienie pozostałych 
        fillRemaining(0, SRN); 
  
        // Usunięcie w randomowych miejscach K pozycji
        removeKDigits(); 
    } 
  
    // Wypełnij przekątną liczbę SRN macierzy SRN x SRN 
    void fillDiagonal() 
    { 
  
        for (int i = 0; i<N; i=i+SRN) 
  
            // dla przekątnego boxa, zacznij od i==j 
            fillBox(i, i); 
    } 
  
    // Zwraca false, jeśli dany blok 3 x 3 zawiera num
    boolean unUsedInBox(int rowStart, int colStart, int num) 
    { 
        for (int i = 0; i<SRN; i++) 
            for (int j = 0; j<SRN; j++) 
                if (mat[rowStart+i][colStart+j]==num) 
                    return false; 
  
        return true; 
    } 
  
    // uzupełnia macierz 3x3 
    void fillBox(int row,int col) 
    { 
        int num; 
        for (int i=0; i<SRN; i++) 
        { 
            for (int j=0; j<SRN; j++) 
            { 
                do
                { 
                    num = randomGenerator(N); 
                } 
                while (!unUsedInBox(row, col, num)); 
  
                mat[row+i][col+j] = num; 
            } 
        } 
    } 
  
    // Random generator 
    int randomGenerator(int num) 
    { 
        return (int) Math.floor((Math.random()*num+1)); 
    } 
  
    // sprawdza czy bezpieczne żeby wstawić w komórke
    boolean CheckIfSafe(int i,int j,int num) 
    { 
        return (unUsedInRow(i, num) && 
                unUsedInCol(j, num) && 
                unUsedInBox(i-i%SRN, j-j%SRN, num)); 
    } 
  
    // sprawdź w rzędzie istnienie
    boolean unUsedInRow(int i,int num) 
    { 
        for (int j = 0; j<N; j++) 
           if (mat[i][j] == num) 
                return false; 
        return true; 
    } 
  
    // sprawdź w kolumnie
    boolean unUsedInCol(int j,int num) 
    { 
        for (int i = 0; i<N; i++) 
            if (mat[i][j] == num) 
                return false; 
        return true; 
    } 
  
    //Funkcja rekurencyjna do wypełnienia pozostałych
    
    boolean fillRemaining(int i, int j) 
    { 
        //  System.out.println(i+" "+j); 
        if (j>=N && i<N-1) 
        { 
            i = i + 1; 
            j = 0; 
        } 
        if (i>=N && j>=N) 
            return true; 
  
        if (i < SRN) 
        { 
            if (j < SRN) 
                j = SRN; 
        } 
        else if (i < N-SRN) 
        { 
            if (j==(int)(i/SRN)*SRN) 
                j =  j + SRN; 
        } 
        else
        { 
            if (j == N-SRN) 
            { 
                i = i + 1; 
                j = 0; 
                if (i>=N) 
                    return true; 
            } 
        } 
  
        for (int num = 1; num<=N; num++) 
        { 
            if (CheckIfSafe(i, j, num)) 
            { 
                mat[i][j] = num; 
                if (fillRemaining(i, j+1)) 
                    return true; 
  
                mat[i][j] = 0; 
            } 
        } 
        return false; 
    } 
  
    //usuń K elementów
    public void removeKDigits() 
    { 
        int count = K; 
        while (count != 0) 
        { 
            int cellId = randomGenerator(N*N)-1; 
  
            // System.out.println(cellId); 
            // wyodrębnij współrzędne i i j
            int i = (cellId/N); 
            int j = cellId%N; 
            if (j != 0) 
                j = j - 1; 
  
            // System.out.println(i+" "+j); 
            if (mat[i][j] != 0) 
            { 
                count--; 
                mat[i][j] = 0; 
            } 
        } 
    } 
  
    // Drukuj sudoku
    public void printSudoku() 
    { 
        for (int i = 0; i<N; i++) 
        { 
            for (int j = 0; j<N; j++) 
                System.out.print(mat[i][j] + " "); 
            System.out.println(); 
        } 
        System.out.println(); 
    } 
    public int[][] returnSudoku(){
        return mat;
    }
  
    
} 

