package br.com.ggdio

/**
 * A simple helloworld in kotlin
 *
 * @param recipient the name of the recipient for the heloworld
 */
class HelloWorld(private val recipient: String) {

	/**
	 * Says hello to the recipient
	 */
	fun sayHello() {
		println(recipient.wrapWithHello())
	}
	
	/**
	 * Says goodbye to the subject
	 */
	fun sayGoodbye() {
		println(recipient.wrapWithGoodbye())
	}
	
	/**
	 * String extension function that wrapps the value with a Hello prefix
	 * @return enriched String
	 */
	fun String.wrapWithHello(): String {
		return "Hello, " + this + "!";
	}
	
	/**
	 * String extension function that wrapps the value with a Good Bye prefix
	 * @return enriched String
	 */
	fun String.wrapWithGoodbye(): String {
		return "Good bye, " + this + "!";
	}
	
}