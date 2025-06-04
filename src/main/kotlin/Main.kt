package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {
    val doc: Document = Jsoup.connect(
        "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/?page=1"
    )
        .get()
    val quotes: Elements = doc.select("div.sc-2aegk7-2.bzpNIu")

    for (quote: Element in quotes) {
        println("Цитата: ${quote.text()}\n")
    }
}