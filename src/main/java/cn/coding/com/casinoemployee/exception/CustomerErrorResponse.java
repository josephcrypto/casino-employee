package cn.coding.com.casinoemployee.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerErrorResponse {

    private int status;
    private String message;
    private long timeStamp;

    public CustomerErrorResponse() {
        super();
    }

    public CustomerErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }
}
