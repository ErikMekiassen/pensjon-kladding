package samordningsoppgjoer


import com.google.inject.Inject
import io.cucumber.java.After
import io.cucumber.java.Before
import io.cucumber.java.no.Gitt
import io.cucumber.java.no.Så
import io.cucumber.java.no.Når
import org.junit.jupiter.api.Assertions.assertEquals
import java.math.BigInteger
import io.cucumber.java.Scenario
import org.slf4j.LoggerFactory

class SamordningsoppgjoerKalkulatorSteps @Inject constructor(private val samordningsoppgjoerKalkulator: SamordningsoppgjoerKalkulator) {
    private val log = LoggerFactory.getLogger(SamordningsoppgjoerKalkulatorSteps::class.java)

    private lateinit var kalkulator: SamordningsoppgjoerKalkulator
    private var resultat: BigInteger = BigInteger.ZERO
    private var garantiPensjonsnivaa: BigInteger = BigInteger.ZERO
    private var trygdeTid: BigInteger = BigInteger.ZERO
    private var pensjonsbeholdning: BigInteger = BigInteger.ZERO

    @Before
    fun setupScenario(scenario: Scenario) = log.info("Before scenario: {}", scenario.name)

    @After
    fun tearDownScenario(scenario: Scenario) = log.info("After scenario: {}", scenario.name)

    @Gitt("garantipensjonsnivå er {int}")
    fun setGarantipensjonsnivaa(value: Int) {
        garantiPensjonsnivaa = BigInteger.valueOf(value.toLong())
    }

    @Gitt("trygdetid er {int}")
    fun setTrygdeTid(value: Int) {
        trygdeTid = BigInteger.valueOf(value.toLong())
    }

    @Gitt("pensjonsbeholdning er {int}")
    fun setPensjonsbeholdning(value: Int) {
        pensjonsbeholdning = BigInteger.valueOf(value.toLong())
    }

    @Når("jeg beregner pensjonen")
    fun calculatePensjon() {
        kalkulator = SamordningsoppgjoerKalkulator()
        println("ahduheasf " + kalkulator.beregnPensjon(garantiPensjonsnivaa, trygdeTid, pensjonsbeholdning))
        resultat = kalkulator.beregnPensjon(garantiPensjonsnivaa, trygdeTid, pensjonsbeholdning)
    }

    @Så("resultatet skal være {double}")
    fun verifyResult(expected: Double) {
        assertEquals(0, resultat.toInt())
    }
}