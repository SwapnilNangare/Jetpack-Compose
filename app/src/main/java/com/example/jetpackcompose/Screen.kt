package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(heightDp = 500)
@Composable
fun previewItem() {


//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        getCategoryList().map { item ->
//
//            BlogCategory(
//                item.img,
//                item.title,
//                item.subtitle
//            )
//        }
//    }


    LazyColumn(content = {
        items(getCategoryList()) { item ->
            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)

        }
    })


}


@Composable
fun BlogCategory(img: Int, title: String, subtitle: String) {

    Card(
        modifier = Modifier.padding(8.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(70.dp)
                    .padding(9.dp)
                    .clip(CircleShape)
            )
            itemDescription(title, subtitle, Modifier.weight(.8f))
        }
    }

}

@Composable
public fun itemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Thin,
            style = MaterialTheme.typography.bodySmall,
            fontSize = 12.sp
        )
    }
}

data class Category(val img: Int, val title: String, val subtitle: String) {

}

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.baseline_123_24, "Madhav", "Lead developer"))
    list.add(Category(R.drawable.ic_launcher_background, "Soma", "Lead Tester"))
    list.add(Category(R.drawable.baseline_123_24, "Rani", "Product Owner"))
    list.add(Category(R.drawable.ic_launcher_background, "Tushar", "QA Tester"))
    list.add(Category(R.drawable.baseline_123_24, "Swapnil", "senior developer"))
    list.add(Category(R.drawable.ic_launcher_background, "Madhav", "senior Manager"))

    return list
}