Created a Automation testing project for login page by using selenium automation tool and java programming launguage and chrome webdriver 
and used maven project because as it more compatibility tha normal java project instead of sending selenium jars ,adding dependencies in pom file of maven project ..
Here i used a pageobjectmodel its way to sepearte the webpage description and test logic we use this because ,,for every change in webpage,we have to change the code of our tests only in one place.
can u imagine changing one elemnt on a webpage that 10 or 100 tests depends on ? That it is a time consuming work that increases the cost of code maintanenceand 
it is a great obstacle for implementing automated tests in the early stages of agile project.
so we use this page object model .
First I created a class named Seleniumloginpage and in that class i declared variables with findby annaotation that xpath denotes loacators directly to node of webelements.
And then created variables with locators 
And then methods to interact with the variables and webelements
And then created a test page and imported logininpage and attached webdriver and given link and then @before @test @test @test @after created which automatically logins the page by selenium.
