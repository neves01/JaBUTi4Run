# JaBUTi4Run?

[![Gittip](https://img.shields.io/badge/Latest%20stable-2.0-green.svg?style=flat-squared)]()

JaBUTi4Run is a project for just to manipulate the JaBUTi .jar for run it and some examples

### Project at GitHub

- See [https://github.com/jacksonpradolima/JaBUTi] 

# Requirements

- Java 1.6 or above to run
- BCEL 5.2 (Byte Code Enginnering Library)
- CAPI 1.0 (Curve API)
- Mucode (Java API for mobile agent systems)
- JUnit <=4.4 (Framework for writing and running automated tests)
- GraphViz <= 2.20.x



## Requirements for system under testing (SUT)

- Java 1.6 or _below_

  The library we use to manipulate Java bytecode is not completely compatible with Java 7.0 and above. We could still test when using the option "-XX:-SplitVerifier", but this option is ignored by recent Java 7 and 8 virtual machines. Thus, the only safe choice is to use an application compiled to Java 1.6 or below.

# How do I start?

1. Access [here](https://github.com/jacksonpradolima/JaBUTi4Run/archive/master.zip) and dowload the project;
2. Unzip in some directory of your choise;
2. Run the JaBUTi :+1:.

> Follow the tips and the step-by-step below.

# Tips

Here's some examples how to execute the JaBUTi.

## You can run JaBUTi by typing
```tex
java -cp jabuti.jar br.jabuti.gui.JabutiGUI
```

### Or runnning 
> run.sh

## To execute a test case
```tex
java -cp jabuti.jar br.jabuti.probe.ProberLoader -p <project name> <class to execute> [execution parameters]
```

## To instrument and store it instrumented
```tex
java -cp jabuti.jar br.jabuti.probe.ProberInstrum -o <file.jar> -p <project name> <class to execute>
```

## Once instrumented, to execute a test case
```tex
java -cp <file.jar> <class to execute> [execution parameters]
```

# Step-by-step

1. Run JaBUTi
2. If is the first time
  1. Click in File :arrow_forward: Open Class
  2. Put the class (binary - **.class**) which will be test
  3. In **classpath** put the source path of the class file (without package name). 
    * For example: 
      -  ../src :+1: (It's ok!)
      -  ../src/paper :no_entry_sign: (It's wrong!)
  4. Click in "**OK**"
  5. It will open the Project Manager window
  6. Select in **User Packager** the class which will be test (The **classpath** needs be correct to appear the class file)
  7. Click in :fast_forward: (second button) to select the class to instrument 
  8. Click in **Select** and give a name for the project
  9. Click in "**OK**"
  10. Click in File :arrow_forward: Save Instrumented Classes and after click in **Yes**, if the class there is a main method, otherwise **No** and next "**OK**".
3. Click in Teste Case :arrow_forward: Executing JUnit Test Set
  1. Put in **Path to JUnit test suite source code** the test path (java file - whithout package name) 
  2. Put in **Path to JUnit test suite binary code** the test path (binary file - whithout package name) 
  3. Put in **Test suite full qualified name** the test file name (whithout extension and with package name)
  4. Put in **JaBUTi's library** the JaBUTi's jar 
  5. Check the javac path if is correct
  6. Click in **Compile Test Case** and check if the **.class** file was generated
  7. Click in **Run Normally (no trace)** - This action will check and execute the test cases
  8. Click in **Run Collecting Trace Information** - This action will enable a red button in the JaBUTi and this is because we need update the JaBUTi informations
  9. Close the test case window 
4. Click in Update :arrow_forward: Update
5. Check the coverage in Summary choosing the scope of coverage
6. Click in Reports :arrow_forward: Custom Reports and give a name for the report file

> For more informations access [here](https://github.com/jacksonpradolima/JaBUTi4Run/archive/master.zip) and dowload the manual





