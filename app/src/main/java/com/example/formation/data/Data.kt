package com.example.formation.data

import com.example.formation.model.DataAnalityc
import com.example.formation.model.DataLastContent
import com.example.formation.model.DataRevenue
import java.util.Locale.US

object Data {
    val dataAnalityc = listOf<DataAnalityc>(
        DataAnalityc(
            title = "Vues",
            value = "86,k"
        ),
        DataAnalityc(
                title = "Revenues",
        value = "156,8$US"
    )
    )

    val dataRevenue = listOf<DataRevenue>(
        DataRevenue(
            title = "Mars(Encore",
            value = 100f
        ),
                DataRevenue(
                title = "Mars(Encore",
        value = 400f
    ),
        DataRevenue(
            title = "Février",
            value = 700f
        ),
        DataRevenue(
            title = "janvier(Encore",
            value = 100f
        )
    )

    val dataLatContent = listOf<DataLastContent>(
        DataLastContent(
            title = "Développement des application mobile",
            pulbliAt = "Il y a 2 jours",
            favorite = "200",
            "100k",
            "300"

        ),
                DataLastContent(
                title = "Développement des application mobile",
        pulbliAt = "Il y a 2 jours",
        favorite = "200",
        "100k",
        "300"

    ),
    DataLastContent(
    title = "Développement des application mobile",
    pulbliAt = "Il y a 2 jours",
    favorite = "200",
    "100k",
    "300"

    )
    )
}