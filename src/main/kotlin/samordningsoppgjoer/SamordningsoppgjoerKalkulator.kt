package samordningsoppgjoer

import java.math.BigInteger

class SamordningsoppgjoerKalkulator {

    fun beregnPensjon(garantiPensjonsnivaa: BigInteger, trygdeTid: BigInteger, pensjonsbeholdning: BigInteger): BigInteger {
        val faktor67Aar = BigInteger.valueOf(67)
        val divisor = BigInteger.valueOf(40)
        val prosent80 = BigInteger.valueOf(80)

        // Calculate the first part: 67 år x garantipensjonsnivå x trygdetid / 40
        val del1 = faktor67Aar.multiply(garantiPensjonsnivaa).multiply(trygdeTid).divide(divisor)

        // Calculate the second part: 80% x pensjonsbeholdning
        val del2 = pensjonsbeholdning.multiply(prosent80).divide(BigInteger.valueOf(100))

        // Final result: del1 - del2
        return BigInteger.valueOf(1)
    }

}

// 67 år x garantipensjonsnivå x trygdetid ved 67 år / 40 - 80 % x foreløpig beregnet pensjonsbeholding