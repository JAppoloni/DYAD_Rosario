/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfase;

import java.util.Observable;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class observer extends Observable{

    public observer() {
    }
    public void notificar(){
        setChanged();
        super.notifyObservers();
    }

}
