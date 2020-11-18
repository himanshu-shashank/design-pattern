package com.himanshu.designpattern.behavioral.state;

import com.himanshu.designpattern.behavioral.state.ui.Player;
import com.himanshu.designpattern.behavioral.state.ui.UI;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
