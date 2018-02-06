/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audioviz;

import javafx.event.ActionEvent;

/**
 *
 * @author Jordan
 */
@FunctionalInterface
public interface Changer {
    public void handleChange(ActionEvent event);   
}
