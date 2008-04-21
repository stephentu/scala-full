package scala.swing.test

import event._

class SimpleApplet extends Applet {
  object ui extends UI with Reactor {
    def init() = {
      val button = new PushButton("Press here!")
      val text = new TextArea("Java Version: " +
                System.getProperty("java.version")+"\n")
      listenTo(button)
      reactions += {
        case ButtonClicked(_) => text.text += "Button Pressed!\n"
        case _ =>
      }
      contents = new BoxPanel(Orientation.Vertical) { contents.append(button, text) }
    }
  }
} 