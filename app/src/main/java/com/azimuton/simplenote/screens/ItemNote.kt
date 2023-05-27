package com.azimuton.simplenote.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.BottomNavigationDefaults.Elevation
import androidx.compose.material.Card
import androidx.compose.material.DrawerDefaults.Elevation
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.azimuton.simplenote.R
import com.azimuton.simplenote.ui.theme.Purple700


@Preview(showBackground = true)
@Composable
fun ItemNote() {
    Card(
        shape = CutCornerShape(10.dp),
        border = BorderStroke(3.dp, color = Purple700),
        modifier = Modifier
            .fillMaxWidth(),
        elevation = 10.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(color = Color.Green)
                .padding(8.dp)
                .fillMaxWidth()
        ) {
            Image(painter = painterResource(id = R.drawable.baseline_note_alt_24),
                contentDescription = "")
            Text("Text of card item because it is large text",
            modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black)
        }
    }

}