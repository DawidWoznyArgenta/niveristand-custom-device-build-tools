package ni.vsbuild.steps

import ni.vsbuild.BuildConfiguration

class LvRunVIAnalyzerStep extends LvStep {

   def vi

   LvRunVIAnalyzerStep(script, mapStep, lvVersion) {
      super(script, mapStep, lvVersion)
      this.vi = mapStep.get('vi')
   }

   void executeStep(BuildConfiguration configuration) {
      script.lvRunVIAnalyzer(vi, lvVersion)
   }
}
