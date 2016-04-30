#KanyeLTOR
####Watch Kanye West do calculations...and interrupt you with how great he is. 
###co-written by Alejandro and Sam

create a scientific calculator in java with unit tests

##Features
```
|-->Display
	|-->get current number on the display
	|-->clear display
	|-->change the number on display
	|-->Display Err
	
|-->operations
	|-->add ✓
	|-->subtract ✓
	|-->multiply ✓
	|-->divide ✓
	|-->square ✓
	|-->squareroot ✓
	|-->exponent ✓
	|-->inverse
	|-->positive or negative

|-->scientific features
	|-->display mode
		|->binary
		|-->octal
		|-->decimal
		|-->hex
		|-->switchdisplaymode()		
		|-->switchdisplaymode(string mode);
		
|-->memory
	|--> add from memory
	|--> reset memory
	|--> recall mem to display
	
|-->Trig functions
	|-->sine()
	|-->cosin()
	|-->Tan()
	|
	|-->cos-1()
	|-->sin-1()
	|-->tan-1()
	
|-->log func

|-->factorial func

2 custom functions
|-->confidence booser (kanye west quote)

|-->mute kanye

	  
```

###custom function 1: Imma let you finish

method will print random kanye west quote and not return the result that you wanted

###custom Method 2: mute kanye

method will set options to allow kanye to interrupt you or not

##feature plan

####April29 -First Sprint
* UML
* operations



##Breaking it down

###Nouns
* kanye ✓
* display ✓
* memory ✓
* inputOne ✓
* inputTwo ✓

###Verbs
* add ✓
* subtract ✓
* multiply ✓
* divide ✓
* square ✓
* squareroot ✓
* exponent ✓
* inverse
* switch sign



##UML 
UML Diagram will be posted in the repository


#Design Choices for primitives
**Double:** `3.1415926535897932`

**Float:**  `3.14159265`

our initial choice to use the primitive type`Float` rather than `double` for our field so that we calculate between 6 and 9 decimal places to capitalize on speed and that 17 decimal places is usually unnessecary in the scope of a simple scientific calculator...Also Kanye Doesn't want to mess with all that precision.

upon furter instruction of the`double` primitive format, it could be possible to return a very large number with only a small level of precision (maybe the hundreds place) so it seemed our initial presumptions were wrong...

**the final decision was to use **`Double`



##Testing
Because we are dealing with doubles, there is an issue with using assertEquals() in testing. with each operation there is a problem with the rounding with each operation. in order to avoid the loss of accuracy we chose to set a margin of error in which all tests had to be within that was avaiable to all tests, rather than resorting to error specific testing

##Refactoring
originally we had `inputOne` and `inputTwo` variables two do operations with, however in the process of writing the methods, it was clear that there was no reason to store the `inputTwo` to a field when all we needed to do was to pass the parameter of each operator method to the expression (rvalue) in that aspect we were able to remove the inputTwo field entirely. 

another ommission is the input from `sqrt()` there is no need for a parameter to carry out the method, it returns a `double` but does not take one. 







