package jpabon.com.countmein.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "users")
data class User(
    @PrimaryKey
    val id: Int,
    val userId: Int,
    val name: String,
    val dateCreated: String,
    val timeZone: TimeZone,
    val visibility: Int,
    val status: Int
)
