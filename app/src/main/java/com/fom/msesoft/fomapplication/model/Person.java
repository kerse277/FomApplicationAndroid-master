package com.fom.msesoft.fomapplication.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


/**
 * Created by oguz on 18.06.2016.
 */

@Accessors(chain = true)
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    private Long id;

    @Getter
    @Setter
    private String uniqueId;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String password;

    @Setter
    @Getter
    private String firstName;

    @Setter
    @Getter
    private String lastName;

    @Getter
    @Setter
    private char gender;

    @Setter
    @Getter
    private String hoby;

    @Setter
    @Getter
    private String photo;



}
