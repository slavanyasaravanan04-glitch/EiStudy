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

<img width="662" height="287" alt="Screenshot 2025-10-01 222733" src="https://github.com/user-attachments/assets/a60fbc1d-8bd6-4fb6-8eb5-f53ac58bd796" />
<img width="665" height="202" alt="Screenshot 2025-10-01 222757" src="https://github.com/user-attachments/assets/f978b6ca-3ed1-4700-8192-fde22593bbfb" />
<img width="659" height="172" alt="Screenshot 2025-10-01 222827" src="https://github.com/user-attachments/assets/2a21a60c-71b1-4cdd-803d-833bee007325" />


**Error Cases**

<img width="662" height="172" alt="Screenshot 2025-10-01 223034" src="https://github.com/user-attachments/assets/1fb389f7-5753-4520-8e21-fc515eebb240" />


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

<img width="670" height="364" alt="Screenshot 2025-10-01 223828" src="https://github.com/user-attachments/assets/27b5c11c-817f-4d59-be29-42c7d765c81b" />
<img width="785" height="282" alt="Screenshot 2025-10-01 223902" src="https://github.com/user-attachments/assets/de302d5d-fdb2-45c6-8986-bea1bcb4824c" />
<img width="710" height="286" alt="Screenshot 2025-10-01 223919" src="https://github.com/user-attachments/assets/cc926591-ea0d-4124-ab9c-dcdeacf0f0c8" />
<img width="733" height="290" alt="Screenshot 2025-10-01 223944" src="https://github.com/user-attachments/assets/8554a366-1225-47f4-b888-0c0caf1d8bc6" />
<img width="810" height="281" alt="Screenshot 2025-10-01 224059" src="https://github.com/user-attachments/assets/2d960e2d-1e3f-44eb-af71-754782a25ba4" />


**Error Cases**

<img width="751" height="289" alt="Screenshot 2025-10-01 224003" src="https://github.com/user-attachments/assets/cb430281-98f7-4067-85ad-220d35d5568b" />


# Creational Patterns

**Purpose:** Constructs complex Computer objects step by step with flexible configuration.

**Key Classes:**

Computer.java - Product class with static inner ComputerBuilder.

ComputerBuilder.java - Static inner builder class with fluent interface.

**BuilderDemo:** - Interactive computer configuration demo.

<img width="701" height="667" alt="Screenshot 2025-10-01 231839" src="https://github.com/user-attachments/assets/f69854cc-6ab8-4170-9e4b-c4649dc420ac" />


**Error Cases**

<img width="656" height="332" alt="Screenshot 2025-10-01 234458" src="https://github.com/user-attachments/assets/8511c5cd-5899-4d52-aa81-397351d57bc2" />


**2. Factory Pattern**

**Purpose:** Centralizes object creation logic for different shape types.

**Key Classes:**

Shape.java - Common interface for all shapes.

Circle.java - Concrete circle implementation with radius.

Rectangle.java - Concrete rectangle implementation with width and height.

Square.java - Concrete square implementation with side length.

ShapeFactory.java - Factory class creating shape objects based on type.

**Demo:** - Interactive shape creation and area calculation demo.

<img width="672" height="344" alt="Screenshot 2025-10-01 224306" src="https://github.com/user-attachments/assets/63d0fb92-3472-4379-a200-6d22bc782bcc" />
<img width="733" height="286" alt="Screenshot 2025-10-01 224317" src="https://github.com/user-attachments/assets/a6e91ab8-fb2b-405e-be02-f19807b62563" />
<img width="684" height="262" alt="Screenshot 2025-10-01 224325" src="https://github.com/user-attachments/assets/7cec279c-0f63-46a3-9b2b-c3a428ad1baa" />
<img width="717" height="262" alt="Screenshot 2025-10-01 224337" src="https://github.com/user-attachments/assets/e46c10ec-a5f1-4251-b727-df5af0722166" />


**Error Cases**

<img width="634" height="196" alt="Screenshot 2025-10-02 023004" src="https://github.com/user-attachments/assets/b580eac2-ac43-4579-b677-4a87dac0d721" />


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

