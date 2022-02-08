/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;
import javax.swing.BorderFactory;
import java.awt.Color;
//import graphics.Game;

/**
 *
 * @author stude
 */
public class Oznaceni {
    public static  int oznaceniOtocenaKarta = 0;
    public static  int oznaceni_Sloupec1 = 0;
    public static  int oznaceni_Sloupec2 = 0;
    public static  int oznaceni_Sloupec3 = 0;
    public static  int oznaceni_Sloupec4 = 0;
    public static  int oznaceni_Sloupec5 = 0;
    public static  int oznaceni_Sloupec6 = 0;
    public static  int oznaceni_Sloupec7 = 0;
    
    public Oznaceni(){
        
    }
    
    public void zruseni_oznaceni_single() {
        if(oznaceniOtocenaKarta == 1) {
            oznaceniOtocenaKarta = 0;
            Game.OtocenaKarta.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
        }
        else if(oznaceni_Sloupec1 == 1) {
            oznaceni_Sloupec1 = 0;
            Game.Sloupec1x1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec1x2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec1x3.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec1x4.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec1x5.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec1x6.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec1x7.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
        }
        else if(oznaceni_Sloupec2 == 1) {
            oznaceni_Sloupec2 = 0;
            Game.Sloupec2x1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec2x2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec2x3.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec2x4.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec2x5.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec2x6.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec2x7.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
        }
        else if(oznaceni_Sloupec3 == 1) {
            oznaceni_Sloupec3 = 0;
            Game.Sloupec3x1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec3x2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec3x3.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec3x4.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec3x5.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec3x6.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec3x7.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
        }
        else if(oznaceni_Sloupec4 == 1) {
            oznaceni_Sloupec4 = 0;
            Game.Sloupec4x1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec4x2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec4x3.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec4x4.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec4x5.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec4x6.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec4x7.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
        }
        else if(oznaceni_Sloupec5 == 1) {
            oznaceni_Sloupec5 = 0;
            Game.Sloupec5x1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec5x2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec5x3.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec5x4.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec5x5.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec5x6.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec5x7.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
        }
        else if(oznaceni_Sloupec6 == 1) {
            oznaceni_Sloupec6 = 0;
            Game.Sloupec6x1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec6x2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec6x3.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec6x4.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec6x5.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec6x6.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec6x7.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
        }
        else if(oznaceni_Sloupec7 == 1) {
            oznaceni_Sloupec7 = 0;
            Game.Sloupec7x1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec7x2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec7x3.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec7x4.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec7x5.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec7x6.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
            Game.Sloupec7x7.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.yellow));
        }
    }
    public void OtocenaKarta() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceniOtocenaKarta = 1;
            Game.OtocenaKarta.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }
    }
    public void oznaceni_stack() {
        
    }
    public void oznaceni_Sloupec1x1() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec1 = 1;
            Game.Sloupec1x1.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec1x2() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec1 = 1;
            Game.Sloupec1x2.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec1x3() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec1 = 1;
            Game.Sloupec1x3.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec1x4() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec1 = 1;
            Game.Sloupec1x4.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec1x5() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec1 = 1;
            Game.Sloupec1x5.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec1x6() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec1 = 1;
            Game.Sloupec1x6.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec1x7() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec1 = 1;
            Game.Sloupec1x7.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }    
    public void oznaceni_Sloupec1x8() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec1 = 1;
            Game.Sloupec1x8.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec1x9() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec1 = 1;
            Game.Sloupec1x9.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec1x10() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec1 = 1;
            Game.Sloupec1x10.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec1x11() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec1 = 1;
            Game.Sloupec1x11.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec1x12() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec1 = 1;
            Game.Sloupec1x12.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec1x13() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec1 = 1;
            Game.Sloupec1x13.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }

    public void oznaceni_Sloupec2x1() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec2 = 1;
            Game.Sloupec2x1.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec2x2() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec2 = 1;
            Game.Sloupec2x2.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec2x3() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec2 = 1;
            Game.Sloupec2x3.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec2x4() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec2 = 1;
            Game.Sloupec2x4.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec2x5() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec2 = 1;
            Game.Sloupec2x5.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec2x6() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec2 = 1;
            Game.Sloupec2x6.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec2x7() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec2 = 1;
            Game.Sloupec2x7.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }    
    public void oznaceni_Sloupec2x8() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec2 = 1;
            Game.Sloupec2x8.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec2x9() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec2 = 1;
            Game.Sloupec2x9.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec2x10() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec2 = 1;
            Game.Sloupec2x10.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec2x11() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec2 = 1;
            Game.Sloupec2x11.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec2x12() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec2 = 1;
            Game.Sloupec2x12.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec2x13() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec2 = 1;
            Game.Sloupec2x13.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }

    public void oznaceni_Sloupec3x1() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec3 = 1;
            Game.Sloupec3x1.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec3x2() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec3 = 1;
            Game.Sloupec3x2.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec3x3() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec3 = 1;
            Game.Sloupec3x3.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec3x4() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec3 = 1;
            Game.Sloupec3x4.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec3x5() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec3 = 1;
            Game.Sloupec3x5.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec3x6() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec3 = 1;
            Game.Sloupec3x6.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec3x7() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec3 = 1;
            Game.Sloupec3x7.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }    
    public void oznaceni_Sloupec3x8() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec3 = 1;
            Game.Sloupec3x8.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec3x9() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec3 = 1;
            Game.Sloupec3x9.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec3x10() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec3 = 1;
            Game.Sloupec3x10.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec3x11() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec3 = 1;
            Game.Sloupec3x11.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec3x12() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec3 = 1;
            Game.Sloupec3x12.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec3x13() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec3 = 1;
            Game.Sloupec3x13.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }

    public void oznaceni_Sloupec4x1() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec4 = 1;
            Game.Sloupec4x1.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec4x2() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec4 = 1;
            Game.Sloupec4x2.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec4x3() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec4 = 1;
            Game.Sloupec4x3.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec4x4() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec4 = 1;
            Game.Sloupec4x4.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec4x5() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec4 = 1;
            Game.Sloupec4x5.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec4x6() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec4 = 1;
            Game.Sloupec4x6.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec4x7() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec4 = 1;
            Game.Sloupec4x7.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }    
    public void oznaceni_Sloupec4x8() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec4 = 1;
            Game.Sloupec4x8.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec4x9() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec4 = 1;
            Game.Sloupec4x9.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec4x10() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec4 = 1;
            Game.Sloupec4x10.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec4x11() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec4 = 1;
            Game.Sloupec4x11.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec4x12() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec4 = 1;
            Game.Sloupec4x12.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec4x13() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec4 = 1;
            Game.Sloupec4x13.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }

    public void oznaceni_Sloupec5x1() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec5 = 1;
            Game.Sloupec5x1.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec5x2() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec5 = 1;
            Game.Sloupec5x2.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec5x3() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec5 = 1;
            Game.Sloupec5x3.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec5x4() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec5 = 1;
            Game.Sloupec5x4.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec5x5() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec5 = 1;
            Game.Sloupec5x5.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec5x6() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec5 = 1;
            Game.Sloupec5x6.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec5x7() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec5 = 1;
            Game.Sloupec5x7.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }    
    public void oznaceni_Sloupec5x8() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec5 = 1;
            Game.Sloupec5x8.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec5x9() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec5 = 1;
            Game.Sloupec5x9.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec5x10() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec5 = 1;
            Game.Sloupec5x10.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec5x11() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec5 = 1;
            Game.Sloupec5x11.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec5x12() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec5 = 1;
            Game.Sloupec5x12.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec5x13() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec5 = 1;
            Game.Sloupec5x13.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }

    public void oznaceni_Sloupec6x1() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec6 = 1;
            Game.Sloupec6x1.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec6x2() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec6 = 1;
            Game.Sloupec6x2.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec6x3() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec6 = 1;
            Game.Sloupec6x3.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec6x4() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec6 = 1;
            Game.Sloupec6x4.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec6x5() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec6 = 1;
            Game.Sloupec6x5.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec6x6() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec6 = 1;
            Game.Sloupec6x6.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec6x7() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec6 = 1;
            Game.Sloupec6x7.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }    
    public void oznaceni_Sloupec6x8() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec6 = 1;
            Game.Sloupec6x8.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec6x9() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec6 = 1;
            Game.Sloupec6x9.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec6x10() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec6 = 1;
            Game.Sloupec6x10.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec6x11() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec6 = 1;
            Game.Sloupec6x11.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec6x12() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec6 = 1;
            Game.Sloupec6x12.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec6x13() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec6 = 1;
            Game.Sloupec6x13.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }

    public void oznaceni_Sloupec7x1() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec7 = 1;
            Game.Sloupec7x1.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec7x2() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec7 = 1;
            Game.Sloupec7x2.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec7x3() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec7 = 1;
            Game.Sloupec7x3.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec7x4() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec7 = 1;
            Game.Sloupec7x4.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec7x5() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec7 = 1;
            Game.Sloupec7x5.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec7x6() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec7 = 1;
            Game.Sloupec7x6.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec7x7() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec7 = 1;
            Game.Sloupec7x7.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }    
    public void oznaceni_Sloupec7x8() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec7 = 1;
            Game.Sloupec7x8.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec7x9() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec7 = 1;
            Game.Sloupec7x9.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec7x10() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec7 = 1;
            Game.Sloupec7x10.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec7x11() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec7 = 1;
            Game.Sloupec7x11.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec7x12() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec7 = 1;
            Game.Sloupec7x12.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }
    public void oznaceni_Sloupec7x13() {
        if(oznaceniOtocenaKarta == 0 && oznaceni_Sloupec1 == 0 && oznaceni_Sloupec2 == 0 && oznaceni_Sloupec3 == 0 && oznaceni_Sloupec4 == 0 && oznaceni_Sloupec5 == 0 && oznaceni_Sloupec6 == 0 && oznaceni_Sloupec7 == 0) {
            oznaceni_Sloupec7 = 1;
            Game.Sloupec7x13.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow));
        }      
    }   
}
