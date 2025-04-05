package com.example.uanllet.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SavingsScreen()
        }
    }
}

@Composable
fun SavingsScreen() {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFF0D1B2A))
    ) {
        HeaderSection()
        SavingsContent()
        Spacer(modifier = Modifier.weight(1f))
        BottomNavigationBar()
    }
}

@Composable
fun SavingsContent() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Ahorros programados", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Spacer(modifier = Modifier.height(8.dp))
        Text("Meta:", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Text("$00.00", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Green)
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {},
            shape = RoundedCornerShape(8.dp)
        ) {
            Text("PROGRAMAR AHORRO")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("PLAN DE AHORROS", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.White)
        SavingsPlanList()
    }
}

@Composable
fun SavingsPlanList() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp).background(Color.White, RoundedCornerShape(8.dp))
    ) {
        repeat(5) {
            Text(
                "$00.00",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Green,
                modifier = Modifier.padding(8.dp)
            )
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
            selected = false,
            onClick = {}
        )
        BottomNavigationItem(
            icon = { Icon(painterResource(id = R.drawable.ic_chart), contentDescription = "Stats", tint = Color.White) },
            selected = false,
            onClick = {}
        )
        BottomNavigationItem(
            icon = { Icon(painterResource(id = R.drawable.ic_savings), contentDescription = "Savings", tint = Color.White) },
            selected = true,
            onClick = {}
        )
    }
}
