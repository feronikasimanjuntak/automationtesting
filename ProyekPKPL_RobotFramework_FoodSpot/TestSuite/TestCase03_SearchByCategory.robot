*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
TestCaseOne_SearchByCategory
    Log    Test using valid search
    Open Browser    https://foodspot.co.id/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username    testingpkpl@gmail.com     
    Input Password    password    12345678
    Click Button    submit 
    Sleep    3
    Click Element    xpath:/html/body/section[1]/div[3]/div[1]/div/div/div[1]/div/div/div/a[2]/div/div/div/div[1]/img       
    Click Element    //*[@id="filterhide"]/form/div[3]/div[2]
    Click Element    //*[@id="10"]        
    Click Element    //*[@id="138"]  
    Click Element    //*[@id="sortby"]/option[3]
    Click Button    sidecaribtn     
    Sleep    50
    Close Browser
    Log    Test Completed
    