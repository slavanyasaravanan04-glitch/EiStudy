# EiStudy 

A comprehensive Java application demonstrating software design patterns and a virtual classroom management system.


# Exercise 1 - Design Patterns

# Behavioural Patterns

**1. Observer Pattern**

**Purpose:** Implements publisher-subscriber mechanism for state change notifications.

**Key Classes:**

Observer.java - Interface for objects receiving updates.

Subject.java - Interface for objects being observed.

NewsAgency.java - Concrete subject that maintains news and notifies subscribers.

NewsSubscriber.java - Concrete observer that receives news updates.

**Demo:** Interactive demo with news agency subscription system.

<img width="662" height="287" alt="Screenshot 2025-10-01 222733" src="https://github.com/user-attachments/assets/7bf55763-6648-4c4f-8240-cc971d4528d9" />
<img width="665" height="202" alt="Screenshot 2025-10-01 222757" src="https://github.com/user-attachments/assets/3ba3b341-02cb-45f4-82fa-416391e518bb" />
<img width="659" height="172" alt="Screenshot 2025-10-01 222827" src="https://github.com/user-attachments/assets/defba4f8-7ca1-446c-bf71-db7128f14f4f" />

**Error Cases**
<img width="662" height="172" alt="Screenshot 2025-10-01 223034" src="https://github.com/user-attachments/assets/0d7faa66-84ac-4b38-a3ba-4eeaf4ae1e9b" />


**2. Strategy Pattern**

**Purpose:** Encapsulates interchangeable algorithms for mathematical operations.

**Key Classes:**

Strategy.java - Interface defining the algorithm contract.

Calculator.java - Context class that uses different strategies.

AddStrategy.java - Concrete strategy for addition operation.

SubtractStrategy.java - Concrete strategy for subtraction operation.

MultiplyStrategy.java - Concrete strategy for multiplication operation.

DivideStrategy.java - Concrete strategy for division operation with zero-division protection.

**Demo:** - Interactive calculator demo with dynamic strategy switching.

<img width="670" height="364" alt="Screenshot 2025-10-01 223828" src="https://github.com/user-attachments/assets/6c256731-f822-4764-bd54-3765ad752cc7" />
<img width="785" height="282" alt="Screenshot 2025-10-01 223902" src="https://github.com/user-attachments/assets/e4806683-e917-4f32-a6ab-ccee9986b4b0" />
<img width="710" height="286" alt="Screenshot 2025-10-01 223919" src="https://github.com/user-attachments/assets/a6647a13-8445-43b7-be86-81b0ed851044" />
<img width="733" height="290" alt="Screenshot 2025-10-01 223944" src="https://github.com/user-attachments/assets/39016e1a-40a2-48c5-9bd8-ab044a124d20" />
<img width="810" height="281" alt="Screenshot 2025-10-01 224059" src="https://github.com/user-attachments/assets/380d8c6c-2b59-4da4-97d7-2b39d5c198ec" />


**Error Cases**
<img width="751" height="289" alt="Screenshot 2025-10-01 224003" src="https://github.com/user-attachments/assets/2362883e-7545-4894-afce-cdb15424dcd3" />



# Creational Patterns

**Purpose:** Constructs complex Computer objects step by step with flexible configuration.

**Key Classes:**

Computer.java - Product class with static inner ComputerBuilder.

ComputerBuilder.java - Static inner builder class with fluent interface.

**BuilderDemo:** - Interactive computer configuration demo.

<img width="701" height="667" alt="Screenshot 2025-10-01 231839" src="https://github.com/user-attachments/assets/5724f18d-d2b8-4700-a2d5-90d21a72a3d9" />

**Error Cases**
<img width="656" height="332" alt="Screenshot 2025-10-01 234458" src="https://github.com/user-attachments/assets/6b2d67e9-b181-4c2b-b20d-9d73a5b33fab" />


**2. Factory Pattern**

**Purpose:** Centralizes object creation logic for different shape types.

**Key Classes:**

Shape.java - Common interface for all shapes.

