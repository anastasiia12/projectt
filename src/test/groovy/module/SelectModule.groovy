package module

import geb.Module
import geb.module.Select

class SelectModule extends Module {

    static content = {

        selectValueInFieldSortBy(wait: 10) { $(name: "sort_by", 0).module(Select) }

    }
}
