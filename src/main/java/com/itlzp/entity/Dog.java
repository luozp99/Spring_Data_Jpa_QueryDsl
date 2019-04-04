package com.itlzp.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @Created by 罗忠鹏
 * @Date 2019/4/4 11:25
 * @Description TODO
 */
@Entity
@Table(name = "dog")
@Data
public class Dog {

    @Id
    private int id;
    private String dogName;

    @JoinColumn(name="userid")
    @ManyToOne(fetch=FetchType.LAZY)
    private User user;
}
