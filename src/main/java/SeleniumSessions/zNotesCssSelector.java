package SeleniumSessions;

public class zNotesCssSelector
{
/**
=> CSS is an Address/Path of an Element and Not an Attribute.

=> Types Of CSS

1) id: id--> #id OR tag#id
	Eg. id = username
	By.cssSelector("#username");
	By.cssSelector("input#username");
		
2) class: class--> .class OR tag.class
	By.cssSelector(".form-control");
	By.cssSelector("input.form-control");

3) If a class has Multiple Values: space --> .
	
	eg. --> class = form-control private-form__control login-email
	A)  c1 c2 c3 --> c1.c2.c3
		.form-control.private-form__control.login-email
 	B)	-->	tag.c1.c2.c3 
		input.form-control.private-form__control.login-email
	C)-->	tag#id.c1.c2.c3
		input#username.form-control.private-form__control.login-email
	D)	--> tag.c1.c2.c3#id
		input.form-control.private-form__control.login-email#username
				
4) By Using id & class:

	A) --> #id.class OR tag#id.class
		By.cssSelector("#email.form-control"); 
		By.cssSelector("input#email.form-control");
		
	B)--> .class#id OR tag.class#id
		By.cssSelector(".form-control#email");
		By.cssSelector("input.form-control#email");
		
5) In Absence of id & class:

	A)  i)  tag[attr='value']
	 	css--> input[name='Name']	XPath--> //input[@name='Name']
		ii) tag[attr='value'][attr='value']
		css--> input[name='Name'][type='text']
		
	B)  i)  tag[attr*='value'] --> Here * behaves as --> contains
	 	css--> input[id*='_Name']
		ii) tag[attr^='E-Mail'] --> Here ^ behaves as--> starts-with
		css--> input[placeholder^='E-Mail']
		iii) tag[attr$='value'] --> Here $ behaves as--> ends-with
		css--> input[placeholder$='Address'] --ends-with

6) parent To child:
		
		i) space following tag --> Direct+InDirect Child Elements
		eg. "https://app.hubspot.com/login" --> Inspect whole Form
		css--> form#hs-login div --> 20 All Child Elements
		ii) >following tag--> Direct Child Elements
		css--> form#hs-login>div --> 8 Direct Child Elements
		
7) following-sibling:
		i) +following tag --> following sibling
		css--> div.private-form__meta+small
		
8) comma in css:
		--> input#username, input#password, button#loginBtn, label#UIFormControl-label-4
		
		List<WebElement> formFields = driver.findElements(By.cssSelector("input#username, input#password, button#loginBtn, label#UIFormControl-label-4"));
		System.out.println(formFields.size());
		if(formFields.size()==4)
		{
			System.out.println("all imp fields are present on the page");
		}
		
		
9) nth-of-type: Indexing in css
		div.footer-main ul li:nth-of-type(2)
						     
10) Difference Between:		XPa				|	CSS
	
	1. child To parent		Yes				|	NA
	2. syntax 				Complex			|	Simple
	3. functions			Better			|	Limited
	4. text					Yes -- text()	|	NA
	5. backward TR.    		Yes				|	NA
	6. webtable				Better handling	|	Limited options 					
	7. performance      	Good			|	Good 					
	8. diff tag check   	NA				|	Comma
	9. attr validations 	Good			|	Better		
		
*/
}
