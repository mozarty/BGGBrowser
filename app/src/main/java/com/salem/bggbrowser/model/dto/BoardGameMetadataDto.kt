package com.salem.bggbrowser.model.dto

import com.tickaroo.tikxml.annotation.Attribute
import com.tickaroo.tikxml.annotation.Path
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Xml(name = "item")
/**
 * <item id="306040" rank="1">
 *  <thumbnail value="https://cf.geekdo-images.com/y6DEV5Qf6hyXpxRlafgOWw__thumb/img/aVefQAlc_n4d3GCToQYMluFpgBs=/fit-in/200x150/filters:strip_icc()/pic5314414.jpg"/>
 * <name value="Merv: The Heart of the Silk Road"/>
 * <yearpublished value="2020"/>
 * </item>
 */
data class BoardGameMetadataDto(
    @Attribute(name = "id") var gameID: String,
    @Attribute(name = "rank") var rank: Int,
    @Path("thumbnail") @Attribute(name = "value") var imageURL: String,
    @Path("name") @Attribute(name = "value") var name: String,
    @Path("yearpublished") @Attribute(name = "value") var year: String,
)