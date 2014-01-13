<<<<<<< HEAD
# Build file for CS61C Project 1  [Fall 2013]
# You should not need to edit this file if you're working on the inst machines.

# This file requires GNU make and depends on paths on instruction machines.

# If you are working on your own machine, you will need to edit the paths.


=======
# Build file for CS61C Lab 3
# You should not need to edit this file.

# This file requires GNU make and depends on paths on instruction machines.

>>>>>>> f93b9b477ed95c918e0f76d1314b589846860a09
####

## Variables

<<<<<<< HEAD
# Source files (java code). wildcard selects all files matching a pattern.
SOURCES = $(wildcard *.java)
# Output JAR file
TARGET = proj1.jar
# Extra JARs to have on the classpath when compiling.
CLASSPATH = /home/ff/cs61c/hadoop/hadoop-core.jar:/home/ff/cs61c/hadoop/lib/commons-cli.jar
# Compatibility flags to build for Java 6. Remove these flags if in the future 
# the EC2 servers support Java 7 (or later versions)
COMPAT_FLAGS = -source 6 -target 6
# javac command to use
JAVAC = javac -g $(COMPAT_FLAGS) -deprecation -cp $(CLASSPATH)
=======
# Source files (java code)
WORDCOUNT = WordCount.java
NUMSTR = NumStr
# Output JAR file for WordCOunt
TARGET = wc.jar
# As of 9/5/13, the local machines are using JDK 7 but our EC2 servers only supports JRE 6
# Tells the compiler to compiel for JRE6
COMPAT_FLAGS = -source 6 -target 6
# Extra JARs to have on the classpath when compiling.
CLASSPATH = /home/ff/cs61c/hadoop/hadoop-core.jar:/home/ff/cs61c/hadoop/lib/commons-cli.jar
# javac command to use
JAVAC = javac -g -deprecation -cp $(CLASSPATH)
>>>>>>> f93b9b477ed95c918e0f76d1314b589846860a09
# jar command to use
JAR = jar

## Make targets

# General form is target: dependencies (targets or files), followed by
# commands to run to build the target from the dependencies.

# Default target.
all: $(TARGET)

<<<<<<< HEAD
$(TARGET): classes $(SOURCES)
	$(JAVAC) -d classes $(SOURCES)
=======
$(TARGET): classes $(WORDCOUNT)
	$(JAVAC) $(COMPAT_FLAGS) -d classes $(WORDCOUNT)
>>>>>>> f93b9b477ed95c918e0f76d1314b589846860a09
	$(JAR) cf $(TARGET) -C classes .

classes:
	mkdir classes

clean:
<<<<<<< HEAD
	rm -rf classes $(TARGET)
=======
	rm -rf classes $(TARGET)  $(NUMSTR).class

numstr:
	$(JAVAC) $(NUMSTR).java
	java -cp $(CLASSPATH):. $(NUMSTR)

>>>>>>> f93b9b477ed95c918e0f76d1314b589846860a09

.PHONY: clean all
