@echo off
Title=codeGen

SetLocal EnableDelayedExpansion  
set cp=.
rem set cp=%CLASSPATH%
  
FOR %%i IN (".\lib\*.jar") DO SET cp=!cp!;%%~fsi

rem echo %cp%    

java -cp "%cp%" codegen.DBRun
EndLocal  

echo 按任意健继续.....
pause >nul