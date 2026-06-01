# Pedir un mes
mes = int(input("Ingrese un mes ddel año (1-12): "))
# Armamos para que sea valido o no el ingreso del mes.
if mes < 1 or mes > 12:
    print("Mes invalido. Debe ingresar un numero entre 1 y 12.")
else:
    # Estaciones del año
    if mes == 12 or mes == 1 or mes == 2:
        estacion = "Verano"
    elif mes >= 3 and mes <= 5:
        estacion = "Otoño"
    elif mes >= 6 and mes <= 8:
        estacion = "Invierno"
    else:
        estacion = "Primavera"

if estacion != None:
    print(f"La estacion del año es: {estacion}")