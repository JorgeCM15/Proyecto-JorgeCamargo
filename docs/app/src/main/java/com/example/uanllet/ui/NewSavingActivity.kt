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
            ProgramSavingsScreen()
        }
    }
}

@Composable
fun ProgramSavingsScreen() {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFF0D1B2A))
    ) {
        HeaderSection()
        ProgramSavingsContent()
        Spacer(modifier = Modifier.weight(1f))
        BottomNavigationBar()
    }
}

@Composable
fun ProgramSavingsContent() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("PROGRAMAR AHORRO", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Spacer(modifier = Modifier.height(8.dp))
        Text("¿Cuánto quieres ahorrar?", fontSize = 14.sp, color = Color.White)
        Text("$00.00", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Green)
        Spacer(modifier = Modifier.height(8.dp))
        Icon(painter = painterResource(id = R.drawable.ic_calendar), contentDescription = "Fecha", tint = Color.White)
        Text("Fecha de ahorro", fontSize = 14.sp, color = Color.White)
        Text("dd/mm/aaaa", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Spacer(modifier = Modifier.height(16.dp))
        Text("Plan de ahorro", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {}, shape = RoundedCornerShape(8.dp)) { Text("DIARIO") }
            Button(onClick = {}, shape = RoundedCornerShape(8.dp)) { Text("SEMANAL") }
            Button(onClick = {}, shape = RoundedCornerShape(8.dp)) { Text("MENSUAL") }
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
