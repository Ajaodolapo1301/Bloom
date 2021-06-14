package com.example.myapplication

import android.graphics.fonts.Font
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.BloomTheme
import com.example.myapplication.ui.theme.Shapes
import com.example.myapplication.ui.theme.pink900
import com.example.myapplication.ui.theme.white


@Composable
fun WelcomePage(){

    val isLight = MaterialTheme.colors.isLight
Surface(
    color= MaterialTheme.colors.primary,
    modifier = Modifier
    .fillMaxSize()


){
    WelcomeBackgroundImage(isLight = isLight)
WelcomeScreenContent(isLight = isLight)
}

}



@Composable
fun WelcomeScreenContent(isLight: Boolean){
    Column (

        Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.SpaceAround
    ){

                Spacer(modifier = Modifier.height(72.dp))
        LeafImage(isLight = isLight)
        Spacer(modifier = Modifier.height(44.dp))
        LogoImage(isLight = isLight)

        TextWidget(typography = MaterialTheme, text = "Beautiful Home garden solution")
        Spacer(modifier = Modifier.height(40.dp))
        CreateButton(typography = MaterialTheme, text = "Create an Account")
        Spacer(modifier = Modifier.height(8.dp))
        LoginButton(typography = MaterialTheme, isLight = isLight, text = "Log in")
    }
}






@Composable
fun LeafImage(isLight: Boolean){
    var leafImage = if (isLight){
        R.drawable.ic_light_welcome_illos
    }else{
        R.drawable.ic_dark_welcome_illos
    }
    Image(painter = painterResource(id = leafImage), contentDescription = null,
        modifier = Modifier.offset(x = 88.dp)
    )

}




@Composable
fun LogoImage(isLight: Boolean){
    var titleLogo = if (isLight){
        R.drawable.ic_light_logo
    }else{
        R.drawable.ic_dark_logo
    }
    Image(painter = painterResource(id = titleLogo), contentDescription = "Bloom" )

}




@Composable
fun LoginButton(typography:MaterialTheme, isLight: Boolean, text: String){

    TextButton(onClick = { /*TODO*/ },
        modifier = Modifier.fillMaxWidth())
    {
        Text(text = text, style = typography.typography.button, color = if (isLight) pink900 else white)
    }
}


@Composable
fun CreateButton(typography:MaterialTheme, text: String){
    Button(onClick = { /*TODO*/ },

        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(48.dp),

        colors = buttonColors(
            backgroundColor = MaterialTheme.colors.secondary
        ),

        shape = MaterialTheme.shapes.medium
    ) {

        Text(text = text,  style = typography.typography.body2)
    }

}



@Composable
fun TextWidget(typography:MaterialTheme, text: String ){
    Text(text = text, style = typography.typography.body2, modifier = Modifier.paddingFromBaseline(32.dp) )
}





@Composable
fun WelcomeBackgroundImage(isLight:Boolean){
//    val isLight = MaterialTheme.colors.isLight
    var backgroundImgeres = if (isLight){
        R.drawable.ic_light_welcome_bg
    }else{
        R.drawable.ic_dark_welcome_bg
    }
    Image(painter = painterResource(id = backgroundImgeres), contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )

}

//@Preview()
//@Composable
//fun DefaultLightPreview() {
//    BloomTheme(darkTheme = false) {
//        WelcomePage()
//    }
//}
//
//@Preview()
//@Composable
//fun DefaultDarkPreview() {
//    BloomTheme(darkTheme = true) {
//        WelcomePage()
//    }
//}

