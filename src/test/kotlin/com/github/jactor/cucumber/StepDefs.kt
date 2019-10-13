package com.github.jactor.cucumber

import io.cucumber.java.no.Gitt
import io.cucumber.java.no.Så
import io.cucumber.java.no.Når
import org.assertj.core.api.Assertions.assertThat

fun erDetFredag(dagen: String): String {
    if (dagen == "fredag") {
        return "jada, helg"
    }

    return "neida"
}

class StepDefs {
    private lateinit var dagen: String
    private lateinit var svaret: String

    @Gitt("dagen er søndag")
    fun `dagen er sondag`() {
        dagen = "søndag"
    }

    @Gitt("dagen er fredag")
    fun `dagen er fredag`() {
        dagen = "fredag"
    }

    @Gitt("dagen er {string}")
    fun `dagen er`(dagen: String) {
        this.dagen = dagen
    }

    @Når("jeg spør om det er fredag")
    fun `jeg spor om det er fredag`() {
        svaret = erDetFredag(dagen)
    }

    @Så("er svaret {string}")
    fun `er svaret`(svaret: String) {
        assertThat(svaret).isEqualTo(svaret)
    }
}
