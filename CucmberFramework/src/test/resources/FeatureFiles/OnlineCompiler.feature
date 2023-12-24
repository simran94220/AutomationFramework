#Author: Snehal Wanjare
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Online compiler page load Feature
  Verify online compiler

	@Test
  Scenario: Verify basic JDE on page load
    Given user is on homepage
   When page loaded with default basic JDE
    Then verify default code is displayed

   @Test
 Scenario: Execute default code in basic JDE
    Given user is on homepage
   And user clicks on execute button
    Then verify Sum of x+y = 35 is displayed rightly
 
#Data driven test

	@Test
  Scenario: Execute custom code in basic JDE
    Given user is on homepage
   When user enters <code>
   And user clicks on execute button
    Then verify <output> is displayed rightly
     Examples:
  | code | output | 
  | public class Square {public static void main(String args[]) {int num=4;int square = num*num;System.out.println("Square of " + num + " is: "+ square);}}| Square of 4 is: 16    | 
  | public class SayHello {public static void main(String args[]) {String name="CustomCode";System.out.println("Hello, My Name is " + name + "!");}}| Hello, My Name is CustomCode!    |
 
 
 

 
 	@Test
  Scenario: Execute default code in advanced JDE
    Given user is on homepage
   When user clicks on Advanced Java IDE
   And user clicks on execute button
   Then verify Sum of x+y = 35 is displayed rightly

 
 
	@Test
 Scenario: Execute custom code in advanced JDE which takes arguments from user
   Given user is on homepage
  When user clicks on Advanced Java IDE
    And user enters <code>
  And user clicks on execute button
  Then verify <output> is displayed rightly
    Examples:
 | code | output | 
	| public class MyClass {public static void main(String args[]) {int num=4;int square = num*num;System.out.println("Square of " + num + " is: "+ square);}}| Square of 4 is: 16    | 
 | public class MyClass {public static void main(String args[]) {String name="CustomCode";System.out.println("Hello, My Name is " + name + "!");}}| Hello, My Name is CustomCode!    |
 
 
 @Test
 Scenario: Confirm horizontal bar options in homepage
 Given user is on homepage
 Then confirm all options in top bar

 
  	@Test
  Scenario: Verify tabs displayed in homepage
    Given user is on homepage
  When four tabs below Execute button is displayed
  Then verify each tab
   
   @Test
   Scenario: Execute code in languages other than java (c++,python) in Basic JDE
   Given user is on homepage
  When user enters <code>
  And user clicks on execute button
  Then verify <error> is displayed rightly
  Examples:
  | code | error | 
  | x=10; y=25; z=x+y; print "Sum of x+y =", z;| No "public class" found to execute    | 
  #| #include <iostream> using namespace std; int main() { int x=10; int y=25; int z=x+y; cout<<"Sum of x+y = " << z; }| No "public class" found to execute    | 
  
  
  