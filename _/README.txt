The software and the hardware requirements list is valid for all the chapters (4-8).

The examples are grouped in 3 folders (see the masteringjbpm6.zip) :

#chapter4-managed,
#chapter4-pizza
#examples.

Which reflect the 3 GIT repositories the user must clone in order to compile and run the source code.
(repositories are hosted and can be read from https://github.com/masteringjbpm6).

Chapter 4 folders are separated from the examples folder since the jBPM console (in order for the book examples to work)
requires them to be different GIT repositories on their own (different URL).


The "examples" folder hosts all the other projects since there are dependencies between them which makes 
hard to group them by chapters, due to the way they must be configured and built (using Maven).

In addition to that, source from the "examples" folder are sometimes reused through chapters. 
