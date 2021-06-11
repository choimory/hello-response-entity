package com.practice.helloresponseentity.employee.entity;

import com.practice.helloresponseentity.common.code.GenderCode;
import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    @Column
    private String name;
    @Enumerated
    private GenderCode gender;
    @Column
    private Integer age;
    @Column
    private String address;
}
