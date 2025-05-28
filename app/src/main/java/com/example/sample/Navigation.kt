package com.example.sample

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class Screens{
    Screen1,
    Screen2
}

@Composable
fun Navigation(
    navController: NavHostController = rememberNavController()
){
    NavHost(navController = navController, startDestination= Screens.Screen2.name){

    }
    fun NavGraphBuilder.Home(){

    }
}