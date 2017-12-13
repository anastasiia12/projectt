package tests

import geb.spock.GebReportingSpec
import pages.BathPanelsPage
import pages.MainPage

class CheckBathPanelsPageTest extends GebReportingSpec {

    def "go to the BATH PANELS, select value in sort by, check that product is sorted"() {
        when:
        to MainPage

        and:
        textInput.inputTextInSearchField = "BATH PANELS"

        then:
        assert textInput.inputTextInSearchField.present

        when:
        buttonSearch.click()

        then:
        assert buttonSearch.isDisplayed()
        at BathPanelsPage

        when:
        selectModule.selectValueInFieldSortBy.setSelected("Price - Low to High")
        waitFor { js.exec("return jQuery.active == 0") == true }

        then:
        assert firstProductInTheTable.text() == 'rove Bath End Panel-To-Go Acrylic 720mm White'
    }
}
