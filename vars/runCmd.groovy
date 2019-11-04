def call(bat_cmd, lvVersion){
   echo "runing batch command $bat_cmd."
   echo %BUILD_NUMBER% > %WORKSPACE%\buildnumber.csv
}
