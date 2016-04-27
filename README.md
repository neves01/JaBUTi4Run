# What is it?

JaBUTi4Run is the original JaBUTi project (version 2.0) only the .jar for run it and some examples

### Project at GitHub

- See [https://github.com/jacksonpradolima/JaBUTi] 

# How do I start?

For to use do the step-by-step:

1. Access [here](https://github.com/jacksonpradolima/JaBUTi4Run/archive/master.zip) and dowload the project;
2. Unzip in some directory of your choise;
3. Follow the tips below.

# Tips

Here's some examples how to execute the JaBUTi.

### You can run JaBUTi by typing
```tex
java -cp jabuti.jar br.jabuti.gui.JabutiGUI
```

### To execute a test case
```tex
java -cp jabuti.jar br.jabuti.probe.ProberLoader -p <project name> <class to execute> [execution parameters]
```

### To instrument and store it instrumented
```tex
java -cp jabuti.jar br.jabuti.probe.ProberInstrum -o <file.jar> -p <project name> <class to execute>
```

### Once instrumented, to execute a test case
```tex
java -cp <file.jar> <class to execute> [execution parameters]
```
