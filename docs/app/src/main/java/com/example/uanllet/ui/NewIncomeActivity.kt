package com.example.uanllet.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class NewIncomeActivityActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegisterIncomeScreen()
        }
    }
}

@Composable
fun RegisterIncomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFF0D1B2A))
    ) {
        HeaderSection()
        RegisterIncomeForm()
        Spacer(modifier = Modifier.weight(1f))
        BottomNavigationBar()
    }
}

@Composable
fun HeaderSection() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_profile),
                    contentDescription = "Profile Image",
                    modifier = Modifier.size(50.dp).clip(CircleShape),
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text("USER NAME", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.White)
                    Text("profesión", fontSize = 14.sp, color = Color.Gray)
                }
            }
            IconButton(onClick = { /* TODO */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_wallet),
                    contentDescription = "Wallet",
                    tint = Color.White
                )
            }
        }
    }
}

@Composable
fun RegisterIncomeForm() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            shape = RoundedCornerShape(12.dp),
            backgroundColor = Color(0xFFB0C4DE),
            elevation = 4.dp,
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("REGISTRO NUEVO INGRESO", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                Spacer(modifier = Modifier.height(8.dp))
                Text("Valor Ingreso", fontSize = 14.sp, color = Color.Black)
                Text("$00.00", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                Spacer(modifier = Modifier.height(8.dp))
                Text("Detalles", fontSize = 14.sp, color = Color.Black)
                Card(
                    shape = RoundedCornerShape(8.dp),
                    backgroundColor = Color.White,
                    elevation = 2.dp,
                    modifier = Modifier.fillMaxWidth().height(80.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Text("--", color = Color.Gray)
                    }
                }
            }
        }
    }
}

@Composable
fun BottomNavigationBar() {
    BottomNavigation(backgroundColor = Color(0xFF0D1B2A), elevation = 8.dp) {
        BottomNavigationItem(
            icon = { Icon(painterResource(id = R.drawable.ic_home), contentDescription = "Home", tint = Color.White) },
            selected = false,
            onClick = {}
        )
        BottomNavigationItem(
            icon = { Icon(painterResource(id = R.drawable.ic_money), contentDescription = "Transactions", tint = Color.White) },
            selected = true,
            onClick = {}
        )
        BottomNavigationItem(
            icon = { Icon(painterResource(id = R.drawable.ic_chart), contentDescription = "Stats", tint = Color.White) },
            selected = false,
            onClick = {}
        )
        BottomNavigationItem(
            icon = { Icon(painterResource(id = R.drawable.ic_settings), contentDescription = "Settings", tint = Color.White) },
            selected = false,
            onClick = {}
        )
    }
}
