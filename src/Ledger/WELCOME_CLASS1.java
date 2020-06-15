/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ledger;

import Ledger.Login_Window;

/**
 *
 * @author shari
 */
public class WELCOME_CLASS1 {

   public static void main(String args[]){
        WELCOME screen = new WELCOME();
        Login_Window login = new Login_Window();
        screen.setVisible(true);
                        try{
                for(int i=0;i<101;i++){
                    Thread.sleep(40);
                    
                    screen.loadingbar.setValue(i);
                    screen.loadingnum.setText(Integer.toString(i)+"%");
                    
                    if(i==100)
                    {
                         
                         screen.setVisible(false);
                         login.setVisible(true);
                    }
                }
                }
                catch(Exception e){}
        
    }
    
}
