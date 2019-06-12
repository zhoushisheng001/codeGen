@echo off
Title=codeGen Clean
RD /S /q %cd%"\out"
mkdir out
echo 已清理
echo 按任意健继续.....
pause >nul