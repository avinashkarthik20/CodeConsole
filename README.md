# CodeConsole

SpringerNature Coding Challenge

Below is a coding problem that we would like you to solve. Please read through the
description carefully and implement a solution for it. We don't want you to overengineer
the solution but be prepared to extend the functionality in the next step of the interview process.
Finally, we ask you to submit a solution that you'd be happy to go live with and works "out of
the box”.

Please create a local repository using either git or mercurial and then commit locally. When
you have finished please zip up the whole folder and email it to
codingchallenge@springernature.com . We will then review it within 7 days.
Good Luck!

Things We Value
● Working software!
● Tests.
● A working build.
● Small checkins with good comments.
● A simple readme (maybe talk about tradeoffs and design decisions).
● Simple code (but not necessarily easy!)
● The fewer libraries the better, we want to see your code. But if you want to use a
library then say why in your readme.
● We like functional constructs but also value good domain names and modelling.
● Evidence you have thought about errors (either in code or the readme).

The Challenge
You're given the task of writing a simple console version of a drawing program. At this time,
the functionality of the program is quite limited but this might change in the future. In a
nutshell, the program should work as follows:

1. create a new canvas
2. start drawing on the canvas by issuing various commands
3. quit

At the moment, the program should support the following commands:

C w h Should create a new canvas of width w and height h.

L x1 y1 x2 y2 Should create a new line from (x1,y1) to (x2,y2). Currently only
horizontal or vertical lines are supported. Horizontal and vertical lines
will be drawn using the 'x' character.

R x1 y1 x2 y2 Should create a new rectangle, whose upper left corner is (x1,y1) and
lower right corner is (x2,y2). Horizontal and vertical lines will be drawn
using the 'x' character.

B x y c Should fill the entire area connected to (x,y) with "colour" c. The
behaviour of this is the same as that of the "bucket fill" tool in paint
programs.

Q Should quit the program.

Errors & Implementations:

* The bucketfill fuction can lead to stackoverflow exception.
* The 2D Array items takes null by default, and also displays null when a canvas is drawn, so I have altreded the print statement to not to show null
* As the 2D Array items has null values during Bucketfill the null vales are changed to 0 so that the bucketfill can work efficiently.
* The Commands are decalared are Enum beacuse when the application grows in the future it would be easy to add the commands and use it in the draw function instead of having a switch case for all the commands which is lot of code and not a good design pattern.
* Tests for the Hasp and the draw function is done.
* The application is developed in the Eclipse IDE and Git
