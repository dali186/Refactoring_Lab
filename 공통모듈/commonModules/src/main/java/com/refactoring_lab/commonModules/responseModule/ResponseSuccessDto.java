package com.refactoring_lab.commonModules.responseModule;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ResponseSuccessDto<T> extends ResponseDto{
    private T data;
    public ResponseSuccessDto(T data) {
        super(HttpStatus.OK, ResponseMessages.API_SUCCESS_MSG_DEFAULT);
        this.data = data;
    }

    public ResponseSuccessDto(T data, String msg) {
        super(HttpStatus.OK, msg);
        this.data = data;
    }

    /* 응답 메세지 존재 X - 기본 응답 메세지*/
    public static <T>ResponseSuccessDto<T> response(T data) {
        return new ResponseSuccessDto<>(data);
    }

    /* 응답 메세지 존재 */
    public static <T>ResponseSuccessDto<T> response(T data, String msg) {
        return new ResponseSuccessDto<>(data, msg);
    }
}
