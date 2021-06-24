package com.mf.errorandexception.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data@AllArgsConstructor@NoArgsConstructor
public class Test {

//    @NotBlank(message = "不能为空白")
    @NotBlank(message = "{test.name.notblank}")
    private String name;
    @NotNull
    private Integer age;

}
