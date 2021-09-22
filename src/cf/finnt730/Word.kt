package cf.finnt730

data class Word(val _word: Array<Char>) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Word
        if (!_word.contentEquals(other._word)) return false

        return true
    }

    override fun hashCode(): Int {
        return _word.contentHashCode()
    }
}
