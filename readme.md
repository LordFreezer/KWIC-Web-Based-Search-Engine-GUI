Stephen Key

Chad Marshal

# Web-based Search KWIC System

**Process Architecture (Division of Work)**

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha16.png)**

In terms of how work was divided between teammates, it was mostly a matter of which tasks required the most attention at the time and who was first available to start working on them. In terms of communication, team members started with a meeting over the system&#39;s diagrams and then mostly worked separately afterwards. Teammates would send written updates to each other before making changes that would affect other components, and if an in-depth explanation over any topic was required, teammates would hold a meeting whenever both were available.

**Requirement Specification (Use Case and Sequence Diagrams):**

Use case diagram

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha1.png)**

The system serves one function.

Sequence Diagram

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha2.png)**

The system&#39;s architecture makes it easily scalable and modifiable. The user interface presents the system&#39;s functionality as a GUI making it user-friendly and understandable.

**Architecture Specification (Component Diagram):**

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha3.png)**

This system uses the Shared Data Architectural style. The user interface takes in a String input and passes it to the Input component which stores the input as a LineStorage Object. This LineStorage Object is read by a Circular Shifter which creates a list of virtual shifted lines. These lines are read by an Alphabetizer which virtually sorts them in a specific alphabetical order (a\&lt;A\&lt;b\&lt;B\&lt;…\&lt;y\&lt;Y\&lt;z\&lt;Z). These lines are read by the Output component which sends the data back to the user.

**Advantages:**

- The system is highly efficient. Since data is not duplicated between components, the system performs less expensive operations and achieves its goal faster than it would if its components wrote physical lines.
- The system&#39;s information is stable. Since a component implementing ILineSet hides its data from other components, only sharing it through provided methods, it is less likely that a certain operation will cause an unwanted change in the systems data.
- The system is relatively modifiable. Any component that properly utilizes the functions required by the ILineSet can be used in this system.

**Disadvantages:**

- The system is complex. Several components making multiple character requests down a line makes it difficult to understand exactly how the end result is achieved.

Note: Since the components in this system communicate strictly through function calls, a deployment diagram for this system would be identical to the component diagram.

**Design Specification (Class Diagram):**

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha4.png)**

**User Manual**

The system was coded through NetBeans and is designed to run as a NetBeans project. However, the projects internal classes (Alphabetizer, MastControl, and CircularShifter, etc.) can be implemented on any engine that accepts Java.

**Overview**

Upon startup, the system will open a window with two text areas and two buttons.

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha5.png)**

To use the system, enter your input lines in the text area to the left and press the button labeled &quot;Engage!&quot; to receive a list of alphabetized circular shifts on the text area to the right.

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha6.png)**

To reuse the system, press the button labeled &quot;Reset&quot; to clear the text form both text areas and repeat the initial process.

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha7.png)**

**Under the Hood**

We are able to get user input and start the core processes through The Input and ButtonEventHandler respectively. Below is a snipbit from ButtonEventHandler.

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha8.png)**

**The heart** of the system is MastControl. It controls the flow of events once the user has fired the event by clicking ENGAGE. Below is a snipbit from MastControl

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha9.png)**

From MastControl, we can circular shift the user input and alphabetize it. We are also able to change the order with ease.

CircularShifter

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha10.png)**

Alphabetizer

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha11.png)**

**Performance Comparison**

Using the data provided, we noticed that the older system performs faster than the new system. It is theorized that because data is being copied by daisy chaining Objects in MastControl, the execution time is greater in the new system than the old.

**Execution time in old System**
**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha12.png)**

**Program View**

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha13.png)**

**Execution time in new System**

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha14.png)**

**Program View**

**![Screenshot](https://github.com/LordFreezer/Web-Based-Search-Engine-KWIC/blob/Assets/sha15.png)**