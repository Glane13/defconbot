import com.sun.javaws.exceptions.ErrorCodeResponseException;

/**
 * The ExceptionHandler wraps all checked standard Java exception and enriches them with a custom error code.
 * You can use this code to retrieve localized error messages.
 */


// TODO this code is yet to be tested!!
public class ExceptionHandler extends Exception{

    private static final long serialVersionUID = 7718828512143293558L;

    private final ErrorCodeResponseException code;

    public ExceptionHandler(ErrorCodeResponseException code) {

        super();
        this.code = code;
    }

    public ExceptionHandler(String message, Throwable cause, ErrorCodeResponseException code) {

        super(message, cause);
        this.code = code;
    }

    public ExceptionHandler(String message, ErrorCodeResponseException code) {

        super(message);
        this.code = code;
    }

    public ExceptionHandler(Throwable cause, ErrorCodeResponseException code) {

        super(cause);
        this.code = code;
    }

    public ErrorCodeResponseException getCode() {

        return this.code;
    }

}