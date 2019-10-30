package ni.vsbuild.steps

import ni.vsbuild.BuildConfiguration

class LvMassCompileStep extends LvStep {

   def vi

   LvMassCompileStep(script, mapStep, lvVersion) {
      super(script, mapStep, lvVersion)
      this.vi = mapStep.get('vi')
   }

   void executeStep(BuildConfiguration configuration) {
      script.lvMassCompile(vi, lvVersion)
   }
}
