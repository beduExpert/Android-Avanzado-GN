[`Android Avanzado`](../..#readme) > [`Sesión 01`](..#readme) > `Reto 1`

## Reto 1: OkHttp Avanzado

<div style="text-align: justify;">




### 1. Objetivos :dart:

* Utilizar GSON y OkHttp para imprimir resultados en la consola de debug.
* Especificar el nombre de un campo JSON cuando se serializa o deserializa un objeto Java.

### 2. Requisitos :clipboard:

1. Haber cursado dicho tema en la exposición.
2. Haber finalizado el [Ejemplo 01](../Ejemplo-01)

### 3. Desarrollo :computer:

Imprimiremos en consola el resultado de la lista entera de gente de star wars, pero con Gson. Elaboraremos esta pantalla:

<img src="images/01.png" width="35%">

* El json tiene la siguiente estructura: 

```js
{
    ...
    "results": [
        {...},
	{...},
	]
}
```

por lo tanto, necesitamos una clase data que tenga dicha estructura.

* Recuerda que con @SerializedName("nombreVar") puedes asignarle otro nombre a la variable sin que coincida con el del response, en el data class de Gson.

* La nueva url es la siguiente: https://swapi.dev/api/people/

* En el log tiene qué dar el siguiente resultado:

```bash
JediList(jediList=[Jedi(name=Luke Skywalker, height=172, mass=77), Jedi(name=C-3PO, height=167, mass=75), Jedi(name=R2-D2, height=96, mass=32), Jedi(name=Darth Vader, height=202, mass=136), Jedi(name=Leia Organa, height=150, mass=49), Jedi(name=Owen Lars, height=178, mass=120), Jedi(name=Beru Whitesun lars, height=165, mass=75), Jedi(name=R5-D4, height=97, mass=32), Jedi(name=Biggs Darklighter, height=183, mass=84), Jedi(name=Obi-Wan Kenobi, height=182, mass=77)])
```

**Recordar** que todo arreglo en un json puede ser representado con un ArrayList en Gson.

<details>
<summary>Solucion</summary>


```kotlin
    package org.bedu.advancedokhttp
    
    import com.google.gson.annotations.SerializedName
    
    data class Jedi(
        val name: String? = "",
        val height: Int? = 0,
        val mass: Int? =0
    )
    
    data class JediList(
       @SerializedName("results") //el nombre real
        val jediList: ArrayList<Jedi>
    )
```

para la respuesta a la llamada: 
```kotlin
override fun onResponse(call: Call, response: Response) {
    val body = response.body?.string()
    try {
        val newList = Gson().fromJson(body,JediList::class.java)
        Log.d("Response",newList.toString())


    } catch (e: JSONException) {
        e.printStackTrace()
    }
}
```

</details>



[`Anterior`](../Ejemplo-01#readme) | [`Siguiente`](../Ejemplo-02#readme)      

</div>

