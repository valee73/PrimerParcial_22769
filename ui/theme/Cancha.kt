package com.example.examenparcial1.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examenparcial1.R

@Preview(showBackground = true)
@Composable

fun Cancha (){
    Box(modifier = Modifier.fillMaxSize()
        .background(color = Color.White)
        .padding(10.dp))

    {

            Column() {
            Column(modifier = Modifier.fillMaxWidth()) {
                Row() {
                    Box(modifier = Modifier
                        .background(color = Color.Blue)
                        .width(80.dp)
                        .height(202.dp)) {

                    }
                    Spacer(modifier = Modifier.width(2.dp))
                    Column() {
                        Box(modifier = Modifier
                            .background(color = Color.Blue)
                            .width(200.dp)
                            .height(100.dp)) {

                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Box(modifier = Modifier
                            .background(color = Color.Blue)
                            .width(200.dp)
                            .height(100.dp)) {

                        }
                    }
                    Spacer(modifier = Modifier.width(2.dp))
                    Box(modifier = Modifier
                        .background(color = Color.Blue)
                        .width(80.dp)
                        .height(202.dp)) {

                    }

                }
                Box(modifier = Modifier
                    .background(color = Color.DarkGray)
                    .fillMaxWidth()
                    .height(6.dp)) {

                }
            }

            Column(modifier = Modifier.fillMaxWidth()) {
                Row() {
                    Box(modifier = Modifier
                        .background(color = Color.Blue)
                        .width(80.dp)
                        .height(202.dp)) {

                    }
                    Spacer(modifier = Modifier.width(2.dp))
                    Column() {
                        Box(modifier = Modifier
                                .background(color = Color.Blue)
                            .width(200.dp)
                            .height(100.dp)) {

                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Box(modifier = Modifier
                            .background(color = Color.Blue)
                            .width(200.dp)
                            .height(100.dp)) {

                        }
                    }
                    Spacer(modifier = Modifier.width(2.dp))
                    Box(modifier = Modifier
                        .background(color = Color.Blue)
                        .width(80.dp)
                        .height(202.dp)) {

                    }
                }
            }
                Box(){
                    Text("JANNIK")
                }
                Box(){
                    Text("VS")
                }
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .align(Alignment.End)
                ){
                    Image(painter = painterResource(id = R.drawable.player_one),
                        contentDescription = "anime",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop,

                    )
                    }
                Box(){
                    Text("MINON LOVER")
                }
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .align(Alignment.Start)
                ){
                    Image(painter = painterResource(id = R.drawable.player_two),
                        contentDescription = "minion",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop,

                        )
                }
        }

    }
    }