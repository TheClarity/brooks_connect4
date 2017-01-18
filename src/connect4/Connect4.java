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
public class Connect4 {

    /**
     * @param args the command line arguments
     */
   public static boolean play;
    public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
public static int column;
public static int changedRow;
public static boolean dropping;
public static int turn =1;
public static int row;
public static int user;
public static boolean win;
public static int x;
public static int y;

     public static List <Integer>[][] c4 = (List<Integer>[][]) new List[6][7];
    public static void main(String[] args) {
        int w;
       for (int i = 0; i < 6; i++) {
    for (int j = 0; j < 7; j++) {
        c4[i][j]= new LinkedList<>();
            c4[i][j].add(0);
            w = j+1;
           
            //System.out.print(c4[i][j].get(0));
            if(c4[i][j].get(0) == 0){
                System.out.print(ANSI_YELLOW + "\u25A0" +" "+ANSI_RESET);
            }
    }
    
      System.out.println("");
      
}
       System.out.println("Just input the column number you want to drop your chip in!");
        System.out.println("Users Turn: "+ANSI_RED + "\u25A0" +" "+ANSI_RESET);
       play = true;
        while (play) {
            input();
        }

    }
             public static void input() {
        Scanner sc = new Scanner(System.in);
        String input;
        
        input = sc.nextLine().toLowerCase();
        
        
        column = Integer.parseInt(input);
        
        
        if (turn%2 ==0){
            user = 2;
        }
        else{
            user= 1;
        }
        if (column<=0 || column > 7){
            System.out.println("invalid column number!");
        } else{
            column = column -1;
            dropping = true;
            row = 5;
            while(dropping == true){
                
                if(c4[0][column].get(0) != 0){
                    System.out.println("Column is full!");
                    dropping = false;
                }
                else{
                    if(c4[row][column].get(0) == 0){
                       c4[row][column].set(0,user);
                       changedRow = row;
                         turn++;
                         dropping = false;
                         x = column;
                         y = row;
                }
                    else{
                        row--;
                    }
                }
            }
            
            
            //!!!!!!!!!!!!!!!!!!!!!!
            //!!PRINTING THE BOARD!!
            //!!!!!!!!!!!!!!!!!!!!!!
        System.out.println("");
        
       for (int i = 0; i < 6; i++) {
    for (int j = 0; j < 7; j++) {
            if(c4[i][j].get(0) == 0){
                System.out.print(ANSI_YELLOW + "\u25A0" +" "+ANSI_RESET);
            }
            else if(c4[i][j].get(0) == 1){
                System.out.print(ANSI_RED + "\u25A0" +" "+ANSI_RESET);
            }
            else if(c4[i][j].get(0) == 2){
                System.out.print(ANSI_GREEN + "\u25A0" +" "+ANSI_RESET);
            }
            
    }
    
      System.out.println("");
}
       if (turn%2 ==0){
            System.out.println("Users Turn: "+ANSI_GREEN + "\u25A0" +" "+ANSI_RESET);
        }
        else{
            System.out.println("Users Turn: "+ANSI_RED + "\u25A0" +" "+ANSI_RESET);
        }
       System.out.println("");
             }
             
        //!!!!!!!!!!!!!!!!!!
        //!!CHECK FOR WINS!!
        //!!!!!!!!!!!!!!!!!!
        
        boolean checking = true;
        int streak;
        int v =0;
        
        
        
        
                //!!!!!!!!!!!!!!!!!
                //!!VERTICAL WINS!!
                //!!!!!!!!!!!!!!!!!
                
                
                
             streak = 0;
            row = 0;
            for(int i=1;i<=2;i++){
                streak = 0;
                row = 0;
             while(row<6){
                    if(c4[row][column].get(0) == i){
                        row++;
                        streak++;
                }
                    else{
                            streak = 0;
                            row++;
                        
                    }
                    if(streak == 4){
                        if (i%2 ==0){
            System.out.println("PLAYER "+ANSI_GREEN + "\u25A0" +" "+ANSI_RESET+"HAS WON");
        }
        else{
            System.out.println("PLAYER "+ANSI_RED + "\u25A0" +" "+ANSI_RESET+"HAS WON");
        }
                        play = false;
                        return;
                    }
            }
            }
            
                //!!!!!!!!!!!!!!!!!!!
                //!!HORIZONTAL WINS!!
                //!!!!!!!!!!!!!!!!!!!
            
            
            streak = 0;
            column = 0;
            for(int i=1;i<=2;i++){
                streak = 0;
                column = 0;
             while(column<7){
                    if(c4[changedRow][column].get(0) == i){
                        
                        column++;
                        streak++;
                }
                    else{
                            streak = 0;
                            column++;
                        
                    }
                    if(streak == 4){
                        if (i%2 ==0){
            System.out.println("PLAYER "+ANSI_GREEN + "\u25A0" +" "+ANSI_RESET+"HAS WON");
        }
        else{
            System.out.println("PLAYER "+ANSI_RED + "\u25A0" +" "+ANSI_RESET+"HAS WON");
        }
                        play = false;
                        return;
                    }
            }
            }
        
        
            
            //!!!!!!!!!!!!!!!!!
            //!!DIAGONAL DOWN!!
            //!!!!!!!!!!!!!!!!!
            
            
           
             }
}
