package module

import geb.Module
import geb.module.TextInput

class TextInputModule extends Module {

    static content = {
        // search field
        inputTextInSearchField(required: false, wait: true) { $("input", id: "mainSearch-input").module(TextInput) }
    }
}
