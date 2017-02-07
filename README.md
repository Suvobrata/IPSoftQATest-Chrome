# IPSoftQATest-Chrome
This application will run the automated test in Google Chrome Browser.It will open up www.wikipedia.org and click on the 'English'
link and check whether it is on the English version.
Serenity-Jbehave-archetype is used for the automation process.
The serenity application binds firefox on its own.To use it on other browsers we need to download the driver and refer them in properties file.
For the application to run on Chrome, one needs to download the chrome driver.The following link is the most recent one which I have used.
 - https://sites.google.com/a/chromium.org/chromedriver/downloads
 
 To run the application:
 1.Clone/download the project into your local repository.
 2.Import the project into an IDE(I have used Eclipse).
 3.Open the serenity.properties file.
 4.On the line -- webdriver.chrome.driver = C:\\Users\\Suvo\\chromedriver.exe, you have to redirect to the location where the chromedriver.exe
 file is downloaded(The link is mentioned above).
 5.After a clean build, right click on the project and run the application as JUnit tests.
 6.It will start up, and test the test cases in Google Chrome browser.
