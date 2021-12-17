from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.keys import Keys
import io
import os
import time
import sys

id = ''
if len(sys.argv) > 1:
    id = sys.argv[1]
else:
    id = input()
id = id.upper()
base_dir = 'E:\hk12021\oop\dsa\\' + id
if not os.path.exists(base_dir):
    print("\n\nTHIS PROJECT DOES NOT EXIST YET!")
    os.system("pause")
else:
    url = "https://code.ptit.edu.vn/student/question/" + id

    browser = webdriver.Chrome(ChromeDriverManager().install())
    browser.get(url)

    # Login:
    username = browser.find_element_by_id('login__user')
    password = browser.find_element_by_id('login__pw')
    username.send_keys('B17DCCN087')
    password.send_keys('Chinh123')
    password.send_keys(Keys.RETURN)

    # Get Content:
    browser.get(url)
    content = browser.find_element_by_class_name("submit__nav").text + '\n' + browser.find_element_by_class_name('submit__des').text
    content = str(content)
    time.sleep(2)
    browser.close()

    # Generate:
    with io.open(base_dir + '\\' + id + '.txt', "w", encoding="utf-8") as f:
        f.write(content)
    f.close()

    # Checking:
    os.startfile(base_dir + '\\' + id + '.txt')