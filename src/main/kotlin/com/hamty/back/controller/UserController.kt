package com.hamty.back.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

data class Transaction(val id: Int, val store: String,val storeId: Int,val date: LocalDateTime, val order: Int,val cashback: Double,val price: Double,val status: String)

data class User(val id: Int, val name: String,private val pass: String, val transactions: List<Transaction>)


@RestController(value = "user")
class UserController {

    private val userList: List<User> = arrayListOf(
            User(1, "admin", "admin", arrayListOf(
                    Transaction( 1, "AMAZON", 1, LocalDateTime.now().minusDays(10), 1, 0.77, 15.64, "accepted"),
                    Transaction( 1, "AMAZON", 1, LocalDateTime.now().minusDays(10), 1, 1.27, 30.34, "pending"),
                    Transaction( 1, "AMAZON", 1, LocalDateTime.now().minusDays(10), 1, 0.17, 10.14, "pending"),
                    Transaction( 1, "AMAZON", 1, LocalDateTime.now().minusDays(10), 1, 0.77, 15.41, "accepted"),
                    Transaction( 1, "AMAZON", 1, LocalDateTime.now().minusDays(10), 1, 0.77, 15.43, "accepted"),
                    Transaction( 1, "AMAZON", 1, LocalDateTime.now().minusDays(10), 1, 0.67, 11.41, "accepted"),
                    Transaction( 1, "YANDEX", 2, LocalDateTime.now().minusDays(10), 1, 5.77, 115.42, "accepted"),
                    Transaction( 1, "YANDEX", 2, LocalDateTime.now().minusDays(10), 1, 5.89, 100.53, "rejected"),
                    Transaction( 1, "YANDEX", 2, LocalDateTime.now().minusDays(10), 1, 4.12, 67.41, "rejected"),
                    Transaction( 1, "AMAZON", 1, LocalDateTime.now().minusDays(10), 1, 0.77, 15.4, "accepted")
            ))
    )

    @GetMapping(value = "api/transactions")
    fun getTransactionsById(@RequestParam id: Int) = if(id == 1) userList[0].transactions else ResponseEntity<Any>(HttpStatus.METHOD_NOT_ALLOWED)

    @GetMapping(value = "api/user/login")
    fun isUserLogin(@RequestParam name: String,@RequestParam  pass: String) = if(name == "admin" && pass == "admin") userList[0] else ResponseEntity<Any>(HttpStatus.NON_AUTHORITATIVE_INFORMATION)
}