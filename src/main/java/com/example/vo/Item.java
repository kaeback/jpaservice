package com.example.vo;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
@Entity
public class Item {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private int price;
}
