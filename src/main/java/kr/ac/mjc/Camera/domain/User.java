package kr.ac.mjc.Camera.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id", updatable = false)
    private Long id;
    @Column( name = "userId", nullable = false)
    private String userId;
    @Column( name = "name", nullable = false)
    private String name;
    @Column( name = "password", nullable = false)
    private String password;
    @Column( name = "email", nullable = false)
    private String email;

    public User(String userId, String name, String password, String email) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
