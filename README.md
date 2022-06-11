# Power Bank 2

### :bulb: <ins>What did we make?</ins>

Our main objective was based on creating a platform for banks to which both employees and customers of the same had access in which they had greater ease to be able to carry out its different functionalities in an intuitive and simple way.

### 🧐 <ins>How did we make it?</ins>

This platform has been developed using a **Clean Architecture** and referring to **SOLID Principles**. That is, group the different classes that we were using in different folders such as controllers, data, repositories and use cases. Having these folders helped us understand where each functionality of the program was located and thus maintain a certain order in the creation of the code.

**📈 Component Diagram**

![Diagrama sin título drawio](https://user-images.githubusercontent.com/90770844/173087334-c5059237-8128-4be3-914f-a095bb378ac3.png)

**💬 Textual Description**
* Controllers: manage the flow of the program in such a way that they able to control the activity of the user

* UseCases: basically referring to the business logic of our program. They will only contain the execute method so that
we can keep them simple (-80 code lines) and understandable avoiding future conflicts

* Repositories: classes in charge of deleting, accessing, adding or modifying the database. These classes inherit
from the AbstractRepository so that the data can persist every time we run an useCase
* Domain: all the tangible things that conform our program. They describe the foundations where the rest of the program
may be built
  * Exceptions
  * Constants: repetitive values all over the program (we use OOP so we need objects for that).
  * Entities: "our universe"



### ⁉️ <ins>Why did we develop it this way?</ins>

During many of our first projects and due to our limited knowledge we have implemented our ideas resulting in the well-known Spaghetti Code 🍝 which always led us to various problems when expanding or maintaining our program around the feedback received, thanks to those first steps we have realized how important it is to maintain good Software Quality.

Due to this reasoning we have put this philosophy into practice developing code which is:  
- Functional 
- Reliable 
- Efficient 
- Maintainable
- Portable
- Scalable

