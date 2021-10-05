nama = str(input("Masukan nama lengkap Anda = "))
ipk = str(input("Masukan IPk Anda = "))
studi = str(input("Masukan lama masa studi Anda = "))

if(float(ipk) >= 3.51 and float(ipk) <= 4 and float(studi) <= 4):
    print(nama + " Anda lulus dengan Pujian Tertinggi (Summa Cumlaude) dengan IPK " + ipk + " dengan masa studi " + studi + " tahun ")
elif(float(ipk) >= 3.51):
    print(nama + "Anda lulus dengan Pujian (Cumlaude) dengan IPK " + ipk)
elif(float(ipk) >= 3.01 and float(ipk) < 3.51):
    print(nama + "Anda lulus Sangat Memuaskan dengan IPK " + ipk)
elif(float(ipk) >= 2.76 and float(ipk) < 3.01):
     print(nama + "Anda lulus Memuaskan dengan IPK " + ipk)
elif(float(ipk) >= 2.00 and float(ipk) < 2.76):
     print(nama + "Anda lulus Cukup Memuaskan dengan IPK " + ipk)
elif(float(ipk) < 2.00):
    print(" Maaf " + nama + "Anda tidak dengan IPK " + ipk)
elif(float(ipk) > 4.00 and float(ipk) < 0.00):
    print("IPK yang Anda input tidak valid ")
