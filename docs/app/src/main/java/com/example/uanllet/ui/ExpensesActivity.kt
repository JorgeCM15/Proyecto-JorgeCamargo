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

class ExpensesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExpensesScreen()
        }
    }
}

@Composable
fun ExpensesScreen() {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFF0D1B2A))
    ) {
        HeaderSection()
        ExpensesSection()
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
fun ExpensesSection() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Total Gastos Registrados Mes", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Text("$00.00", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.Red)
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { /* TODO: Implementar acción */ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
        ) {
            Text("Nuevo Gasto", color = Color.Black)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Gastos registrados", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.White)
        ExpenseItem("Gasto 1", "Fecha de pago dd/mm/aaaa")
        ExpenseItem("Gasto 2", "Fecha de pago dd/m