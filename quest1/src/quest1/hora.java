/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;

/**
 *
 * @author jonas
 */
public class hora {
    public static void main(String[] args) {
     Date relogio = new Date();  
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Screen width = " + d.width);
        System.out.println("Screen height = " + d.height);
    }
 
    
}
