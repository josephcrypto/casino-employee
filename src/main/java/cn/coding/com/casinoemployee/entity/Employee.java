package cn.coding.com.casinoemployee.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    @Column(length = 45, nullable = false)
    private String name;

    @NotEmpty
    @Column(length = 45, nullable = false)
    private String position;

    @NotEmpty
    @Column(unique = true,length = 45)
    private String cardno;

    @Column(length = 45)
    private String department;

    private byte gender;

    private String mobile;

    private String facebook;

    private String salary;

    private String address;

    private Date joinDate;

    private byte enabled;
}
