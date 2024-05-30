package com.example.jetpackcompose

import android.os.Bundle
import android.widget.GridLayout.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

            Text(text = "Hello Swapnil")

        }
    }
}

@Preview(
    showBackground = true,
    name = "Hello Message",
    showSystemUi = true,
    widthDp = 200,
    heightDp = 200
)
@Composable
fun saySomething(name: String = "I am doing better") {
    Text(
        text = " HI $name",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        color = Color.Red,
        fontSize = 30.sp,
        textAlign = TextAlign.Center
    )

    // img Composable

//    Image(
//        painter = painterResource(id = R.drawable.ic_launcher_background),
//        contentDescription = "this Img",
//        ContentScale = ContentScale.Crop
//
//    )

}




