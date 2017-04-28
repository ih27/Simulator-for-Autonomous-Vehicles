import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.event.*;


/** 
*  CSCI 6341/ Final Project: Automatic Crossroads Control and Management
*  Author: Ismayil Hasanov, Yubo Tsai, Han Wang
*  Date : Apr 25 2017
*  Description: Vehicles class
*/

class Car implements Comparable {
    public static int LEFT = 2;
    public static int STRAIGHT = 1;
    public static int RIGHT = 0;

    //private AIMC aimc;

    double arrivalTime;
    int direction = -1;
    public Car (double arrivalTime, int direction)
    {
        this.arrivalTime = arrivalTime;
        this.direction = direction;
    }

    public int compareTo(Object obj)
    {
        Event e = (Event) obj;
        if (arrivalTime < e.eventTime) {
            return -1;
        }
        else if (arrivalTime > e.eventTime) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public boolean equals(Object obj)
    {
        return (compareTo(obj) == 0);
    }
}