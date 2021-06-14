package com.example.myapplication.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.myapplication.R


private  val dmBold =  FontFamily(Font(R.font.dmsans_bold))
private  val dmmedium =  FontFamily(Font(R.font.dmsans_medium))
private  val dmregular =  FontFamily(Font(R.font.dmsans_regular))


// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = dmBold,
        fontSize = 18.sp
    ),

    h2 = TextStyle(
            fontFamily = dmBold,
           fontSize = 14.sp
),

    body1 = TextStyle(
        fontFamily = dmmedium,
        fontSize = 14.sp
    ),

    body2 = TextStyle(
        fontFamily = dmmedium,
        fontSize = 12.sp
    ),

)