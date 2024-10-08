# store-management-project
My project for Unit 2 APCSA.

# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![UML Diagram for my project](nameOfImageFileHere.png)

## Description


My store is a resemblance of Jollibee. I chose this topic because of my fondness towards the franchise and my love for Filipino food. My store made two products, ChickenJoy and Spaghetti. These both acted as subclasses to their superclass, Food. The Food superclass contained the name, price, whether it was takeout or not, and if the order had fries as instance variables. The subclasses contain specific instance variables along with the instance variables from the superclass using the super(); command. My code uses user input through the scanner object. The user chooses between options using number keys like 1, 2, or 3, to select parts and aspects to customize their order. The program expexts inputs varied from 1 to 4.
