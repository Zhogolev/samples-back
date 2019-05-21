package com.hamty.back.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class MerchantsContainer( val entries: List<Merchant>)

data class Merchant( val id: Long,  val name: String,  val availableCashback: Double, val logoUrl :String)


@RestController(value = "api")
class ApiController {

    @GetMapping(value = "api/merchantlist")
    fun getList() = MerchantsContainer(
            listOf(
                    Merchant(
                            1,
                            "aliexpress",
                            3.10,
                            "https://i.ibb.co/CzqZG2G/Bitmap.png"
                    ),
                    Merchant(
                            2,
                            "aliexpress2",
                            3.14,
                            "https://i.ibb.co/CzqZG2G/Bitmap.png"
                    ),
                    Merchant(
                            3,
                            "aliexpress3",
                            3.15,
                            "https://i.ibb.co/CzqZG2G/Bitmap.png"
                    ),
                    Merchant(
                            4,
                            "aliexpress4",
                            3.16,
                            "https://i.ibb.co/CzqZG2G/Bitmap.png"
                    ),
                    Merchant(
                            11,
                            "aliexpress12",
                            3.10,
                            "https://i.ibb.co/CzqZG2G/Bitmap.png"
                    ),
                    Merchant(
                            21,
                            "aliexpress233",
                            3.14,
                            "https://i.ibb.co/CzqZG2G/Bitmap.png"
                    ),
                    Merchant(
                            31,
                            "aliexpress31123",
                            3.15,
                            "https://i.ibb.co/CzqZG2G/Bitmap.png"
                    ),
                    Merchant(
                            41,
                            "aliexpress41123",
                            3.16,
                            "https://i.ibb.co/CzqZG2G/Bitmap.png"
                    ),
                    Merchant(
                            12,
                            "aliexpress11111",
                            3.10,
                            "https://i.ibb.co/CzqZG2G/Bitmap.png"
                    ),
                    Merchant(
                            22,
                            "aliexpress22222",
                            3.14,
                            "https://i.ibb.co/CzqZG2G/Bitmap.png"
                    ),
                    Merchant(
                            32,
                            "aliexpress33123",
                            3.15,
                            "https://i.ibb.co/CzqZG2G/Bitmap.png"
                    ),
                    Merchant(
                            42,
                            "aliexpress431231",
                            3.16,
                            "https://i.ibb.co/CzqZG2G/Bitmap.png"
                    )
            )
    )
}