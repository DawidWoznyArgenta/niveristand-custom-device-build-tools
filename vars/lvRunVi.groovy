def call(vi, lvVersion){
   echo "Running $vi."
   def logFileName = getLogName(vi)
   labviewcli("-OperationName RunVI -VIPath \"$WORKSPACE\\$vi\" -LogFilePath \"$WORKSPACE\\lvRunVi_${logFileName}.log\"", lvVersion)
}
