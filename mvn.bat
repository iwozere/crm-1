@echo off
setlocal

REM Maven wrapper script for CRM project
REM Uses Maven installation at c:\dev\apps\apache-maven-3.9.12\
REM Configured with corporate proxy and forced central repo to avoid SSL issues

set MAVEN_HOME=c:\dev\apps\apache-maven-3.9.12
set PATH=%MAVEN_HOME%\bin;%PATH%

REM Execute Maven with all passed arguments, forcing central repo only
"%MAVEN_HOME%\bin\mvn.cmd" -Dmaven.repo.remote=https://repo.maven.apache.org/maven2 %*

endlocal