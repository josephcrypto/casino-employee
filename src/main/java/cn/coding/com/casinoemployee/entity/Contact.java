package cn.coding.com.casinoemployee.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty
    private String yourName;

    @NotEmpty
    private String email;

    @NotEmpty
    private String subject;

    @NotEmpty
    private String message;
}
