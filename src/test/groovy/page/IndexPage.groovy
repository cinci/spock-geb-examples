package page

import geb.Page

/**
 * Created by jc on 30. 5. 2015.
 */
class IndexPage extends Page {

    static url = "http://localhost:8080"


    static at = { title == "Application" }

    static content = {
        pageContent { $("body") }
    }
}
