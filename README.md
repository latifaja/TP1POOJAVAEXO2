French Verb Conjugator for First-Group Verbs
In this exercise, a class Main is instantiated, which contains the main method of the program. This program is designed to read a first-group verb (a regular verb ending in "er") and display its conjugation in the present tense.

Implementation Details
Reading the Verb:

The program starts by creating a Scanner instance to read user input from the console.
After prompting the user to enter a verb, the nextLine() method captures the entered string.
Verb Verification:

The program verifies if the verb ends with "er" using the endsWith() method. This ensures that only a first-group verb is processed.
Verb Conjugation:

If the verb is valid, the verb’s stem is extracted by removing the last two letters ("er") with the substring() method.
The conjugation is then displayed for all persons in the present tense:

je    : je + stem + e
tu    : tu + stem + es
il    : il + stem + e
nous  : nous + stem + ons
vous  : vous + stem + ez
ils   : ils + stem + ent
Error Handling:

If the verb does not end with "er," an error message is displayed, indicating that the input is not a first-group verb.
