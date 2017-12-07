package com.thoughtworks.binding.website

import com.thoughtworks.binding.dom
import com.thoughtworks.binding.Binding.Vars

object Hello extends Sample {

  @dom
  override def render = {
    val logs = Vars("Hello", "Binding.scala")
    <div>
      { logs.map{<div>{ _.bind }</div>}  }
    </div>
  }

}
