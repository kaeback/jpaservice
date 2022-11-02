package com.example.vo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_group")
public class Group {

    @Id @GeneratedValue
    @Column(name = "group_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "group")
    List<Member> members = new ArrayList<Member>();

}
