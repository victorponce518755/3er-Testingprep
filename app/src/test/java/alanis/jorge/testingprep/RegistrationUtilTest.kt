package alanis.jorge.testingprep

//hay que hacer todos estos imports
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.Assert.assertFalse

class RegistrationUtilTest{
    @Test//marcamos que es un test
    fun emptyUsername() {//caso de username vacio
        val result = RegistrationUtil.validateRegistrationInput(
            username = "",
            password = "123456",
            confirmedPassword = "123456"
        )
        assertThat(result).isFalse()//reviso el resultado, me deberia regresar falso, en caso de que me de un usuario vacio
    }

    @Test
    fun validUsername() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Jorge",
            password = "123456",
            confirmedPassword = "123456"
        )
        assertThat(result).isTrue()//aqui le damos trus en caso de que sea correcto
    }

    @Test
    fun existingUsername() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Pedro",
            password = "123456",
            confirmedPassword = "123456"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun mismatchPassword() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Jorge",
            password = "abcdef",
            confirmedPassword = "123456"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun emptyPassword() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Jorge",
            password = "",
            confirmedPassword = ""
        )
        assertThat(result).isFalse()
    }


    @Test
    fun incompletePassword() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Jorge",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }

}
