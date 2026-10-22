package com.example.pam6.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource

@OptIn(markerClass = ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick: () -> Unit
){
    val items = listOf(
        pair(stringResource(id = R.string.nama_lengkap),"Contoh Nama",),
        pair(stringResource(id = R.string.jenis_kelamin),"Lainnya",),
        pair(stringResource(id = R.string.alamat),"Yogyakarta",)
    )
    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = "Tampilan Data"),color.white) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = colorResource(id = R.color.teal_700)),
            )
        }){ isiRuang ->
        Column(modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.SpaceBetween){
            Column(modifier = Modifier.padding(all= dimensionResource(id = 16dp))){
                items.forEach { item ->
                    Column {
                        text(text = item.first.uppercase(),fontSize = 16.sp)
                        text(text = item.second,fontWeight = fontweight.Bold,
                            fontFamily = FontFamily.Cursive,Fontsize = 22.sp)
                    }
                    HorizontalDivider(thickness = 1.dp,color = Color.Cyan)

                }
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onBackBtnClick {
                        Text(text = stringResource(id = R.string.back))
                    }
            }
        }

    }
}
