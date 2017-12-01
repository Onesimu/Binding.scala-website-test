package com.thoughtworks.binding.website

import com.thoughtworks.binding.Binding.{ Var, Vars }
import com.thoughtworks.binding.dom
import com.thoughtworks.binding.website.TableSample.Contact
import org.scalajs.dom.raw.Event
import org.scalajs.dom.html.Input

/**
 * @author 杨博 (Yang Bo) &lt;pop.atry@gmail.com&gt;
 */
object InputSample extends Sample {

  @dom
  override def render = {
    val value = Var("")
    <div>
      <input oninput={ event: Event => value := dom.currentTarget[Input].value }/>
      Your input value is { value.bind }
    </div>
  }

}
