from setuptools import setup
setup(name="systeminfo",
      version="0.1",
      description="Basic system information for COMP30670",
      url="",
      author="aonghus lawlor",
      author_email="aonghus.lawlor@ucd.ie",
      licence="GPL3",
      PACAGES=['systeminfo'],
      entry_points={
          'console_scripts':['com30670_systeminfo=systeminfo.main:main']})
