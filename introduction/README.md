"# AutomationQA" 
1. Install Java jdk17
2. Configure Java path in system variables(Copy the java home path [C:\Program Files\Java\jdk-17] then right click on computer ->Advanced system setting ->Environment Variables ->System variables New -> Fill Variable Name(JAVA_HOME) &Variable Value(C:\Program Files\Java\jdk-17) ->ok)
3. Install Eclipse(Eclipse IDE 2021 06 Package for Java Developers)
4. Create new Eclipse project(Open Eclipse ->Give path [C:\Users\HP\eclipse-workspaceNew] -> Launch ->File -> New -> Java Project -> Project Name -> Next -> Finish)
5. Download Selenium jars(https://maven.apache.org -> Selenium Java latest version) 
6. Configure Selenium jars in project build path(download selenium jars from maven repository and add in project)
7. Choose browser to run(Chrome browser)
8.  Download chromedriver(for windows chromedriver.exe will be downloaded)
9. Put the chromedriver.exe path in webdriver.chrome.driver[here path is C:\\Users\\HP\\AppData\\Local\\Temp\\Rar$EX00.109\\chromedriver.exe]
10. Set system property of the browser(System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\AppData\\Local\\Temp\\Rar$EX00.109\\chromedriver.exe");)
11. Create driver object based on driver choosen(WebDriver driver=new ChromeDriver();) [here object is driver]
12. Invoke the desirable site(driver.get("https://www.demoblaze.com");)
For login / sign you need to change user name and password . 
