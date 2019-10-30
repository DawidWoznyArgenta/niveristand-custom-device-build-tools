def call(vi, lvVersion){
   echo "Mass Compiling $vi."
   def logFileName = getLogName(vi)
   labviewcli("-OperationName SecureRunVI -VIPath \"$WORKSPACE\\$vi\" -LogFilePath \"$WORKSPACE\\lvRunVi_${logFileName}.log\"", lvVersion)
}
