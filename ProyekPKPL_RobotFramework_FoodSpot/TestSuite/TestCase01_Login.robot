*** Setting ***
Library    SeleniumLibrary

*** Test Cases ***
TestCaseOneLogin
   Log    Test Login with Valid Credentials
   Open Browser    https://foodspot.co.id/login    chrome
   Set Selenium Implicit Wait    5
   Sleep    3
   Input Text    username    suga@gmail.com     
   Input Password    password    12345678
   Click Button    submit 
   Sleep    50
   Close Browser
   Log    Test Completed
   
TestCaseTwoLogin
   Log    Test Login with Invalid Email
   Open Browser    https://foodspot.co.id/login    chrome
   Set Selenium Implicit Wait    5
   Sleep    3
   Input Text    username    massuga00@gmail.com     
   Input Password    password    12345678
   Click Button    submit 
   Sleep    50
   Close Browser
   Log    Test Completed
   
TestCaseThreeLogin
   Log    Test Login with Invalid Password
   Open Browser    https://foodspot.co.id/login    chrome
   Set Selenium Implicit Wait    5
   Sleep    3
   Input Text    username    suga@gmail.com     
   Input Password    password    12345678abc
   Click Button    submit 
   Sleep    50
   Close Browser
   Log    Test Completed
   
TestCaseFourLogin
   Log    Test Login with Empty Password
   Open Browser    https://foodspot.co.id/login    chrome
   Set Selenium Implicit Wait    5
   Sleep    3
   Input Text    username    suga@gmail.com     
   Click Button    submit 
   Sleep    50
   Close Browser
   Log    Test Completed