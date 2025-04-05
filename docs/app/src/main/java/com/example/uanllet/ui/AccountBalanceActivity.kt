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
import androidx.compose.foundation.Canvas
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.StrokeCap

class AccountBalanceActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StatsScreen()
        }
    }
}

@Composable
fun StatsScreen() {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFF0D1B2A))
    ) {
        HeaderSection()
        StatsContent()
        Spacer(modifier = Modifier.weight(1f))
        BottomNavigationBar()
    }
}

@Composable
fun StatsContent() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Comportamiento Gastos Año", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.White)
        BarChart(listOf(3, 4, 5), Color.Red)
        Spacer(modifier = Modifier.height(16.dp))
        Text("Comportamiento Ingresos Año", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.White)
        BarChart(listOf(5, 6, 7), Color.Green)
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text("$00.00", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Green)
            Text(" / ", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White)