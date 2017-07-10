package org.jetbrains.plugins.cbt.runner

import javax.swing.Icon

import com.intellij.execution.configurations.{ConfigurationFactory, ConfigurationType}
import org.jetbrains.sbt.Sbt

class CbtConfigurationType extends ConfigurationType {
  val confFactory = new CbtRunConfigurationFactory(this)

  def getIcon: Icon = Sbt.Icon

  def getDisplayName: String = "CBT Task"

  def getConfigurationTypeDescription: String = "Run CBT Task"

  def getConfigurationFactories: Array[ConfigurationFactory] = Array[ConfigurationFactory](confFactory)

  def getId: String = "CbtRunConfiguration"
}

object CbtConfigurationType {
  def getInstance = new CbtConfigurationType
}