Circle.java - Concrete circle implementation with radius.

Rectangle.java - Concrete rectangle implementation with width and height.

Square.java - Concrete square implementation with side length.

ShapeFactory.java - Factory class creating shape objects based on type.

**Demo:** - Interactive shape creation and area calculation demo.

<img width="672" height="344" alt="Screenshot 2025-10-01 224306" src="https://github.com/user-attachments/assets/7d1098b8-12ea-404e-b81b-a747ddb0e8e8" />
<img width="733" height="286" alt="Screenshot 2025-10-01 224317" src="https://github.com/user-attachments/assets/d3731c56-b15e-451a-8491-14dc767c160c" />
<img width="684" height="262" alt="Screenshot 2025-10-01 224325" src="https://github.com/user-attachments/assets/75237c4b-f34e-4a0c-832b-95aa47cf0ffe" />
<img width="717" height="262" alt="Screenshot 2025-10-01 224337" src="https://github.com/user-attachments/assets/3b9f1348-de0c-4ec2-a07a-456cbdc3df0c" />


**Error Cases**
<img width="634" height="196" alt="Screenshot 2025-10-02 023004" src="https://github.com/user-attachments/assets/9e48c2aa-50af-4e6e-94f6-0b4e90f2dbf9" />



# Structural Patterns

**1. Adapter Pattern**

**Purpose:** Bridges incompatible interfaces between basic and advanced media players.

**Key Classes:**

MediaPlayer.java - Target interface for basic media playback.

AudioPlayer.java - Default implementation supporting MP3 format directly.

AdvancedMediaPlayer.java - Interface for advanced media formats.

VlcPlayer.java - Concrete advanced player for VLC format.

Mp4Player.java - Concrete advanced player for MP4 format.

MediaAdapter.java - Adapter that bridges MediaPlayer and AdvancedMediaPlayer.

**Demo:** - Interactive universal media player demo.

<img width="670" height="314" alt="Screenshot 2025-10-01 224520" src="https://github.com/user-attachments/assets/a606df27-7f19-4862-8065-9c5dc264e838" />
<img width="702" height="238" alt="Screenshot 2025-10-01 224530" src="https://github.com/user-attachments/assets/f5351c91-26b8-406f-b6d3-299528061a42" />
<img width="700" height="228" alt="Screenshot 2025-10-01 224539" src="https://github.com/user-attachments/assets/60c19230-541b-4b90-8e2a-524819b62d63" />
<img width="624" height="248" alt="Screenshot 2025-10-02 023519" src="https://github.com/user-attachments/assets/b3b90240-6625-49f8-9400-5e7ebaf093dc" />

**Error Cases**
<img width="803" height="208" alt="Screenshot 2025-10-01 224548" src="https://github.com/user-attachments/assets/69d71f2d-19a3-4924-8900-01e35bb0cbda" />


**2. Decorator Pattern**

**Purpose:** Adds functionality to coffee objects dynamically at runtime.

**Key Classes:**

Coffee.java - Base interface for all coffee types.

SimpleCoffee.java - Concrete base coffee implementation.

CoffeeDecorator.java - Abstract decorator class maintaining coffee reference.

MilkDecorator.java - Concrete decorator adding milk functionality.

SugarDecorator.java - Concrete decorator adding sugar functionality.

WhippedCreamDecorator.java - Concrete decorator adding whipped cream.

**Demo:** - Interactive coffee shop ordering system.

<img width="670" height="450" alt="Screenshot 2025-10-01 224827" src="https://github.com/user-attachments/assets/fb6668b9-b8f0-4fda-bc59-b2abe4ff7caf" />
<img width="669" height="315" alt="Screenshot 2025-10-01 224839" src="https://github.com/user-attachments/assets/7b32530f-2825-41ec-80b4-f910aacba04e" />
<img width="822" height="315" alt="Screenshot 2025-10-01 224852" src="https://github.com/user-attachments/assets/fbee0bd2-5a73-4263-8fb3-4ef6335f30b1" />
<img width="839" height="360" alt="Screenshot 2025-10-01 224917" src="https://github.com/user-attachments/assets/f84a2e24-12d4-4a77-a0bd-a605ca434c5a" />
<img width="672" height="307" alt="Screenshot 2025-10-01 224956" src="https://github.com/user-attachments/assets/5461cd48-77bc-46a0-856b-de777d02aa26" />
<img width="790" height="310" alt="Screenshot 2025-10-01 225022" src="https://github.com/user-attachments/assets/c0f4e5d8-e8ca-4232-bbe8-a7091e5aac43" />


