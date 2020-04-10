package com.mufeng.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description: 统一异常处理
 * @author: mufeng
 * @create: 2020/4/8 11:07
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    public GlobalExceptionHandler(){}
    @ExceptionHandler({MyException.class})
    public ResponseEntity<ResErr> handleMyException(MyException ex){
        ResErr resErr=new ResErr();
        resErr.setErrCode(12344);
        resErr.setErrMsg(ex.getMessage());
        return new ResponseEntity<>(resErr, HttpStatus.OK);
    }
    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<ResErr> handleMyException(RuntimeException ex){
        ResErr resErr=new ResErr();
        resErr.setErrCode(99999);
        resErr.setErrMsg("运行时异常");
        return new ResponseEntity<>(resErr, HttpStatus.OK);
    }
    @ExceptionHandler({Exception.class})
    public ResponseEntity<ResErr> handleMyException(Exception ex){
        ResErr resErr=new ResErr();
        resErr.setErrCode(99999);
        resErr.setErrMsg("系统异常");
        return new ResponseEntity<>(resErr, HttpStatus.OK);
    }
}
