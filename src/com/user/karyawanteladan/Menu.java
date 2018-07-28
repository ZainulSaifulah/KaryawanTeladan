package com.user.karyawanteladan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu extends KaryawanTeladan {
		private Karyawan k1 = new Karyawan();
		private int pilihan;
		private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		public Menu() {
			
		}
		public void menu() {
			while (true) {
				try {
					System.out.println("====================Program Karyawan Teladan====================");
					System.out.println("1.Tampil semua karyawan");
					System.out.println("2.Tampil divisi");
					System.out.println("3.Sort Kinerja");
					System.out.println("4.Sort Kehadiran");
					System.out.println("5.Karyawan Teladan");
					System.out.println("6.Tambah Karyawan");
					System.out.println("7.Hapus karyawan");
					System.out.println("8.Keluar");
					System.out.println("------------------------------");
					System.out.print("Pilihan: ");
					pilihan = Integer.parseInt(input.readLine());
					
					switch (pilihan) {
					case 1:
						sortArrayList();
						showAllDivisi();
						break;
					case 2:
						System.out.print("Divisi yang ditampilkan: ");
						showDivisi(input.readLine());
						break;
					case 3:
						sortKinerja();
						break;
					case 4:
						sortKehadiran();
						break;
					case 5:
						karyawanTeladan();
						break;
					case 6:
						System.out.println("==============Input Data==============");
						System.out.print("Kode Karyawan\t\t: ");
						k1.setKodeKaryawan(Integer.parseInt(input.readLine()));
						if (cekUnique(k1.getKodeKaryawan()) == false) {
							System.out.println("Maaf Kode Karyawan Sudah Terdaftar");
							System.out.println("Karyawan Tidak Ditambahkan");
							break;
						}
						System.out.print("Nama Karyawan\t\t: ");
						k1.setNamaKaryawan(input.readLine());
						System.out.print("Divisi\t\t\t: ");
						k1.setDivisi(input.readLine());
						System.out.print("Kehadiran[max:120]\t: ");
						k1.setKehadiran(Integer.parseInt(input.readLine()));
						if (cekKehadiran(k1.getKehadiran()) == false) {
							System.out.println("Maaf input kehadiran salah");
							System.out.println("Karyawan Tidak Ditambahkan");
							break;
						}
						
						System.out.println("1. Sangat Tidak Memuaskan");
						System.out.println("2. Tidak memuaskan");
						System.out.println("3. Memuaskan");
						System.out.println("4. Sangat Memuaskan");
						System.out.print("Kinerja [1/2/3/4]\t: ");
						k1.setKinerja(Integer.parseInt(input.readLine()));
						if (cekKinerja(k1.getKinerja()) == false) {
							System.out.println("Maaf input kinerja salah");
							System.out.println("Karyawan Tidak Ditambahkan");
							break;
						}
						tambahKaryawan(k1);
						System.out.println("Data Karyawan Disimpan");
						break;
					case 7:
						sortArrayList();
						showAllDivisi();
						System.out.print("Kode Karyawan yang akan dihapus: ");
						hapusKaryawan(Integer.parseInt(input.readLine()));
						break;
					case 8:
						System.exit(0);
						break;
					default:
						System.out.println("Maaf input Anda Salah");
						break;
					}
				} catch (NumberFormatException | IOException e) {
					System.out.println("Maaf input Anda Salah");
					menu();
				} 
			}
		}

}


