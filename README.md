Ejercicio 10 - Contenedor de Estado Global y Auditoría de Seguridad

Explicación del programa

En este ejercicio se creó una clase llamada AuditorSeguridad que aplica el patrón Singleton para centralizar el registro de eventos críticos de seguridad de forma cronológica y sin utilizar librerías externas ni imports.
La clase cuenta con:
- Una variable estática privada llamada instancia.
- Atributos privados (evento1, evento2 y totalRegistros) para almacenar la traza de los eventos.
- Un constructor privado para impedir la duplicación de la instancia en memoria.
- Un método estático público llamado getInstancia() que devuelve siempre la misma referencia única.
- Métodos públicos para registrar eventos, consultar el total de registros y mostrar la traza completa.

Luego, dentro del método main, se obtienen dos referencias al auditor:
AuditorSeguridad a1 = AuditorSeguridad.getInstancia();
AuditorSeguridad a2 = AuditorSeguridad.getInstancia();

Finalmente, se utilizó System.out.println() para comprobar que ambas referencias son iguales, registrar eventos de seguridad y mostrar la traza cronológica por consola.

Lógica utilizada

La lógica del programa consiste en:
- Restringir la instanciación externa mediante un constructor privado para garantizar la unicidad del auditor.
- Controlar el acceso global a través de getInstancia() asegurando que cualquier componente comparta exactamente la misma instancia.
- Almacenar los eventos de manera secuencial y ordenada utilizando atributos internos de la clase sin dependencias externas.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
¿Es la misma instancia de auditor?: true
Evento registrado: LOGIN: Operador1
Evento registrado: TRANSFERENCIA: $5000
Total registros: 2
--- Traza de Auditoría ---
1. LOGIN: Operador1
2. TRANSFERENCIA: $5000

Captura de pantalla

<img width="420" height="295" alt="image" src="https://github.com/user-attachments/assets/bd5a6d47-2436-4f13-b068-f7b12da8067d" />
