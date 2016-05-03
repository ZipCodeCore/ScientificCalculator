#KanyeL8TOR
####Watch Yeezy make math easy...as he interrupts you with how great he is. 
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
	|-->inverse ✓
	|-->switch sign ✓

|-->scientific features
	|-->display mode
		|->binary ✓
		|-->octal ✓
		|-->decimal ✓
		|-->hex ✓
		|-->switchdisplaymode()	 ✓
		|-->switchdisplaymode(string mode) ✓
		
|-->memory
	|--> add from memory ✓
	|--> reset memory ✓
	|--> recall mem to display ✓
	
|-->Trig functions
	|-->sine() ✓
	|-->cosin() ✓
	|-->Tan() ✓
	|
	|-->cos-1() ✓
	|-->sin-1() ✓
	|-->tan-1() ✓
	|->units() (radians and degrees) ✓
	
|-->log func (skipped)

|-->factorial func (skipped)

2 custom functions
|-->confidence booser (kanye west quote)

|-->mute kanye

	  
```

###custom function 1: Imma let you finish

method will sometimes print random kanye west quote and not return the result that you wanted 

kanye will also sometimes guess because he is tired of doing all this math by hand. 

the methods involved with this feature are as follows

ImmaLetYouFinish()


###custom Method 2: mute kanye and KANYE REST

method will set options to allow kanye to interrupt you or not
you can also tell kanye to relax and exit the program by saying kanye rest


#feature plan

####April29 -First Sprint
* UML ✓
* basic arithmetic operations ✓

##April30 -Second Sprint
* Scientific features ✓
* Trig functions ✓
* memory ✓
* log function (skipped)
* factorial function (skipped)
 
##May 1 -Third sprint
* Immaletyoufinish feature ✓
	* Kanye Guesses feature ✓
 of a generation"
* display CLI

##May 2 -4th sprint
* errorhandling 
 
* runnit method
	* I want to write the runnit function to take any type of input
* shutup kanye feature
 * you cant shut kanye up, I am the voice


##Breaking it down

###Nouns
* kanye (calculator)
* display 
* memory 
* inputOne 
* inputTwo 

###Verbs
* add 
* subtract 
* multiply 
* divide 
* square 
* squareroot 
* exponent 
* inverse
* switch sign



##UML 
UML Diagram will be posted in the repository
but is by no means finished. I had to add on to it as i continued.

#Design Choices 
**Double:** `3.1415926535897932`

**Float:**  `3.14159265`

our initial choice to use the primitive type`Float` rather than `double` for our field so that we calculate between 6 and 9 decimal places to capitalize on speed and that 17 decimal places is usually unnessecary in the scope of a simple scientific calculator...Also Kanye Doesn't want to mess with all that precision.

upon furter instruction of the`double` primitive format, it could be possible to return a very large number with only a small level of precision (maybe the hundreds place) so it seemed our initial presumptions were wrong...

**the final decision was to use **`Double`

### methods like  Math.asin() and inputs with limited domain
alot of the arc trigonometric functions are a challenge to implement due to the fact that they only can compute a limited domain and can only print out radians between 0 and pi. 
this will involve error handling or possibly even the use of modulus to create a kind of pac-man effect for the domain. as soon as you input a value outside of the range, it runs based on the remainder. 

##Testing
Because we are dealing with doubles, there is an issue with using assertEquals() in testing. with each operation there is a problem with the rounding with each operation. in order to avoid the loss of accuracy we chose to set a margin of error in which all tests had to be within that was avaiable to all tests, rather than resorting to error specific testing

##Refactoring
originally we had `inputOne` and `inputTwo` variables two do operations with, however in the process of writing the methods, it was clear that there was no reason to store the `inputTwo` to a field when all we needed to do was to pass the parameter of each operator method to the expression (rvalue) in that aspect we were able to remove the inputTwo field entirely. 

another ommission is the input from `sqrt()` there is no need for a parameter to carry out the method, it returns a `double` but does not take one. other methods that exentually were adjusted to not take parameters for the same reson were switch sign and inverse;

##Method design choices

for the switch sign method, there are several ways that you could acheive the result. in this situation where there is no right answer we have decided to set the contraint that computationally, the fasted method and the the operation with the minimum logical number of steps is also most viable. 

switch sign could be exected with a series of addition and subtraction steps, however this would involve another method or logic to differentiate the sign of the input. 

the logical conclusion is to multiply by -1 which bypasses the need to recognize sign

addition of positive and negative numbers to seems less taxing to compile than  multiplication, however, this does not matter in this case because everything is computed inline, and there is no computational benifit. 

###future notes for refactoring
it may be useful to store not only the `double` of the `inputOne` but also the `int' be more dry. I would not have to create a variable every time I want to change the mode





