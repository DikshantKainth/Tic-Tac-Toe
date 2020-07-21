//Tic Tak Toe Game

import java.io.*;
import java.util.Scanner;


class Tic {
    public static void display(char arr[][]){  //Function used to display the game board after each turn.                      
        for(int i=0;i<3;i++){
		    for(int j=0;j<3;j++){
		        if(j==1){
		            System.out.print("|"+arr[i][j]+"|");
		        }
		        else{
		            System.out.print(arr[i][j]);
		        }
		    }
		    if(i==2){
		        System.out.println();
		    }
		    else{
		        System.out.println();
		        System.out.println("-----");
		    }
		}
		System.out.println("\n \n");
    }
	public static void main (String[] args) {
		char arr[][]={{'a','a','a'},
		             {'a','a','a'},
                     {'a','a','a'}}; //Initialized a 2D array with random element.
        int index1,index2;
        Scanner sc=new Scanner(System.in); //Created object for scanner class.
        System.out.print("Player1 you are using X.\n");
        System.out.print("Player2 you are using O.\n");
        for(int i=0;i<9;i++){
            if(i%2==0){   //Condition used for turn of player1.
                System.out.print("Player1 enter the value of indexes\n");
                index1=sc.nextInt();
                index2=sc.nextInt();
                arr[index1][index2]='X';
                if((arr[0][0]=='X' && arr[0][1]=='X' && arr[0][2]=='X')
                ||(arr[1][0]=='X' && arr[1][1]=='X' && arr[1][2]=='X')
                ||(arr[2][0]=='X' && arr[2][1]=='X' && arr[2][2]=='X')
                ||(arr[0][0]=='X' && arr[1][0]=='X' && arr[2][0]=='X')
                ||(arr[0][1]=='X' && arr[1][1]=='X' && arr[2][1]=='X')
                ||(arr[0][2]=='X' && arr[1][2]=='X' && arr[2][2]=='X')
                ||(arr[0][0]=='X' && arr[1][1]=='X' && arr[2][2]=='X')
                ||(arr[0][2]=='X' && arr[1][1]=='X' && arr[2][0]=='X')){
                    display(arr);
                    System.out.println("Player1 wins");
                    break;
                }
                else{
                    if(i==8){
                        display(arr);
                        System.out.println("No winner game draw.");
                    }
                    else{
                        display(arr);
                        System.out.println("No winner yet.");
                    }
                }
            }
            else{
                System.out.print("Player2 enter the value of indexes\n");
                index1=sc.nextInt();
                index2=sc.nextInt();
                arr[index1][index2]='O';
                 if((arr[0][0]=='O' && arr[0][1]=='O' && arr[0][2]=='O')
                ||(arr[1][0]=='O' && arr[1][1]=='O' && arr[1][2]=='O')
                ||(arr[2][0]=='O' && arr[2][1]=='O' && arr[2][2]=='O')
                ||(arr[0][0]=='O' && arr[1][0]=='O' && arr[2][0]=='O')
                ||(arr[0][1]=='O' && arr[1][1]=='O' && arr[2][1]=='O')
                ||(arr[0][2]=='O' && arr[1][2]=='O' && arr[2][2]=='O')
                ||(arr[0][0]=='O' && arr[1][1]=='O' && arr[2][2]=='O')
                ||(arr[0][2]=='O' && arr[1][1]=='O' && arr[2][0]=='O')){
                    display(arr);
                    System.out.println("Player2 wins");
                    break;
                }
                else{
                    display(arr);
                    System.out.println("No winner yet");
                }
            }
        }
	}
}