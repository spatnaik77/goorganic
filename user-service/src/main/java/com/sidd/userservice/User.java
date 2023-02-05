package com.sidd.userservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private @Getter @Setter int id;
    private @Getter @Setter String name;
    private @Getter @Setter String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }


}
