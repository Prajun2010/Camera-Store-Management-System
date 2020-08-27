/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infotech;

/**
 *
 * @author Prajun
 */
public class Splash { // splash code 
    public static void main(String[] args){
       SplashScreen loader=new SplashScreen();
       loader.setVisible(true);//calls splash gui
       UserMode view=new UserMode(); // calling usermode class
       try{
            for(int i=0;i<=100;i++){
                Thread.sleep(30);
                loader.splashProgress.setValue(i); // setting value for the bard display
                if(i==100){
                    loader.setVisible(false);
                    view.setVisible(true);
            }
        }
       }catch(Exception ex){
           // error handle
       }
    }
}

