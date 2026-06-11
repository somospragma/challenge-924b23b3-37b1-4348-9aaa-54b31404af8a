# Implementación de un Sistema de Procesamiento de Eventos Reactivo

En un sistema de banca digital, se necesita procesar eventos en tiempo real provenientes de múltiples fuentes (por ejemplo, solicitudes de transferencia, notificaciones de pago, alertas de fraude) para mantener la resiliencia, escalabilidad y confiabilidad del código. El objetivo es implementar un sistema que maneje estos flujos de eventos de manera reactiva utilizando operadores de Project Reactor.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programación Reactiva |
| **Nivel** | junior-l2 |
| **Tipo** | mixed |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Exploración del Dominio y Requisitos

**Objetivo:** Identificar y documentar los requisitos funcionales y no funcionales del sistema de procesamiento de eventos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Enumera las fuentes de eventos y sus características (por ejemplo, frecuencia, volumen, latencia aceptable).
- Identifica los requisitos de resiliencia, escalabilidad y confiabilidad para el sistema.
- Documenta los posibles modos de falla y cómo el sistema debe manejarlos.

**Entregable:** Documento de requisitos funcionales y no funcionales para el sistema de procesamiento de eventos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la latencia aceptable para cada tipo de evento.
- Piensa en cómo el sistema debe comportarse ante un fallo de una fuente de eventos.

</details>

### Fase 2: Diseño del Sistema Reactivo

**Objetivo:** Diseñar la arquitectura del sistema utilizando operadores de Project Reactor para manejar los flujos de eventos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Selecciona los operadores de Project Reactor adecuados para cada tipo de evento.
- Diseña el flujo de eventos desde la recepción hasta el procesamiento final, incluyendo la gestión de errores y la recuperación.
- Documenta las decisiones de diseño y los trade-offs considerados.

**Entregable:** Diagrama de arquitectura del sistema reactivo y documento de decisiones de diseño.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de operadores como `flatMap`, `concatMap`, y `retry` para manejar diferentes tipos de eventos.
- Piensa en cómo garantizar la resiliencia y la confiabilidad del sistema ante fallos.

</details>

### Fase 3: Implementación y Validación

**Objetivo:** Implementar el sistema reactivo y validar su funcionamiento con casos de prueba.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa el sistema reactivo utilizando los operadores de Project Reactor seleccionados.
- Crea casos de prueba para validar el funcionamiento del sistema en diferentes escenarios, incluyendo fallos y recuperación.
- Documenta los resultados de las pruebas y cualquier ajuste realizado.

**Entregable:** Código implementado del sistema reactivo y reporte de pruebas.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza casos de prueba que simulen diferentes tipos de eventos y fallos.
- Considera la posibilidad de ajustes en el diseño basados en los resultados de las pruebas.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la programación reactiva y por qué se utiliza en sistemas de procesamiento de eventos?
- **paraQueSirve**: ¿Para qué sirven los operadores de Project Reactor en el manejo de flujos de eventos?
- **comoSeUsa**: ¿Cómo se utilizan los operadores de Project Reactor para garantizar la resiliencia y la confiabilidad del sistema?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar un sistema reactivo y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones de diseño implica la implementación de un sistema reactivo y cómo se pueden justificar?

## Criterios de Evaluacion

- Identificación y documentación de requisitos funcionales y no funcionales.
- Selección y uso adecuado de operadores de Project Reactor.
- Diseño y documentación de la arquitectura reativa.
- Implementación y validación del sistema reactivo con casos de prueba.
- Documentación de resultados de pruebas y ajustes realizados.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
