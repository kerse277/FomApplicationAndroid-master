package com.fom.msesoft.fomapplication.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by oguz on 25.07.2016.
 */
@Accessors(chain = true)
public class PersonPublic {

    @Getter
    private Long id;

    @Getter
    @Setter
    private String uniqueId;

    @Getter
    @Setter
    private String email;

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
