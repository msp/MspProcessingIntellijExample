package org.cenatus.msp.processing;

import processing.core.*;

/**
 * Created with IntelliJ IDEA.
 * User: msp
 * Date: 30/06/15
 * Time: 19:55
 *
 * Running Processing in Intellij, based upon this tutorial:
 *
 * http://www.klingt.net/posts/processing-2-in-intellij-idea-14/
 *
 * I imported core.jar from here on my system:
 *
 * /Applications/Processing.app/Contents/Java/core/library
 *
 */
public class MspProcessingIntellijExample extends PApplet {

    public void setup() {
        size(400,400);
        background(0);
    }

    public void draw() {
        stroke(255);
        if (mousePressed) {
            line(mouseX,mouseY,pmouseX,pmouseY);
        }
    }
}
