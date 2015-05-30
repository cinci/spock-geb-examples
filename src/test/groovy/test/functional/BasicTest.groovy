package test.functional

import geb.spock.GebSpec
import page.IndexPage

/**
 * Created by jc on 30. 5. 2015.
 */
class BasicTest extends GebSpec {
    def "application is up and running"() {
        when:
        to IndexPage

        then:
        pageContent.text() == "It works!"
    }

}
