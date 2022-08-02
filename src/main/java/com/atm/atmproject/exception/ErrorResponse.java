package com.atm.atmproject.exception;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Getter
@Setter
public class ErrorResponse {


    private int status;

    private String statusMessage;

    private String requestIdentifier;

    private String errorCode;

    private String errorMessage;

    private String warningMessage;

    /**
     * Standart saglayici olusturucu
     *
     * @param status HTTP durumu
     */
    public ErrorResponse(HttpStatus status) {
        this(status, status.getReasonPhrase(), null, null, null);
    }

    /**
     * Standart saglayici olusturucu
     *
     * @param status HTTP durumu
     * @param statusMessage Durum mesaji
     */
    public ErrorResponse(HttpStatus status, String statusMessage) {
        this(status, statusMessage, null, null, null);
    }

    /**
     * Standart saglayici olusturucu
     *
     * @param status HTTP durumu
     * @param statusMessage Durum mesaji
     */
    public ErrorResponse(HttpStatus status, String statusMessage, String warningMessage) {
        this(status, statusMessage, null, null, warningMessage);
    }

    /**
     * Standart saglayici olusturucu
     *
     * @param errorCode Hata kodu
     * @param errorMessage Hata mesaji
     */
    public ErrorResponse(String errorCode, String errorMessage) {
        this(HttpStatus.OK, HttpStatus.OK.getReasonPhrase(), errorCode, errorMessage, null);
    }

    /**
     * Standart saglayici olusturucu
     *
     * @param status HTTP durumu
     * @param statusMessage Durum mesaji
     * @param errorCode Hata kodu
     * @param errorMessage Hata mesaji
     */
    private ErrorResponse(HttpStatus status, String statusMessage, String errorCode,
                        String errorMessage, String warningMessage) {

        this.status = status.value();
        this.statusMessage = statusMessage;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.warningMessage = warningMessage;
    }


}
