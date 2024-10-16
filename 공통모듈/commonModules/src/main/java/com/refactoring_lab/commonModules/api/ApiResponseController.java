package com.refactoring_lab.commonModules.api;

import com.refactoring_lab.commonModules.responseModule.ResponseMessages;
import com.refactoring_lab.commonModules.responseModule.ResponseSuccessDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiResponseController {

    @RequestMapping("/suc")
    public ResponseSuccessDto<String> apiSuccessResponse() {

        return ResponseSuccessDto.response("성공했나요");
    }


    @RequestMapping("/customSuc")
    public ResponseSuccessDto<String> apiCustomSuccessResponse() {

        return ResponseSuccessDto.response("성공했나요", ResponseMessages.API_SUCCESS_MSG_CUSTOM01);
    }
}
