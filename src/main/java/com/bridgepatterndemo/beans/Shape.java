package com.bridgepatterndemo.beans;

import com.bridgepatterndemo.imp.DrawAPI;

/**
 * @author Zuber
 */
public abstract class Shape {
   protected DrawAPI drawAPI;

   protected Shape(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }

   public abstract void draw();  
}
