package defconcustomexceptions;

import javax.swing.*;

/**
 * The defconcustomexceptions.DefConExceptions wraps all checked standard Java exception and enriches them with a custom error code.
 * You can use this code to retrieve localized error messages.
 * The below section is for checked exceptions. It requires the usage of
 * try/catch block or have a 'throws' clause on the method declaration
 */

public class DefConExceptions extends Exception{

    public DefConExceptions() {
        super();
        JOptionPane.showMessageDialog(null, "","I/O Error", JOptionPane.ERROR_MESSAGE);
    }

    public DefConExceptions(String msg) {
        super(msg);
        JOptionPane.showMessageDialog(null, msg,"I/O Error", JOptionPane.ERROR_MESSAGE);
    }
}
