package com.example.pam6

@Composable
fun DataApp(
    navcontroller: NavHostController = rememberNavController()
){
    Scaffold { isiRuang->
        NavHost(
            navController = navcontroller,
            startDestination = Navigasi.FormulirSaya.nama,

            modifier = Modifier.padding(paddingValues = isiRuang)){

        }
        ){
    }
}