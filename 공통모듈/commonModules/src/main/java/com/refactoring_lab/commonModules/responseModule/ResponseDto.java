package com.refactoring_lab.commonModules.responseModule;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
@Setter
public class ResponseDto {
    private HttpStatus status;
    private String msg;
}
