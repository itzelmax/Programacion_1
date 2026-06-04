'''
a = 10.78
print(type(a))
b = True
print(type(b))

# Tipos int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola Alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de Cadenas

miGrupoFavorito = "Canserbero"
caracteristicas = "The best raper the WORD"
print("Mi grupo favorito es: "+miGrupoFavorito, caracteristicas)

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))

# Tipos Boleanos (Bool)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print ("El resultado es verdadero")
else:
    print ("El resultado es falso")

    # Procesar la entrada del usuario
# funcion input
# resultado = input("Digite un numero: ") # Regresa un dato de tipo string
# print(resultado)

# Conversion de la entrada de datos
numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("El resultado es: ", resultado)
'''
"""
# OPERADORES ARISMETICOS
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
# print("Resultado de la suma: ",suma)
print(f"El resultado de la suma es : {suma}") # SUMA

resta = operandoA - operandoB
print(f"El resultado de la resta es : {resta}") # RESTA

multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicacion es : {multiplicacion}") # MULTIPLICACION

division = operandoA / operandoB
print(f"El resultado de la division es : {division}") # DIVISION

dividendo = operandoA // operandoB
print(f"El resultado de la division (int) es : {dividendo}") # DIVISION AGREGANDO INT PARA DAR UN NUMERO ENTERO

modulo = operandoA % operandoB
print(f"El resultado de la division o residuo (modulo) es : {modulo}") # DIVISION O RESIDUO

exponente = operandoA ** operandoB
print(f"El resultado de la exponente es : {exponente}") # EXPONENTE
"""
miVariable3 = 10
print(miVariable3)

# Operadores de reasignacion
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

# miVariable3 = miVariable3 - 2
miVariable3 -= 2
print(miVariable3)

# miVariable3 = miVariable3 * 3
miVariable3 = miVariable3 * 3
print(miVariable3)

# miVariable3 = miVariable3 / 2
miVariable3 = miVariable3 / 2
print(miVariable3)

# Operadores de Comparacion

d = 4
b = 2
resultado = d == b # Comprobamos si son iguales
print(resultado)

# Operador diferente
resultado = d != b
print(resultado)

# Operador mayor que
resultado = d > b
print(resultado)

# Operador es menor que
resultado = d < b
print(resultado)

# Operador menor o igual que
resultado = d <= b
print(resultado)

# Operador es mayor o igual que
resultado = d >= b
print(resultado)