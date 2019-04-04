package com.itlzp.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * @Created by 罗忠鹏
 * @Date 2019/4/4 11:08
 * @Description TODO
 */
@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    private int id;
    private String userName;
    private int age;
    private String email;

}
