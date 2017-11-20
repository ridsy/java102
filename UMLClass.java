
/*
 * @startuml
 * class Employee {
 * -id
 * +{static} course
 * +get
 * ~put()
 * #set()
 * }
 * 
 * note top of Employee : Employee is a general class
 * 
 * Employee "is-a"<|- Manager
 * Employee o- Address
 * Company -- Employee
 * Person "1" *- "n" Address
 * @enduml
 *
 */
