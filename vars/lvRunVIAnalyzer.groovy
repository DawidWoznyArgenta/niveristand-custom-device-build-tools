def call(vi, lvVersion){
   echo "Running VI Analyzer $vi."
   def logFileName = getLogName(vi)
   labviewcli("-OperationName RunVIAnalyzer -ConfigPath \"$WORKSPACE\\$vi\" -ReportPath \"$WORKSPACE\\lvRunVi_${logFileName}.log\"", lvVersion)
}