=======
# Project 1: Calculator


## Description

In this project you will build a small app to function as a calculator. This app  will be built in Java, and will use the topics and techniques discussed during the week.

You should work on this project in your own repository. Click the `fork` button in the top right corner to create a copy of this repository on your github account. You can go through the [GitHub forking tutorial](https://help.github.com/articles/fork-a-repo/) if you need additional practice with this.


## Requirements

### Testing

All features must be tested. Tests must include normal behavior, and any possible error situations. Tests must have descriptive names and should be independent of each other (running or not running one test should not influence the behavior of any other test).

### Documentation

You must produce UML diagrams for your program. All classes (excluding test classes) must be included in the UML class diagrams.

### Core Features

All calculators should have the following features:

- A state, representing the value currently displayed on the calculator (default 0) *
- Get the current number on the display *
- Clear the display *
- Change the number on the display *
- Add, subtract, multiply, and divide the value on the display by a given number
- Calculate the square (x<sup>2</sup>) and square root (√x) of the number on the display *
- Calculate variable exponentiation (x<sup>y</sup>)
- Calculate the inverse of the number on the display (1/x) *
- Invert the sign of the number on the display (switch between positive and negative)
- Update the display to `Err` if an error occurs (eg: Division by zero) *
- Errors must be cleared before any other operation can take place *

Each operation should automatically update the display


### Scientific Features

- Switch display mode (binary, octal, decimal, hexadecimal)
  - `switchDisplayMode()` should rotate through the options
  - `switchDisplayMode(String mode)` should set the display to the mode given
- Memory - Store up to one numeric value in memory for recall later (default to 0) *
  - (`M+` key) Add the currently displayed value to the value in memory (store in memory and update display) *
  - (`MC` key) Reset memory *
  - (`MRC` key) Recall the current value from memory to the display *
- Trig functions
  - Sine - Calculate the sine of the displayed value and display it
  - Cosine - Calculate the cosine of the displayed value and display it
  - Tangent - Calculate the tangent of the displayed value and display it
  - Inverse Sine
  - Inverse Cosine
  - Inverse Tangent
- Switch trig units mode (Degrees, Radians)
  - `switchUnitsMode()` should rotate through the options
  - `switchUnitsMode(String mode)` should set the trig units to the type given
- Logarithmic functions
  - Log
  - 10<sup>x</sup> (inverse logarithm)
  - Ln (natural logarithm)
  - e<sup>x</sup> (inverse natural logarithm)
- Factorial function  


### Custom Features

In addition to the Core and Scientific features, you are required to create at least two of your own features for the calculator. They can be any two features that are not already covered and that you can implement as you see fit. These features must be properly tested.

### Hints

The following functions should take the displayed value (x) and updated it according to the given formula: (this may not be an exhaustive list)

- `square()`: x<sup>2</sup>
- `squareRoot()`: √x
- `inverse()`: <sup>1</sup>/<sub>x</sub>
- `switchSign()`: -x
- `sine()`: sin(x)
- `cosine()`: cos(x)
- `tangent()`: tan(x)
- `inverseSine()`: sin<sup>-1</sup>(x)
- `inverseCosine()`: sin<sup>-1</sup>(x)
- `inverseTangent()`: tan<sup>-1</sup>(x)
- `factorial()`: x! (x factorial)

## Submission

Completed projects should be submitted by submitting a pull request against the [original repository](https://github.com/Zipcoder/project-1-calculator). All work should be done in your own repository.
