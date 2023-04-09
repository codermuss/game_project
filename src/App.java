import java.util.Scanner;

import game_objects.Ball;
import game_objects.Cup;
import game_objects.Hat;
import game_objects.IGameObject;
import game_objects.Pen;
import game_objects.Unidentified;

public class App {
    public static IGameObject[][] gridFunction(String parameter){
        final String orderString=parameter;
        int count=0;
       IGameObject [][] gameObjectList= new IGameObject [3][3];
       for (int i = 0; i < gameObjectList.length; i++) {
        for (int j = 0; j < gameObjectList.length; j++) {
            switch (orderString.charAt(count)) {
                case 'C':
                    gameObjectList[i][j]=new Cup(false);
                    break;
                case 'H':
                    gameObjectList[i][j]= new Hat(false);
                    break;
                case 'P':
                    gameObjectList[i][j]= new Pen(false);
                    break;
                case 'B':
                    gameObjectList[i][j] = new Ball(false);
                    break;
                case 'U':
                    gameObjectList[i][j]= new Unidentified(false);
                    break;
                default:
                    System.out.println("Type missmatch");
                    break;
            }
           
            count++;
        }
        
       }
       return gameObjectList;
    }

    public static void initGrid(IGameObject [][] gameObjectList){
        for (int i = 0; i < gameObjectList.length; i++) {
            for (int j = 0; j < gameObjectList.length; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    public static void playGame(IGameObject [][] gameObjectList){
        Scanner scan= new Scanner(System.in);
        for (int i = 0; i < gameObjectList.length*gameObjectList.length; i++) {
            System.out.print("Please enter row location: ");
            int row=scan.nextInt();
            System.out.print("Please enter col location: ");
            int col= scan.nextInt();
            gameObjectList[row][col].setVisible(true);
            for (int damla = 0; damla < gameObjectList.length; damla++) {
                for (int j = 0; j < gameObjectList.length; j++) {
              if(gameObjectList[damla][j].getVisible()){
                System.out.print(gameObjectList[damla][j].whoAmI()+" ");
              }else{
                    System.out.print("X ");
              }
            }
            System.out.println();
        }
            
        }


       System.out.print("Would you like to cover them again? ");
       scan.nextLine();
       String answer= scan.nextLine();
       if(answer.equals("yes")){
        
        for (int damla = 0; damla < gameObjectList.length; damla++) {
            for (int j = 0; j < gameObjectList.length; j++) {
          gameObjectList[damla][j].setVisible(false);
          if(gameObjectList[damla][j].getVisible()){
            System.out.print(gameObjectList[damla][j].whoAmI()+" ");
          }else{
                System.out.print("X ");
          }
        }
        System.out.println();
    }
       }

       System.out.print("Lets guess! ");
       String rememberText= scan.nextLine();
       int correctAnswerCount=0;
       IGameObject [][] rememberObjects= gridFunction(rememberText);
       for (int damla = 0; damla < gameObjectList.length; damla++) {
        for (int j = 0; j < gameObjectList.length; j++) {
            if(rememberObjects[damla][j].whoAmI().equals(gameObjectList[damla][j].whoAmI()) ){
                correctAnswerCount++;
            }
            }
        
     System.out.println();
}
        if(correctAnswerCount>4){
            System.out.println("Congratulations! You Win!");
        }else{
            System.out.println("You lose! Try Again!");
        }
        scan.close();
      
    }
    
    public static void main(String[] args) throws Exception {
       final String orderString="PPCCBBHHU";
       IGameObject[][] gameObjects= gridFunction(orderString);
       initGrid(gameObjects);
        playGame(gameObjects);

    }
}
