IF EXIST parent (
cd parent
call mvnw clean -Dmaven.test.skip=true package
cd ..
)
call mvnw clean -Dmaven.test.skip=true package
rd /s/q dist\%1
mkdir dist\%1\cardone-authority\provider
xcopy provider\config dist\%1\cardone-authority\provider\config /Y/E/C/R/I
xcopy provider\config-%1 dist\%1\cardone-authority\provider\config /Y/E/C/R/I
xcopy provider\run*.* dist\%1\cardone-authority\provider /Y/C/R/I
xcopy provider\target\cardone-authority-provider-*.jar dist\%1\cardone-authority\provider /Y/C/R/I
mkdir dist\%1\cardone-authority\consumer
xcopy consumer\webapp dist\%1\cardone-authority\consumer\webapp /Y/E/C/R/I
xcopy consumer\views dist\%1\cardone-authority\consumer\views /Y/E/C/R/I
xcopy consumer\config dist\%1\cardone-authority\consumer\config /Y/E/C/R/I
xcopy consumer\config-%1 dist\%1\cardone-authority\consumer\config /Y/E/C/R/I
xcopy consumer\run*.* dist\%1\cardone-authority\consumer /Y/C/R/I
xcopy consumer\target\cardone-authority-consumer-*.jar dist\%1\cardone-authority\consumer /Y/C/R/I
rd /s/q dist\%1\cardone-authority\consumer\config\api\vx
del /s/q *.log
del /s/q *.lock