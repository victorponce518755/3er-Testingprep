package alanis.jorge.testingprep

object RegistrationUtil {
    // funcion que valida si el usuario es valido, le doy click derecho a la clase y generate y test, la genera en la de hasta abajoo, la carpteta
    // Los archivos de la izquierda que dicen test, el de hasta abajo corre prueba de bajo nivel
    // el de arriba corre prueba de alto nivel , es decir de ui


    //1.Nos vamos al archivo que se creo de hasta abajo
    private val existingUsers = listOf("Pedro", "Juan")//lista de usuarios existentes

    /**
     * username / pass empty
     * username is already taken
     * confirmed password is not same as real password
     * password contains less than 6 digits
     *
     */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean{//codifico todos resultados de los casos de prueba y en el anterior declaro todos los escenarios
        if(username.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()){
            return false
        }
        if(username in existingUsers){
            return false
        }
        if(password != confirmedPassword){
            return false
        }
        if(password.count() < 6){
            return false
        }
        return true

    }
}

// terminandolas pruebas unitarias, vamos a hacer las pruebas de integracion, es decir de alto nivel con expresso