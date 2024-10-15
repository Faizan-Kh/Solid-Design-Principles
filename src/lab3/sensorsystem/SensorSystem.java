/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.sensorsystem;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author fa21-bse-011
 */
public class SensorSystem {
    private Vector<AlarmListener> listeners = new Vector<>();

    public void register(AlarmListener alarmListener) {
        listeners.addElement(alarmListener);
    }

    public void soundTheAlarm() {
        for (Enumeration<AlarmListener> e = listeners.elements(); e.hasMoreElements();) {
            e.nextElement().alarm();
        }
    }
}
