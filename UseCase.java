package com.sapient;

/**
 * @startuml
 * left to right direction
 * skinparam packageStyle rectangle
 * actor Customer
 * actor Admin
 * rectangle OnlineShoppingCart {
 * Customer -- (Select an Item)
 * Customer -- (Add to Cart)
 * Customer -- (Submit Cart)
 * Customer -- (Register)
 * Customer -- (Login)
 * (Submit Cart) "extends" <|- (PayBill)
 * (Logout) -- Admin
 * (Add Segment) -- Admin
 * (Add Brand) -- Admin
 * (Add Product) -- Admin
 * }
 * note right of (Register): Registeration is done here
 * @enduml
 *
 */
public class UseCase {

}