<img width="670" height="314" alt="Screenshot 2025-10-01 224520" src="https://github.com/user-attachments/assets/fa8f261e-0811-42f6-a0ab-578741e07373" />
<img width="702" height="238" alt="Screenshot 2025-10-01 224530" src="https://github.com/user-attachments/assets/bd20a8d7-9776-41ba-a6ea-cc92cba61f09" />
<img width="700" height="228" alt="Screenshot 2025-10-01 224539" src="https://github.com/user-attachments/assets/9afa5158-e1d5-45b0-a634-0fbc0d1044b9" />
<img width="624" height="248" alt="Screenshot 2025-10-02 023519" src="https://github.com/user-attachments/assets/03ec2e15-6173-453a-8804-e1d6894028f9" />


**Error Cases**

<img width="803" height="208" alt="Screenshot 2025-10-01 224548" src="https://github.com/user-attachments/assets/4267a9bf-570a-4116-b5df-e3619bf0497a" />


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

<img width="670" height="450" alt="Screenshot 2025-10-01 224827" src="https://github.com/user-attachments/assets/9ff5a581-2a4c-4208-9e6c-ca0710b38de8" />
<img width="669" height="315" alt="Screenshot 2025-10-01 224839" src="https://github.com/user-attachments/assets/99241318-f0c4-4375-a27a-b232edd8a6af" />
<img width="822" height="315" alt="Screenshot 2025-10-01 224852" src="https://github.com/user-attachments/assets/ee384fe2-bdc9-4535-a77d-1b8450e09bc8" />
<img width="839" height="360" alt="Screenshot 2025-10-01 224917" src="https://github.com/user-attachments/assets/efa1d788-7cdb-415a-98f0-ffe70e6514c4" />
<img width="672" height="307" alt="Screenshot 2025-10-01 224956" src="https://github.com/user-attachments/assets/ac78b5ca-1af5-4d4b-82ca-ff44a673444d" />
<img width="790" height="310" alt="Screenshot 2025-10-01 225022" src="https://github.com/user-attachments/assets/fc5adf62-6879-44a4-95dd-99b38850054e" />


**Error Cases**

<img width="588" height="255" alt="Screenshot 2025-10-02 023257" src="https://github.com/user-attachments/assets/44ea0f48-d10d-4258-81a6-f6333ee00f4f" />


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

<img width="674" height="306" alt="Screenshot 2025-10-02 003737" src="https://github.com/user-attachments/assets/80760959-ba20-481c-bb57-75d39ec17f6a" />

Add Student - Enroll student in classroom.

<img width="709" height="312" alt="Screenshot 2025-10-02 003755" src="https://github.com/user-attachments/assets/986d169c-e212-4f68-ad1d-3e8e51177f78" />

Schedule Assignment - Assign work to classroom.

<img width="1115" height="373" alt="Screenshot 2025-10-02 003910" src="https://github.com/user-attachments/assets/e3ab6d28-e9e9-4d87-9386-f68e7745e864" />

Submit Assignment - Student submits assignment.

<img width="858" height="283" alt="Screenshot 2025-10-02 003936" src="https://github.com/user-attachments/assets/2c6a3942-b720-42fd-938e-d0a693ccf2a0" />

List Classrooms - View all classrooms with details.

<img width="827" height="427" alt="Screenshot 2025-10-02 003957" src="https://github.com/user-attachments/assets/4f7e132e-d67d-476e-9edf-c782cb75e933" />

Exit - Close application.

<img width="698" height="295" alt="Screenshot 2025-10-02 004205" src="https://github.com/user-attachments/assets/6f666186-eaf2-4f8c-8e2f-3ca7cd261efe" />


**Error Cases**

<img width="720" height="223" alt="Screenshot 2025-10-02 004013" src="https://github.com/user-attachments/assets/ff7759b4-545a-43ce-abed-ad94332ae9a0" />
<img width="726" height="343" alt="Screenshot 2025-10-02 004046" src="https://github.com/user-attachments/assets/17580a3d-3a85-4fbd-bc27-78d814d8357e" />


# Technical Highlights

**Clean Architecture:** Well-organized package structure.

**Design Pattern Implementation:** Six Gang of Four patterns.

**User Interaction:** Console-based with input validation.

**Error Handling:** Comprehensive validation and error messages.

**Extensibility:** Easy to add new features and patterns.
