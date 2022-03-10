Stephen Key

Chad Marshal

Web-based Search KWIC System

**Requirement Specification (Sequence Diagram):**

**![](media/7e0a5255324f805490256cbd0df8358d.png)**

The system’s architectural style makes it easily scalable and modifiable. The
user interface presents the system’s functionality as a GUI making it
user-friendly.

**Architecture Specification (Component Diagram):**

**![](media/779916882b9d3e750c2ae76e406aa54a.png)**

This system uses the Pipe and Filter Architectural style. The user interface
takes in a String input and passes an ArrayList of Strings to the circular
shifter. The shifter takes this ArrayList and generates an ArrayList of circular
shifts which it passes to the organizer. The organizer takes this list, sorts it
in a specific alphabetical order (a\<A\<b\<B\<…\<y\<Y\<z\<Z), and returns it to
the user.

**Advantages:**

-   The system is highly modifiable. Its components can be replaced with other,
    more efficient components or extracted for use in other systems.

-   The system is easy to understand. Users can easily understand how to use the
    system or diagnose a problem in the case of an unexpected result.

**Disadvantages:**

-   Passing ArrayLists to different classes multiple times makes the system’s
    efficiency less than optimal.

**Design Specification (Class Diagram):**

**![](media/45f29607cf0c1dcce27c3b3db410367e.png)**

**User Manual**

**![Graphical user interface, application Description automatically
generated](media/288ed4a42423994b77b482ff3dc20bd6.png)**

The system was coded through NetBeans and is designed to run as a NetBeans
project. However, the projects internal classes (Input, Organizer, and Shifter)
can be implemented on any engine that accepts Java. Upon startup, the system
will open a window with two text areas and two buttons. To use the system, enter
your input lines in the text area to the left and press the button labeled
“Engage!” to receive a list of alphabetized circular shifts on the text area to
the right. To reuse the system, press the button labeled “Reset” to clear the
text form both text areas and repeat the initial process.
