*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***
TestCaseOne_AddAddress
    Log    Test add address with valid input
    Open Browser    https://foodspot.co.id/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    username    suga@gmail.com     
    Input Password    password    12345678
    Click Button    submit 
    Click Element    //*[@id="dataUserLogin"]/img
    Click Element    //*[@id="datauser01"]/div[2]/div[2]/a[2]/div
    Click Element    tambah_alamat
    Input Text    addr_tag    Rumah
    Input Text    addr_phone    +62 00880
    Input Text    addr_contact_name    Suga
    Input Text    addr_building    Jalan Mulia Raja
    Input Text    addr_content    Jalan Mulia Raja Balige
    Click Button    tambahalamatbtn
    Sleep    50
    Close Browser
    Log    Test Completed
    
TestCaseTwo_AddAddress
    Log    Test add address with empty tipe alamat
    Open Browser    https://foodspot.co.id/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    username    suga@gmail.com     
    Input Password    password    12345678
    Click Button    submit 
    Click Element    //*[@id="dataUserLogin"]/img
    Click Element    //*[@id="datauser01"]/div[2]/div[2]/a[2]/div
    Click Element    tambah_alamat
    Input Text    addr_phone    +62 00880
    Input Text    addr_contact_name    Suga
    Input Text    addr_building    Jalan Mulia Raja
    Input Text    addr_content    Jalan Mulia Raja Balige
    Click Button    tambahalamatbtn
    Sleep    50
    Close Browser
    Log    Test Completed
    
TestCaseThree_AddAddress
    Log    Test add address with empty nomor telepon
    Open Browser    https://foodspot.co.id/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    username    suga@gmail.com     
    Input Password    password    12345678
    Click Button    submit 
    Click Element    //*[@id="dataUserLogin"]/img
    Click Element    //*[@id="datauser01"]/div[2]/div[2]/a[2]/div
    Click Element    tambah_alamat
    Input Text    addr_tag    Rumah
    Input Text    addr_contact_name    Suga
    Input Text    addr_building    Jalan Mulia Raja
    Input Text    addr_content    Jalan Mulia Raja Balige
    Click Button    tambahalamatbtn
    Sleep    50
    Close Browser
    Log    Test Completed
    
TestCaseFour_AddAddress
    Log    Test add address with empty nama penerima
    Open Browser    https://foodspot.co.id/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    username    suga@gmail.com     
    Input Password    password    12345678
    Click Button    submit 
    Click Element    //*[@id="dataUserLogin"]/img
    Click Element    //*[@id="datauser01"]/div[2]/div[2]/a[2]/div
    Click Element    tambah_alamat
    Input Text    addr_tag    Rumah
    Input Text    addr_phone    +62 00880
    Input Text    addr_building    Jalan Mulia Raja
    Input Text    addr_content    Jalan Mulia Raja Balige
    Click Button    tambahalamatbtn
    Sleep    50
    Close Browser
    Log    Test Completed
    
TestCaseFive_AddAddress
    Log    Test add address with empty nama gedung
    Open Browser    https://foodspot.co.id/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    username    suga@gmail.com     
    Input Password    password    12345678
    Click Button    submit 
    Click Element    //*[@id="dataUserLogin"]/img
    Click Element    //*[@id="datauser01"]/div[2]/div[2]/a[2]/div
    Click Element    tambah_alamat
    Input Text    addr_tag    Rumah
    Input Text    addr_phone    +62 00880
    Input Text    addr_contact_name    Suga
    Input Text    addr_content    Jalan Mulia Raja Balige
    Click Button    tambahalamatbtn
    Sleep    50
    Close Browser
    Log    Test Completed
    
TestCaseSix_AddAddress
    Log    Test add address with empty alamat lengkap
    Open Browser    https://foodspot.co.id/login    chrome
    Set Selenium Implicit Wait    5
    Sleep    3
    Input Text    username    suga@gmail.com     
    Input Password    password    12345678
    Click Button    submit 
    Click Element    //*[@id="dataUserLogin"]/img
    Click Element    //*[@id="datauser01"]/div[2]/div[2]/a[2]/div
    Click Element    tambah_alamat
    Input Text    addr_tag    Rumah
    Input Text    addr_phone    +62 00880
    Input Text    addr_contact_name    Suga
    Input Text    addr_building    Jalan Mulia Raja
    Click Button    tambahalamatbtn
    Sleep    50
    Close Browser
    Log    Test Completed