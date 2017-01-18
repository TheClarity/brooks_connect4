/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;
import java.util.*; 
import java.util.Scanner;
/**
 *
 * @author Owner
 */

public class Connect4Linked{
  static  Node a0,a1, a2, a3, a4, a5, a6, a7;
   static Node b0,b1, b2, b3, b4, b5, b6, b7;
   static Node c0,c1, c2, c3, c4, c5, c6, c7;
   static Node d0,d1, d2, d3, d4, d5, d6, d7;
   static Node e0,e1, e2, e3, e4, e5, e6, e7;
   static Node f0,f1, f2, f3, f4, f5, f6, f7;
   static Node g0,g1, g2, g3, g4, g5, g6, g7;
    
    static Node[][] board = {
        {a0,a1, a2, a3, a4, a5, a6, a7},
        {b0,b1, b2, b3, b4, b5, b6, b7},
        {c0,c1, c2, c3, c4, c5, c6, c7},
        {d0,d1, d2, d3, d4, d5, d6, d7},
        {e0,e1, e2, e3, e4, e5, e6, e7},
        {f0,f1, f2, f3, f4, f5, f6, f7},
        {g0,g1, g2, g3, g4, g5, g6, g7},
    };
    public static final int h = 6;
    public static final int w = 7;
    public static void main(String[] args) {
        for(int i=0; i <h; i++){//height
            for(int j=0; j<w; j++){//width
                boolean up = false, down= false, left= false, right= false;
                    if(i<h-1){//if not bottom
                        down = true;
                        board[i][j].setD(board[i+1][j]);
                    }
                    if(j<w-1){//if not right
                        right = true;
                         board[i][j].setR(board[i][j+1]);
                    }
                     if(i!=0){//if not top
                         up = true;
                        board[i][j].setD(board[i-1][j]);
                    }
                    if(j!=0){//if not left
                        left = true;
                         board[i][j].setL(board[i][j-1]);
                    }
                
                if(up &&left){
                    board[i][j].setUl(board[i-1][i-1]);
                }
                if(up &&right){
                    
                }
                if(down &&left){
                    
                }
                if(down&&right){
                    
                }
                
            }
        }
    }
}

