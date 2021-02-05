package com.example.HelloSpring.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Table(name="users")
@Entity
public class User {
    @Id
    private Integer user_id;
    private String username;
    private String passwd;
}
