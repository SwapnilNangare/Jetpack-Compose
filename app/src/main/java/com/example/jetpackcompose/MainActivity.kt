package com.example.jetpackcompose

import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.util.Log
import android.widget.GridLayout.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            PreviewFunction()
        }
    }
}

//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//private fun textFieldFunction() {
//
//    TextField(value = "Hello Swap", onValueChange = {},
//        label = { Text(text = "Enter Message") },
//        placeholder = {})
//
//
//}

//@Composable
//fun textInput() {
//    val state = remember {
//
//        mutableStateOf("")
//    }
//    TextField(
//        value = state.value,
//        onValueChange = {
//            state.value = it
//        },
//        label = { Text(text = "Enter Message") }
//
//    )
//
//}

//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun saySomething(name: String = "I am doing better") {
//    Text(
//        text = " HI $name",
//        fontStyle = FontStyle.Italic,
//        fontWeight = FontWeight.ExtraBold,
//        color = Color.Red,
//        fontSize = 30.sp,
//        textAlign = TextAlign.Center
//    )
//
//    Button(
//        onClick = { },
//        colors = ButtonDefaults.buttonColors(
//            contentColor = Color.Red
//
//            ),
//
//        ) {
//        Text(text = "Helllo")
//
//
//    }
//
//    // img Composable
//
////    Image(
////        painter = painterResource(id = R.drawable.ic_launcher_background),
////        contentDescription = "this Img",
////        ContentScale = ContentScale.Crop
////
////    )
//
//}

//  Layout

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction() {
//    Column(
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }

//    Row(
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Text(text = "AA", fontSize = 25.sp)
//        Text(text = "BB", fontSize = 25.sp)
//    }


}




