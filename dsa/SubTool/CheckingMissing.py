import os
from subprocess import call
import time

missingDescriptionProjects = []
os.chdir('E:\hk12021\oop\dsa')
for dir in os.listdir():
    if dir[0] == 'J' and not os.path.exists(".\\" + dir + "\\" + dir + ".txt"):
        missingDescriptionProjects.append(dir)
for project in missingDescriptionProjects:
    call(r'python .\SubTool\GenSource.py ' + project)
    call(r"taskkill /im notepad.exe")
    time.sleep(1)
call(r"taskkill /im chromedriver.exe /f")
os.remove("temp.txt")