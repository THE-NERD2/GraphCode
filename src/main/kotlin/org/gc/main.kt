package org.gc

import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.SwingUtilities

class UI: JPanel() {
    init {
        // TODO
    }
}
fun main() = SwingUtilities.invokeLater {
    val frame = JFrame("GraphCode")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.contentPane = UI()
    frame.setSize(800, 600)
    frame.isVisible = true
}