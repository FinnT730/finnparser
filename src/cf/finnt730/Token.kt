package cf.finnt730

enum class Token {
    T_eof, T_open, T_close, T_plus, T_exclamation, T_null, T_var, T_equals;

    companion object {
        fun getInstance(token: Token): Token {
            return token
        }
    }
}