**Error Cases**
<img width="588" height="255" alt="Screenshot 2025-10-02 023257" src="https://github.com/user-attachments/assets/5ba5e9a1-52a0-4c50-a3da-30b2d5b04d9a" />


# How to Run

# Running Demos

java behavioural.observer.Demo

java behavioural.strategy.Demo

java creational.builder.BuilderDemo

java creational.factory.Demo

java structural.adapter.Demo

java structural.decorator.Demo



# Exercise 2 - Virtual Classroom Manager


# Overview

Console-based classroom management system with automatic notifications and assignment tracking.

# Features

Create and manage multiple classrooms.

Enroll students in classrooms.

Schedule assignments with due dates.

Track assignment submissions.

Automatic notifications for new assignments.

Comprehensive classroom listings.

# Core Components

**ClassroomManager.java** - Singleton managing all operations.

**Classroom.java** - Manages students and assignments (Subject).

**Student.java** - Represents students (Observer).

**Assignment.java** - Assignment entity with submission tracking.

**VirtualClassroomApp.java** - Main application with menu interface.

# Design Patterns Used

**Singleton:** ClassroomManager ensures single instance.

**Observer:** Students observe classrooms for new assignments.

**Factory:** Creates Classroom, Student, and Assignment objects.



# How to Run

# Virtual Classroom Manager

java virtualclassroom.VirtualClassroomApp

# Output

Menu Options (Virtual Classroom)

Add Classroom - Create new classroom.
<img width="674" height="306" alt="Screenshot 2025-10-02 003737" src="https://github.com/user-attachments/assets/6b098578-e883-45b0-a5e4-77599f4a34f9" />


Add Student - Enroll student in classroom.
<img width="709" height="312" alt="Screenshot 2025-10-02 003755" src="https://github.com/user-attachments/assets/5bb19599-536c-4a9c-93d4-2812559fb704" />


Schedule Assignment - Assign work to classroom.
<img width="1115" height="373" alt="Screenshot 2025-10-02 003910" src="https://github.com/user-attachments/assets/dfd113b6-b591-4c36-82dd-d5d7a75d1dac" />


Submit Assignment - Student submits assignment.
<img width="858" height="283" alt="Screenshot 2025-10-02 003936" src="https://github.com/user-attachments/assets/37229f0a-fc33-41d6-87ef-f62aadad8c5d" />


List Classrooms - View all classrooms with details.
<img width="827" height="427" alt="Screenshot 2025-10-02 003957" src="https://github.com/user-attachments/assets/33de1563-25d9-4159-9562-a31a0b14b568" />


Exit - Close application.
<img width="698" height="295" alt="Screenshot 2025-10-02 004205" src="https://github.com/user-attachments/assets/f2825098-762b-4312-af4b-8599283f57db" />


**Error Cases**

<img width="720" height="223" alt="Screenshot 2025-10-02 004013" src="https://github.com/user-attachments/assets/4ec4c2ed-4e93-40ea-84eb-3288e9dc504a" />

<img width="726" height="343" alt="Screenshot 2025-10-02 004046" src="https://github.com/user-attachments/assets/49d7029f-cc24-4e51-a183-89ce159900d7" />



# Technical Highlights

**Clean Architecture:** Well-organized package structure.

**Design Pattern Implementation:** Six Gang of Four patterns.

**User Interaction:** Console-based with input validation.

**Error Handling:** Comprehensive validation and error messages.

**Extensibility:** Easy to add new features and patterns.
