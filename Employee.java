package com.ems.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//lombok is used to reduce boilerplate code and save time for model/data objects use to data annotation
//it can generate getters and setters method
//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
private long empId;
private String empName;
private double empSal; // monthly take home
// entity reference(aggregation)
Address address; // Has-A relationship

}

