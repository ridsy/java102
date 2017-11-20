package com.sapient;

/**
 * @startuml
 * class Person{
 * -name:String
 * -age:int
 * +hashcode():int
 * +toString():String
 * +compareTo(Person):int
 * }
 * 
 * class Student{
 * -rollNumber:int
 * +getrollNumber():int
 * +setrollNumber(rollno):void
 * }
 * Person "is-a" <|- Student
 * 
 * class Lecturer{
 * -salary:double
 * +getsalary():double
 * +setsalary(salary):void
 * }
 * Person "is-a" <|- Lecturer
 * 
 * class Department{
 * -deptId:int
 * -deptName:String
 * +getdeptid():int
 * +setdeptid(id):void
 * +getdeptName():String
 * +setdeptName(name):void
 * }
 * 
 * Student "n" o- "1" Department
 * Lecturer "n" o- "1" Department
 * Student "n" -- "n" Lecturer
 * 
 * @enduml
 *
 */

