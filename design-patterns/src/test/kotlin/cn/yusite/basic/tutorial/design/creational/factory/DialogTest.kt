package cn.yusite.basic.tutorial.design.creational.factory

import org.junit.Before
import org.junit.Test

class DialogTest {
    private var dialog: Dialog? = null
    @Before
    fun configure() {
        println(System.getProperty("os.name"))
        dialog = HtmlDialog()
    }

    @Test
    fun testDialog() {
        dialog!!.renderWindow()
    }
}