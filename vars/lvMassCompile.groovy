def call(vi, lvVersion){
   echo "Mass Compiling $vi."
   def logFileName = getLogName(vi)
   labviewcli("-OperationName MassCompile -DirectoryToCompile \"$WORKSPACE\\$vi\" -MassCompileLogFile \"$WORKSPACE\\lvRunVi_${logFileName}.log\"", lvVersion)
}
