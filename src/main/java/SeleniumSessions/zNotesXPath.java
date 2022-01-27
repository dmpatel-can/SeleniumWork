package SeleniumSessions;

public class zNotesXPath
{
/**
=> XPath is an Address/Path of an Element and Not an Attribute.

=> Types Of XPath

# Absolute XPath: Not Advisable
	//html/body/div/div[2]/ul/li[2]/a

# Custom/Relative XPath:
 ~ It is created by Using followings.... Attributes (id, name, classname, etc)
 										 Multiple functions
										 Parent/child, ancestor, siblings
										 Axes
 ~ Syntaxes of Custom XPath:
 
  1) Create By Using "Attribute" -->
 
  --> Formula-1: //Tag[@attr='value']                     --> Eg: //input[@name='email']
	
  --> Formula-2: //Tag[@attr1='value' and @attr2='value'] --> Eg: //input[@name='email' and @type='text']
 
  --> Formula-3: //Tag[@attr1='value' or @attr2='value']  --> Eg: //input[@type='submit' or @value='Login']
	
  2) Create By Using "text()" -->

  --> Formula: //Tag[text()='value'] --> Eg: a[text()='Wish List'] Eg: //span[text()='value']
	
  3) Create By Using "contains(  ,' ')" --> To handle Dynamic elements with Dynamic Properties/Attributes
  
  --> Formula-1: //Tag[contains(@attr,'value')] --> Eg: //input[contains(@id,'email')]

  --> Formula-2: //Tag[contains(@attr1,'value') and contains(@attr2,'value')]
         --> Eg: //input[contains(@id,'email') and contains(@name,'email')]

  --> Formula-3: //Tag[contains(@attr1,'value') and @attr2='value']
         --> Eg: //input[contains(@id,'email') and @name='email']
	 
  --> Formula-4: By Using --> "Partial Value" of a Dynamic Attribute
         --> Eg: //input[contains(@id,'test_')] will be the XPath in the following Scenario 
      				//<input id="test_123"/>
					//<input id="test_234"/>
					//<input id="test_456"/>
	
  4) Create By Using "contains with "text()" -->
  
  --> Formula-1: //Tag[contains(text(),'value')] --> Eg: //h2[contains(text(),'customers')]

  --> Formula-2: //Tag[contains(@attr,'value') and contains(text(),'value')]
	     --> Eg: //a[contains(@href,'wishlist') and contains(text(),'Wish List')]
  
  --> Formula-3: //Tag[contains(@attr1,'value') and contains(@attr2,'value') and contains(text(),'value')]
         --> Eg: //a[contains(@href,'wishlist') and contains(@class,'list-group-item') and contains(text(),'Wish List')]
         
  5) Create By Using "starts-with" -->

  --> Formula-1: //Tag[starts-with(@attr,'value')] --> Eg:  //input[starts-with(@id,'user')]
	
	--> Eg:	//input[starts-with(@id,'firstname_')]  this is the XPath for the following Scenario
			//<input id="firstname_123"/>
			//<input id="firstname_234"/>
			//<input id="firstname_456"/>
			 
  6) Create By Using "class name" -->

~~> In the Real Scenario:  Sometimes You will have following types of class names in 1 class name

	//form-control private-form__control login-email --> Here it has 3 class names
	//form-control private-form__control login-password m-bottom-3 --> Here it has 4 class names

	--> Formula: //Tag[@class='c1 c2 c3 ... cn']
			 Eg: //input[@class='form-control private-form__control login-email']
			 
  7) Create By Using "index" -->
  
	Write down XPath and cover it with () and apply indexing
	Formula: (//Tag[@attr='value'])[indexNo]

	Eg: (//div[@class='container'])[3]//a
	Eg: ((//div[@class='container'])[3]//ul)[1]
	Eg: ((//div[@class='container'])[3]//ul)[5]
	
	Eg: (//input[@type='text'])[3]
	Eg: (//input[@type='text'])[position()=3]
	Eg: (//input[@type='text'])[2]
	Eg: (//input[@type='text'])[last()]
	Eg: ((//div[@class='navFooterVerticalRow navAccessibility']//ul)[last()]//a)[last()]
*/
//How to Traverse towards Parents/Back/Left in HTML Dom . . . ?
/**
=> Use--> parent:: OR /..
=> Use--> preceding-sibling:: 
   For eg. //a[text()='Evening Dresses']/parent::label/preceding-sibling::div
   
=> Use--> child:: OR /
=> Use--> following-sibling::

=> Use--> ancestor::
   For eg. //a[text()='Evening Dresses']/ancestor::div
   It will give you all "div" ancestors and you can reach there 1 by 1 */ 
  
// SVG XPath: This has it's Unique Formula
/**
=> Use Parent(svg) tag as by "local-name"
 	and Child tag by "name"
 	
=> Formula: //*[local-name()='tag(svg'] for adding child: Use ~~> //*[name()='child tag']
   	
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
