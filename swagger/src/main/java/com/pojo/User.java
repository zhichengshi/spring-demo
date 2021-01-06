package com.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = -2731598327208972274L;

    Long id;
    String name;
    Integer age;
}
