package defconcustomexceptions;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;

/**
 * The defconcustomexceptions.CheckedDefConExceptions wraps all checked standard Java exception and enriches them with a custom error code.
 * You can use this code to retrieve localized error messages.
 * The below section is for checked exceptions. It requires the usage of
 * try/catch block or have a 'throws' clause on the method declaration
 */

// TODO Send all the exceptions into the log file with unique ID.

public class CheckedDefConExceptions extends Exception{

    public CheckedDefConExceptions() {
        super();
        JOptionPane.showMessageDialog(null, "","I/O Error", JOptionPane.ERROR_MESSAGE);
    }

    public CheckedDefConExceptions(String msg) {
        super(msg);
        JOptionPane.showMessageDialog(null, msg,"I/O Error", JOptionPane.ERROR_MESSAGE);
    }
}