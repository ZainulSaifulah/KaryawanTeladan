package com.user.karyawanteladan;

import java.text.DecimalFormat;

public class Karyawan {
	private String namaKaryawan, divisi;
	private int kehadiran, kinerja, kodeKaryawan;
	private double presentaseKehadiran;
	
	public Karyawan(){
		
	}
	public Karyawan(int kodeKaryawan, String namaKaryawan, String divisi,
			int kehadiran, int kinerja){
		this.kodeKaryawan = kodeKaryawan;
		this.namaKaryawan = namaKaryawan;
		this.divisi = divisi;
		this.kehadiran = kehadiran;
		this.kinerja = kinerja;
	}
	
	public double getPresentaseKehadiran() {
		return presentaseKehadiran;
	}
	public void setPresentaseKehadiran(double presentaseKehadiran) {
		this.presentaseKehadiran = presentaseKehadiran;
	}
	public String getNamaKaryawan() {
		return namaKaryawan;
	}
	public void setNamaKaryawan(String namaKaryawan) {
		this.namaKaryawan = namaKaryawan;
	}
	public int getKodeKaryawan() {
		return kodeKaryawan;
	}
	public void setKodeKaryawan(int kodeKaryawan) {
		this.kodeKaryawan = kodeKaryawan;
	}
	public String getDivisi() {
		return divisi;
	}
	public void setDivisi(String divisi) {
		this.divisi = divisi;
	}
	public int getKehadiran() {
		return kehadiran;
	}
	public void setKehadiran(int kehadiran) {
		this.kehadiran = kehadiran;
	}
	public int getKinerja() {
		return kinerja;
	}
	public void setKinerja(int kinerja) {
		this.kinerja = kinerja;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return (kodeKaryawan + "\t" + namaKaryawan + "\t\t" + 
				 divisi + "      " + "\t" + df.format(presentaseKehadiran) + "%" + "\t\t" +kinerja);
		
	}
}
