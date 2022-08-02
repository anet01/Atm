package com.atm.atmproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;

public class RsServiceResponse<T> extends ErrorResponse {

    private T resultContainer;

    public RsServiceResponse(HttpStatus status) {
        super(status);
    }

    public RsServiceResponse(HttpStatus status, T resultContainer) {
        super(status);
        this.resultContainer = resultContainer;
    }

    public RsServiceResponse(String statusMessage, HttpStatus status) {
        super(status, statusMessage);
    }

    public RsServiceResponse(HttpStatus status, String statusMessage, T resultContainer) {
        super(status, statusMessage);
        this.resultContainer = resultContainer;
    }

    public RsServiceResponse(String warningMessage, HttpStatus status, String statusMessage) {
        super(status, statusMessage, warningMessage);
    }

    public RsServiceResponse(T resultContainer, HttpStatus status, String statusMessage, String warningMessage) {
        super(status, statusMessage, warningMessage);
        this.resultContainer = resultContainer;
    }

    public RsServiceResponse(String errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public RsServiceResponse(String errorCode, String statusMessage, T resultContainer) {
        super(errorCode, statusMessage);
        this.resultContainer = resultContainer;
    }


    public T getResultContainer() {
        return resultContainer;
    }
}
