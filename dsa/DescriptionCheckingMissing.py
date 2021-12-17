import os
from subprocess import call
import time
from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.keys import Keys
from selenium.common.exceptions import NoSuchElementException
import io

missingDescriptionProjects = []
os.chdir('E:\hk12021\oop\dsa')
for dir in os.listdir():
    if not os.path.exists(".\\" + dir + "\\" + dir + ".txt"):
        missingDescriptionProjects.append(dir)
for ele in missingDescriptionProjects:
    print(ele)     
browser = webdriver.Chrome(ChromeDriverManager().install())
browser.get('https://code.ptit.edu.vn/login')
# Login:
username = browser.find_element_by_id('login__user')
password = browser.find_element_by_id('login__pw')
username.send_keys('B17DCCN087')
password.send_keys('Chinh123')
password.send_keys(Keys.RETURN)

for id in missingDescriptionProjects:
    base_dir = '.\\' + id
    url = "https://code.ptit.edu.vn/student/question/" + id
    # Get Content:
    browser.get(url)
    time.sleep(1)
    try:
        content = browser.find_element_by_class_name("submit__nav").text + '\n' + browser.find_element_by_class_name('submit__des').text
        content = str(content)
        time.sleep(2)
        # Generate:
        with io.open(base_dir + '\\' + id + '.txt', "w", encoding="utf-8") as f:
            f.write(content)
        f.close()
        print(id + ' done!')
        time.sleep(1)
    except NoSuchElementException:
        print('Server not have ' + id)

browser.close()
call(r"taskkill /im chromedriver.exe /f")
os.remove("temp.txt")