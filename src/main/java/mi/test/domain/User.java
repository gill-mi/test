package mi.test.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "user")
public class User {

    @Id @Column @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String password;
}
