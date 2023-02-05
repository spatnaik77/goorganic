package com.sidd.apiservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class User {

    private @Getter @Setter int id;
    private @Getter @Setter String name;
    private @Getter @Setter String age;

    /*public User(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }*/
}
