package org.gc

import com.formdev.flatlaf.FlatLightLaf
import net.miginfocom.swing.MigLayout
import javax.swing.*

class UI: JPanel(MigLayout()) {
    init {
        // TODO
    }
}
fun main() {
    FlatLightLaf.setup()
    SwingUtilities.invokeLater {
        val menuBar = JMenuBar()
        val file = JMenu("File")
        val new = JMenuItem("New")
        // TODO: add action listener
        val open = JMenuItem("Open")
        // TODO: add action listener
        val save = JMenuItem("Save")
        // TODO: add action listener
        val saveAs = JMenuItem("Save As")
        // TODO: add action listener
        file.add(new)
        file.add(open)
        file.add(save)
        file.add(saveAs)
        val code = JMenu("Code")
        val changeTarget = JMenuItem("Change Target")
        // TODO: add action listener
        val manageMods = JMenuItem("Manage Mods")
        // TODO: add action listener
        code.add(changeTarget)
        code.add(manageMods)
        menuBar.add(file)
        menuBar.add(code)

        val frame = JFrame("GraphCode")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.contentPane = UI()
        frame.jMenuBar = menuBar
        frame.setSize(800, 600)
        frame.isVisible = true
    }
}