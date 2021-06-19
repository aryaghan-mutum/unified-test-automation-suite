package com.commonutils.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AutomationException extends RuntimeException {

    public AutomationException(String message) {
        super(message);
    }

    public AutomationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AutomationException(Throwable cause) {
        super(cause);
    }

    public AutomationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
