package defconcustomexceptions;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.UUID;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * The defconcustomexceptions.CheckedDefConExceptions wraps all checked standard Java exception and enriches them with a custom error code.
 * You can use this code to retrieve localized error messages.
 * The below section is for checked exceptions. It requires the usage of
 * try/catch block or have a 'throws' clause on the method declaration
 */

// TODO Send all the exceptions into the log file with unique ID.

public class CheckedDefConExceptions extends Exception{

    private final static Logger logger = LogManager.getLogManager().getLogger(CheckedDefConExceptions.class.getName());
    private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ### ");

    public CheckedDefConExceptions() {
        super();
        JOptionPane.showMessageDialog(null, "","I/O Error", JOptionPane.ERROR_MESSAGE);
    }

    public CheckedDefConExceptions(String msg) {
        super(msg);
        JOptionPane.showMessageDialog(null, msg,"I/O Error", JOptionPane.ERROR_MESSAGE);
    }

    // Write exceptions to the log.
    public void writeError(String error) {

        try {
            String uniqueID = UUID.randomUUID().toString();
            Timestamp tmp = new Timestamp(System.currentTimeMillis());
            String timestamp = sdf.format(tmp);
            File myFile = new File("DefConErrors.log");
            FileWriter logFile = new FileWriter(myFile);
            logFile.write(timestamp + "### " + uniqueID + " ### " + error);
            logFile.close();
        }catch (IOException e) {
            logger.severe( sdf + " ### " + CheckedDefConExceptions.class.getName()+" ERROR: File cannot be opened.");
        }
    }
}