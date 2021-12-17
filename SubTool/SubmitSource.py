from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.keys import Keys
import shutil
import os

id = input()
id = id.upper()
base_dir = 'E:\hk12021\oop\code\\' + id
submit_dir = 'E:\hk12021\oop\submit\\'+ id
shutil.make_archive(submit_dir, 'zip', base_dir)

url = "https://code.ptit.edu.vn/student/question/" + id

browser = webdriver.Chrome(ChromeDriverManager().install())
browser.get(url)

# Submit:
username = browser.find_element_by_id('login__user')
password = browser.find_element_by_id('login__pw')
username.send_keys('B19DCCN333')
password.send_keys('h001201023360')
password.send_keys(Keys.RETURN)
browser.get(url)
browser.find_element_by_id('fileInput').send_keys(submit_dir + '.zip')
browser.find_element_by_class_name('submit__pad__btn').click()
