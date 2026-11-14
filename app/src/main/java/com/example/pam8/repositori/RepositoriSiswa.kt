package com.example.pam8.repositori

import com.example.pam8.room.Siswa
import com.example.pam8.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream() : Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

