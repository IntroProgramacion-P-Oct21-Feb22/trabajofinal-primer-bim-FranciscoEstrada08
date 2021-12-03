limiteDatos=float(input("Ingrese cuantos datos desea ingresar"))
datos=float(input("Ingrese un número"))
bandera = True
suma=0

while(bandera):
    while(datos==limiteDatos):
        suma=suma+datos;
    print("La suma de los datos es: %.2f",suma)