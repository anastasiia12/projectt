package pages

import geb.Page
import module.SelectModule

class BathPanelsPage extends Page {

    static at = { $("div.h1wrapper").text() == "BATH PANELS (15 products)" }

    static content = {

        selectModule { module(SelectModule) }

        firstProductInTheTable(wait: true) {$(id: "product_description_1")}

     }
}
