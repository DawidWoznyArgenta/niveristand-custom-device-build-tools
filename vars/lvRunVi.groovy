def call(vi, lvVersion){
   echo "Running Compiling $vi."
   def logFileName = getLogName(vi)
   labviewcli("-OperationName SecureRunVI -VIPath \"$WORKSPACE\\$vi\" -LogFilePath \"$WORKSPACE\\lvRunVi_${logFileName}.log\"", lvVersion)
}
