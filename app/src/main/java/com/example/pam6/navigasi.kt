package com.example.pam6

import com.example.pam6.view.FormIsian

enum class  Navigasi {
    FormulirSaya,
    Detail
}
@Composable
fun DataApp(
    navcontroller: NavHostController = rememberNavController()
){
    Scaffold { isiRuang->
        NavHost(
            navController = navcontroller,
            startDestination = Navigasi.FormulirSaya.nama,

            modifier = Modifier.padding(paddingValues = isiRuang)){
            composable(Navigasi.FormulirSaya.nama){
                FormIsian (onSubmitBtnClick = { navController.navigate(route = Navigasi.Detail.nama)
                })
            }
            composable(route = Navigasi.Detail.nama){
                onBackBtnClick = { cancelAndBackToFormulirSaya(navController) }
            }
        }

        }
        ){
    }
}