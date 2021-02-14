# Command Line Parsing Example

Application to parse command line arguments and create objects as well as define relationships between them.

I made this project as I challenge to myself to see if I could properly write my own functional commandline parser without relying on any external libraries/dependencies. I can say I definitely enjoyed this one but I could definitely make it better and will be updating it sometime in the near future.

Command Instructions:
Add classes by using the following command and syntax:
-c "Course ID" "Course Name"
Example:
-c C01 Math

You can add as many courses as you want as long as they don't conflict with each others courseIDs and you use the -c prefix

Adding and assigning Students to classes:
-s "First Name" "Last Name" "CourseId" ...
Example:
-s Stevie Wonder C01 C02 C03 Susie Johnson C01 C02

Here is a preset list of commands you can use for testing:

-c C01 Math C02 History C03 Science -s Stevie Wonder C01 James Johnson C01 C02 Susie Williams C01 C02 C03

Execution Instructions:

In order to run:

Method 1
Command Line:
Runnable Jar:
Locate UniManagement.jar and add your command as runtime arguments:
java -jar UniManagement.jar <Commands Go Here>:
Example:
java -jar UniManagement.jar -c C01 Math C02 History C03 Science -s Stevie Wonder C01 James Johnson C01 C02 Susie Williams C01 C02 C03

Method 2:
Command Line
Running from compiled class:
Locate build/classes/ folder and open in a Command Line terminal.
Use the following command:
java universitymanager.UniManagerMain "Commands Go Here"

Method 3:
Running from IDE
Import the project into your IDE of choice and go to your run configuration and add the commands as the arguments for the program.
Example:
Netbeans
https://stackoverflow.com/questions/9168759/netbeans-how-to-set-command-line-arguments-in-java
IntelliJ
https://stackoverflow.com/questions/2066307/how-do-you-input-commandline-argument-in-intellij-idea
