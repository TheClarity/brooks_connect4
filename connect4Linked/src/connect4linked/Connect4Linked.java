/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4linked;
import connect4linked.Node;
import java.util.*; 
import java.util.Scanner;
/**
 *
 * @author Owner
 */

public class Connect4Linked{
   public static boolean play = true;
        public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
  static  Node a0,a1, a2, a3, a4, a5, a6;
   static Node b0,b1, b2, b3, b4, b5, b6;
   static Node c0,c1, c2, c3, c4, c5, c6;
   static Node d0,d1, d2, d3, d4, d5, d6;
   static Node e0,e1, e2, e3, e4, e5, e6;
   static Node f0,f1, f2, f3, f4, f5, f6;
   public static int player;
   
    static Node[][] board = {
        {a0,a1, a2, a3, a4, a5, a6},
        {b0,b1, b2, b3, b4, b5, b6},
        {c0,c1, c2, c3, c4, c5, c6},
        {d0,d1, d2, d3, d4, d5, d6},
        {e0,e1, e2, e3, e4, e5, e6},
        {f0,f1, f2, f3, f4, f5, f6},
    };
    public static final int h = 6;
    public static final int w = 7;
    public static void main(String[] args) {
        init();
        print();
        input();
    }
    
        public static void init(){
        for(int i=0; i <h; i++){//height
            for(int j=0; j<w; j++){//width
                board[i][j] = new Node();
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
                    board[i][j].setUl(board[i-1][j-1]);
                }
                if(up &&right){
                    board[i][j].setUl(board[i-1][j+1]);
                }
                if(down &&left){
                    board[i][j].setUl(board[i+1][j-1]);
                }
                if(down&&right){
                    board[i][j].setUl(board[i+1][j+1]);
                }
                
            }
        }
    }
    public static void print(){
        System.out.println("1 2 3 4 5 6 7");
        for(int i = 0; i < h;i++){
            for(int j = 0; j < w;j++){
            if (board[i][j].v == 0){
                System.out.print("○ ");
            }
            if (board[i][j].v == 1){
                System.out.print(ANSI_BLUE + "⬤ "+ANSI_RESET);
            }
            if (board[i][j].v == 2){
                System.out.print(ANSI_RED + "⬤ "+ANSI_RESET);
            }
        }
            System.out.println();
        }
    }
    public static void input(){
        int counter = 0;
        int column;
        while(play){
            player  = (counter %2)+1;
            Scanner sc = new Scanner(System.in);
            String input;
            System.out.print("Player "+player+" enter a column  ");
            input = sc.nextLine();
            column = Integer.parseInt(input)-1;
            if(column >= 0 && column <w){
                for (int i = h-1; i >= 0;i--){
                    if(board[i][column].v == 0){
                        board[i][column].v = player;
                        winCheck(i,column);
                        counter++;
                        break;
                    }
                    else if(i == 0){
                        System.out.println("Column is full");
                        break;
                    }
                }
                print();
                
            }
            else{
                System.out.println("Please enter valid colum (1-7)");
            }
        }
    }
    public static void winCheck( int r,int c){
        
        int matches =0;
        for(int i = 0; i<h;i++){
            if(board[i][c].v == player){//vertical check
                matches++;
            }
            else{
                matches = 0;
            }
            if(matches==4){
                System.out.println("Player "+ player+" has won!");
                play=false;
            }
        }
        
        for(int i = 0; i<w;i++){//horizontal check
            if(board[r][i].v == player){
                matches++;
            }
            else{
                matches = 0;
            }
            if(matches==4){
                System.out.println("Player "+ player+" has won!");
                play=false;
            }
        }
        //Diagonal Checks
        while(board[r][c].dr != null){
            
        }
    }
}

