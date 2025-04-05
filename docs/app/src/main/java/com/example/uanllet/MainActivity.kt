package com.example.uanllet

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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinanceAppUI()
        }
    }
}

@Composable
fun FinanceAppUI() {
    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFF5F5F5))) {
        HeaderSection()
        FinanceSummary()
        UpcomingPayments()
        BottomNavigationBar()
    }
}

@Composable
fun HeaderSection() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = R.drawable.ic_profile),
                contentDescription = "Profile Image",
                modifier = Modifier.size(50.dp).clip(CircleShape),
                tint = Color.Gray
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text("Usser Name", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Text("Job", fontSize = 14.sp, color = Color.Gray)
            }
        }
        IconButton(onClick = { /* TODO */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_settings),
                contentDescription = "Settings",
                tint = Color.Gray
            )
        }
    }
}

@Composable
fun FinanceSummary() {
    Row(modifier = Modifier.fillMaxWidth().padding(16.dp), horizontalArrangement = Arrangement.SpaceBetween) {
        FinanceCard("Ingresos", "$5,000", Color.Green)
        FinanceCard("Gastos", "$2,500", Color.Red)
        FinanceCard("Balance", "$2,500", Color.Blue)
    }
}

@Composable
fun FinanceCard(title: String, amount: String, color: Color) {
    Card(
        modifier = Modifier.size(100.dp, 80.dp),
        shape = RoundedCornerShape(12.dp),
        backgroundColor = color
    ) {
        Column(modifier = Modifier.padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(title, color = Color.White, fontSize = 14.sp)
            Text(amount, color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun UpcomingPayments() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Pagos próximos", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        PaymentCard("Netflix", "10 de abril")
        PaymentCard("Spotify", "15 de abril")
    }
}

@Composable
fun PaymentCard(service: String, date: String) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
        shape = RoundedCornerShape(12.dp),
        backgroundColor = Color.White,
        elevation = 2.dp
    ) {
        Row(modifier = Modifier.padding(16.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(service, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(date, fontSize = 14.sp, color = Color.Gray)
        }
    }
}

@Composable
fun BottomNavigationBar() {
    BottomNavigation(backgroundColor = Color.White, elevation = 8.dp) {
        BottomNavigationItem(
            icon = { Icon(painterResource(id = R.drawable.ic_home), contentDescription = "Home") },
            selected = true,
            onClick = {}
        )
        BottomNavigationItem(
            icon = { Icon(painterResource(id = R.drawable.ic_wallet), contentDescription = "Wallet") },
            selected = false,
            onClick = {}
        )
        BottomNavigationItem(
            icon = { Icon(painterResource(id = R.drawable.ic_chart), contentDescription = "Stats") },
            selected = false,
            onClick = {}
        )
        BottomNavigationItem(
            icon = { Icon(painterResource(id = R.drawable.ic_settings), contentDescription = "Settings") },
            selected = false,
            onClick = {}
        )
    }
}
