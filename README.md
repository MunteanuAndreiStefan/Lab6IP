Laboratory problem:

Roles:
Munteanu Andrei-Stefan - Developer, Scrum master.

Zaharia Raul - Developer

Ninicu Cristian - Developer.

Ouatu Bogdan - Developer, Tester.

Ghiga Claudiu - Developer, Tester.

Costandache Andrei - Developer, Tester.

Marcu Alexandru - Tester.

Silistru Alex - Tester.

Dodu Emanuel - Tester.

# Lab6IP

We respected SOLID principles.

All your classes in Model, Recognition and Utils have one and only one responsibility.
We used Open/Closed principle on Recognition and File via reflection.
We respected LSP principle in all our classes that have inheritance.
We respected ISP via providing slim interfaces for file and recognition.
Both our interfaces for File and of Recognition.
Also we take care about dependency by adding the interface layer between Brain and files + recognition.

Our cyclic complexity is minimal because we didn't used any conditional statements.
We used reflection even if that provides a delay in execution time.
