package algo

import com.strumenta.kotlinmultiplatform.isCharUppercase

fun main() {
    // Tu peux tester la fonction en l'appelant ici.
    racineCarre(10f)
}

/**
 * Tu dois faire un programme en Kotlin qui calcule la racine en base 2 d'un nombre, en te basant sur le pseudo-code fourni.
 *
 * (3 points) Tu dois traduire le pseudo-code fourni pour programmer la fonction racineCarre.
 * (1 point) Tu dois inclure toutes les annotations de type sur les variables.
 */
fun racineCarre(x: Float): Float {
    /*
        racineCarre(x qui est un nombre en virgule flottante)
          resultat est initialisé à 0,0
          Tant que (resultat + 1) * (resultat +1) est inférieur ou égal à x faire
                resultat++
          fin du tant que
          remplir un tableau appelé fractions avec les valeurs 0,1 puis 0,01 puis 0,001 puis 0,0001
          pour fraction dans fractions faire
              initialiser base avec la valeur de resultat
              pour chaque chiffre entre 0 et 9 inclus, faire
                  initialiser test avec la valeur de base + (fraction * chiffre)
                  si test multiplié par test est inférieur ou égal à x
                  alors on veut que resultat prenne la valeur de test
              fin du pour sur les chiffre

          fin du pour sur les fraction
          renvoyer resultat
     */
    var resultat : Float = 0.0f
    while((resultat + 1)*(resultat + 1) <= x){
        resultat++
    }
    var fractions : List<Float> = listOf(.1f,.01f,.001f,0.0001f)
    for(f in fractions){
        var base : Float = resultat
        for(chiffre : Int in 0..9 ){
            var test : Float = base + (f * chiffre)
            if(test * test <= x){
                resultat = test
            }
        }
    }
    println(resultat.toString())
    return resultat
}