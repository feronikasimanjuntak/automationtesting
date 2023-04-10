* Setting *
Library    SeleniumLibrary

* Test Cases *
TestCaseOne_EditProfile
    Log    Test using valid edit name
    Open Browser    https://foodspot.co.id/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    username    suga@gmail.com     
    Input Password    password    12345678
    Click Button    submit 
    Click Element    //*[@id="dataUserLogin"]/img
    Click Element    //*[@id="datauser01"]/div[2]/div[2]/a[1]/div
    Click Element    xpath:/html/body/section[2]/div/div/div/div[2]/div[1]/div/div[2]/span
    Clear Element Text     customer_name 
    Input Text    customer_name    agustd
    Click Button    //*[@id="myModalAkuBio"]/div/div/div[3]/button[2]
    Sleep    50
    Close Browser
    Log    Test Completed
   
TestCaseTwo_EditProfile
    Log    Test using empty name
    Open Browser    https://foodspot.co.id/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    username    suga@gmail.com     
    Input Password    password    12345678
    Click Button    submit 
    Click Element    //*[@id="dataUserLogin"]/img
    Click Element    //*[@id="datauser01"]/div[2]/div[2]/a[1]/div
    Click Element    xpath:/html/body/section[2]/div/div/div/div[2]/div[1]/div/div[2]/span
    Clear Element Text     customer_name 
    Click Button    //*[@id="myModalAkuBio"]/div/div/div[3]/button[2]
    Sleep    50
    Close Browser
    Log    Test Completed