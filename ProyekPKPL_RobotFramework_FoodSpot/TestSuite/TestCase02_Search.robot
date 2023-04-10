*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
TestCaseOne_Search
    Log    Test using valid search
    Open Browser    https://foodspot.co.id/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username    testingpkpl@gmail.com     
    Input Password    password    12345678
    Click Button    submit 
    Sleep    3
    Input Text    //*[@id="click_input_menu1"]    kopi
    Click Element    //*[@id="price_range"]        
    Click Element    //*[@id="price_range"]/option[3]  
    Click Button    dontmove     
    Sleep    50
    Close Browser
    
TestCaseTwo_Search
    Log    Test using empty search and valid range price
    Open Browser    https://foodspot.co.id/login    chrome
    Set Selenium Implicit Wait    5
    Input Text    username    testingpkpl@gmail.com     
    Input Password    password    12345678
    Click Button    submit 
    Sleep    3
    Click Element    //*[@id="price_range"]        
    Click Element    //*[@id="price_range"]/option[3]  
    Click Button    dontmove     
    Sleep    50
    Close Browser
