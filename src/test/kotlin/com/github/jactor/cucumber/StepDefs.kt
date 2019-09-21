package com.github.jactor.cucumber

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.assertj.core.api.Assertions.assertThat

fun isItFriday(today: String): String {
    if (today == "Friday") {
        return "TGIF"
    }

    return "Nope"
}

class StepDefs {
    private lateinit var today: String
    private lateinit var actualAnswer: String

    @Given("today is Sunday")
    fun today_is_Sunday() {
        today = "Sunday"
    }

    @Given("today is Friday")
    fun today_is_Friday() {
        today = "Friday"
    }

    @Given("today is {string}")
    fun today_is(today: String) {
        this.today = today
    }

    @When("I ask whether it's Friday yet")
    fun i_ask_whether_it_s_Friday_yet() {
        actualAnswer = isItFriday(today)
    }

    @Then("I should be told {string}")
    fun i_should_be_told(answer: String) {
        assertThat(actualAnswer).isEqualTo(answer)
    }
}
