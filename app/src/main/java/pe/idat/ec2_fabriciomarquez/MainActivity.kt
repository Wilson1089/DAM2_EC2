package pe.idat.ec2_fabriciomarquez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.idat.ec2_fabriciomarquez.ui.theme.EC2_FabricioMarquezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EC2_FabricioMarquezTheme {
                Navegacion()

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navegacion() {
    var radios by rememberSaveable {
        mutableStateOf("")
    }
    TopAppBar(title = { Text(text = "EC2_Marquez") },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color.Black,
            titleContentColor = Color.White
        ),
        actions = {
            TextButton(onClick = {  }) {
                Text("P1")
            }
            TextButton(onClick = {  }) {
                Text("P2")
            }
        })
    Box(modifier = Modifier.fillMaxWidth()){
        preg1(radios) { radios = it }
    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EC2_FabricioMarquezTheme {

    }
}