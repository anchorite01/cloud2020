package com.nacrt.sc.common.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CommonResult
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public static <T> CommonResult<T> success(Integer code, String message) {
        return new CommonResult<>(code, message, null);
    }
}
