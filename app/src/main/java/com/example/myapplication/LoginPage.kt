package com.example.myapplication

import android.graphics.Color
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.BloomTheme
import com.example.myapplication.ui.theme.pink100
import com.example.myapplication.ui.theme.pink900
import com.example.myapplication.ui.theme.white


@Composable
fun LoginPage(){
    val emailValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }
    Surface(color = MaterialTheme.colors.background,

        modifier = Modifier.fillMaxSize()


        ) {

        Column(

//            verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp)

        ) {
            HeaderText()
            Spacer(modifier = Modifier.height(16.dp))
            CustomTextField(value = emailValue.value, onChange = {
                                                                 emailValue.value = it

            }, hinttext = "Email address", ispassField = false, )

            Spacer(modifier = Modifier.height(8.dp))

            CustomTextField(value = passwordValue.value, onChange = {
                                passwordValue.value = it
            }, hinttext = "PassWord", ispassField = true)


            Text(text = "By clicking below, you agree to our Terms of use and consent to our Private Policy", textAlign = TextAlign.Center, style = MaterialTheme.typography.body2, modifier = Modifier.paddingFromBaseline(top = 24.dp))
            
            Spacer(modifier = Modifier.height(20.dp))
            CreateButton(typography = MaterialTheme,  text = "Log in")


        }
    }
}







@Composable
fun HeaderText(){

    Text(text = "Log in with email", style = MaterialTheme.typography.h1, modifier = Modifier.paddingFromBaseline(184.dp)  )

}

@Composable
fun CustomTextField(value:String, onChange: (value:String)-> Unit, hinttext: String, ispassField: Boolean,){
//    var passwordVisiblity = remember { mutableStateOf(false) }
//    var passwordVisibility: Boolean by remember { mutableStateOf(false) }
//    var visible by remember { mutableStateOf(true) }
//    var value by remember { mutableStateOf(false) }
 var obscure =    if (ispassField) PasswordVisualTransformation() else VisualTransformation.None

    val isLight = MaterialTheme.colors.isLight
    val textColor =  if (isLight) pink900 else Color.WHITE


    OutlinedTextField(value = value, onValueChange = onChange, modifier = Modifier.fillMaxWidth(),  label = {
        Text(text = hinttext )
    }, visualTransformation = obscure, trailingIcon = {
        if (ispassField)
            TextButton(onClick = {
//                value =!value

            }){

//                if (value) "Show" else "Hide"
                Text(text = "Show" , color = if (isLight) pink900 else white )
            }
                 else Text("")
    }  )
}




@Preview()
@Composable
fun DefaultLightPreview() {
    BloomTheme(darkTheme = false) {
        LoginPage()
    }
}

@Preview()
@Composable
fun DefaultDarkPreview() {
    BloomTheme(darkTheme = true) {
        LoginPage()
    }
}
