package pages

import geb.Page
import module.TextInputModule

class MainPage extends Page {

    static at = { title == 'Screwfix.com | The UK’s number 1 trade catalogue | Screwfix Website' }

    static content = {
        textInput { module(TextInputModule) }

        buttonSearch(required: false, wait: 7) {
           $("input", title: "Search")
        }

        textInSearchField(required: false, wait: true) { ${"#mainSearch-input"} }
    }

    void clickOnSearchButton() {
        buttonSearch.click()
        waitFor { js.exec("return jQuery.active == 0") == true }
    }
}