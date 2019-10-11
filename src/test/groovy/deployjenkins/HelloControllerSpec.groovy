package deployjenkins

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class HelloControllerSpec extends Specification implements ControllerUnitTest<HelloController> {

    def setup() {
    }

    def cleanup() {
    }

    void "index loads"() {
        controller.index()
        assert response.text == 'Hello World!'
    }
}
