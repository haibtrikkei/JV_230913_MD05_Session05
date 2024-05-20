package com.ra.validate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponseValidate<T>{
    private  Integer httpStatus;
    private String httpStatusName;
    private T content;
}
