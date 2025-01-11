# LowLevelDesign_JAVA

Practicing Low-Level Design Patterns and Problems in Java.

---

## 1. Implemented Strategy Pattern

The **Strategy Design Pattern** is a behavioral design pattern that allows a class's behavior or algorithm to be selected at runtime. It encapsulates a family of algorithms into separate classes, making them interchangeable without altering the code that uses them. This promotes **flexibility**, **reusability**, and adherence to the **Open/Closed Principle**.


## 2. Implemented Notification Alert System Pattern

## 3. Implemented Pizza Billing System Pattern

## 4. Implementing Parking Lot: 
Requirement Gathering / Clarification:

How many Entrances?
    - 1 Entrance
    - 1 Exit
    - Different type of parking spots:
        - 2 Wheeler
        - 4 Wheeler
    - Payment: Hourly / Minute based charge => Mix
    - Floors => No

Objects:

- Vehicle
    1 Vehicle No.
    2 Vehicle Type (Enum)
- Ticket
    1. Entry Time
    2. Parking Spot
- Entrance Gate
    1. Find Parking Space (Nearest Parking to the entrance)
    2. Update Parking space
    3. Generate Ticket
- Parking Spot
    1. id
    2. isEmpty
    3. Vehicle
    4. Price
    5. Type
- Exit Gate
    1. Cost Calculation
    2. Payment
    3. Update Parking Spot




