package burp

class BurpExtender : IBurpExtender {

    companion object {
        val test = IBurpExtenderCallbacks.TOOL_SUITE.toString()
    }

    override fun registerExtenderCallbacks(callbacks: IBurpExtenderCallbacks) {
        callbacks.printOutput(test)
    }
}

fun main(args : Array<String>) {
  println(BurpExtender.test)
}

