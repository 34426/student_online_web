package com.study.common;

import java.util.List;
import java.util.Map;

public class Result {

    private static final int FAILRE_CODE = 504;
    private static final int SUCCESS_CODE = 200;
    private static final int OTHER_CODE = 250;

    private Object resultData;
    private int code;

    public static Result success(Object data){
        return new Result(data,SUCCESS_CODE);
    }
    public static Result failure(Object data){
        return new Result(data,FAILRE_CODE);
    }

    public static Result successCode(){
        return new Result(SUCCESS_CODE);
    }
    public static Result failureCode(){
        return new Result(FAILRE_CODE);
    }


    public Result(Object resultData, int code) {
        this.resultData = resultData;
        this.code = code;
    }

    public Result(int code) {
        this.code = code;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
