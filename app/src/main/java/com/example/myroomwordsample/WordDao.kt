class WordDao {
    @Dao
    interface WordDao {

//        @Query("SELECT * FROM word_table ORDER BY word ASC")
//        fun getAlphabetizedWords(): List<Word>
        @Query("SELECT * FROM word_table ORDER BY word ASC")
        fun getAlphabetizedWords(): Flow<List<Word>>

        @Insert(onConflict = OnConflictStrategy.IGNORE)
        suspend fun insert(word: Word)

        @Query("DELETE FROM word_table")
        suspend fun deleteAll()
    }
}