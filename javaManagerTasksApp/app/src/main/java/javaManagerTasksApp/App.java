/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javaManagerTasksApp;

import view.HomeScreen;

public class App {
    
    static  HomeScreen home = new HomeScreen();
    
    
    /*
    public String getGreeting() {
        return "tela RR";
    }
    */
    
    

    public static void main(String[] args) {
        //System.out.println(new App().getGreeting());
        
        home.setVisible(true);
    }
}
