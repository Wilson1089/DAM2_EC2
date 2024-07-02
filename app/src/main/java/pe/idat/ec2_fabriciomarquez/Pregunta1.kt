package pe.idat.ec2_fabriciomarquez

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun preg1(color: String, onItemSelected:(String)->Unit) {
    var nombre by remember { mutableStateOf("") }
    var apellido by remember { mutableStateOf("") }
    var dni by remember { mutableStateOf("") }
    var celular by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    var check by remember { mutableStateOf("") }
    var otro by remember { mutableStateOf("") }
    var color by remember { mutableStateOf("") }




    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White)
    ) {

        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = apellido,
            onValueChange = { apellido = it },
            label = { Text("Apellidos") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = dni,
            onValueChange = { dni = it },
            label = { Text("DNI") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = celular,
            onValueChange = { celular = it },
            label = { Text("Celular") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Selecciona los programas que dominas:", fontSize = 18.sp, color = Color.Black)

        Row(modifier = Modifier.padding(top = 8.dp)) {
            Checkbox(checked = check == "", onCheckedChange = {})
            Text(text = "MS SQL Server", modifier = Modifier.padding(start = 8.dp))
        }

        Row(modifier = Modifier.padding(top = 8.dp)) {
            Checkbox(checked = check == "", onCheckedChange = {})
            Text(text = "Visual Studio Code", modifier = Modifier.padding(start = 8.dp))
        }

        Row(modifier = Modifier.padding(top = 8.dp)) {
            Checkbox(checked = check == "", onCheckedChange = {})
            Text(text = "Android Studio", modifier = Modifier.padding(start = 8.dp))
        }

        Row(modifier = Modifier.padding(top = 8.dp)) {
            Checkbox(checked = check == "", onCheckedChange = {})
            Text(text = "Otros", modifier = Modifier.padding(start = 8.dp))
        }

        TextField(
            value = otro,
            onValueChange = { otro = it },
            label = { Text("Ingrese otro programa") },
            modifier = Modifier.fillMaxWidth()
        )


        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Seleccione su color favorito:", fontSize = 18.sp, color = Color.Black)



        Column(Modifier.fillMaxWidth()) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
            ) {
                RadioButton(selected = color == "Azul",
                    onClick = { onItemSelected("Azul") })
                Text(text = "Azul", Modifier.padding(top = 12.dp))
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
            ) {
                RadioButton(selected = color == "Rojo",
                    onClick = { onItemSelected("Rojo") })
                Text(text = "Rojo", Modifier.padding(top = 12.dp))
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
            ) {
                RadioButton(selected = color == "Verde",
                    onClick = { onItemSelected("Verde") })
                Text(text = "Verde", Modifier.padding(top = 12.dp))
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
            ) {
                RadioButton(selected = color == "Otro",
                    onClick = { onItemSelected("Otro") })
                Text(text = "Otro", Modifier.padding(top = 12.dp))
            }
        }
    }
}

