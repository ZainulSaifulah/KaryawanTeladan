package com.user.karyawanteladan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class KaryawanTeladan implements OlahKaryawan, Filter{
	private ArrayList<Karyawan> karyawan = new ArrayList<Karyawan>();
	private int totalKehadiran = 120;
	
	public KaryawanTeladan() {
		karyawan.add(new Karyawan(1, "Asep", "Keuangan", 110, 4));
		karyawan.add(new Karyawan(2, "Atep", "Keuangan", 80, 3));
		karyawan.add(new Karyawan(3, "Anita", "Keuangan", 110, 3));
		karyawan.add(new Karyawan(4, "Dani", "IT", 108, 4));
		karyawan.add(new Karyawan(5, "Andi", "IT", 103, 4));
		karyawan.add(new Karyawan(6, "Anton", "Marketing", 105, 4));
		karyawan.add(new Karyawan(7, "Saputra", "Marketing", 107, 4));
		karyawan.add(new Karyawan(8, "Reza", "Marketing", 109, 2));
		karyawan.add(new Karyawan(9, "Roby", "IT", 90, 3));
		karyawan.add(new Karyawan(10, "Linda", "Keuangan", 105, 4));
		karyawan.add(new Karyawan(11, "Kristin", "IT", 120, 4));
		karyawan.add(new Karyawan(12, "Joko", "keuangan", 100, 4));
		karyawan.add(new Karyawan(13, "Sari", "IT", 110, 3));
		karyawan.add(new Karyawan(14, "Raka", "IT", 116, 4));
		karyawan.add(new Karyawan(15, "Clara", "Marketing", 114, 2));
	}
	
	public void hitungPresentaseKehadiran() {
		for(int i = 0; i < karyawan.size(); i++) {
			karyawan.get(i).setPresentaseKehadiran((((double) karyawan.get(i).getKehadiran()) 
					/ ((double) totalKehadiran)) * (double) 100);
		}
	}
	public void karyawanTeladan() {
		System.out.println("Kode\tNama\t\tDivisi\t\tKehadiran\tKinerja");
		for (int i = 0; i < karyawan.size(); i++) {
			if (karyawan.get(i).getPresentaseKehadiran() == 100 && karyawan.get(i).getKinerja() == 4) {
				System.out.println(karyawan.get(i));
			}
		}
	}
	public void sortKehadiran() {
		Collections.sort(karyawan, new Comparator<Karyawan>() {
		    @Override
		    public int compare(Karyawan o1, Karyawan o2) {
		        return  o2.getKehadiran() - o1.getKehadiran();
		    }
		});
		showAllDivisi();
	}
	public void sortKinerja() {
		Collections.sort(karyawan, new Comparator<Karyawan>() {
		    @Override
		    public int compare(Karyawan o1, Karyawan o2) {
		        return  o2.getKinerja() - o1.getKinerja();
		    }
		});
		showAllDivisi();
	}
	public void sortArrayList() {
		Collections.sort(karyawan, new Comparator<Karyawan>() {
		    @Override
		    public int compare(Karyawan o1, Karyawan o2) {
		        return  o1.getKodeKaryawan() - (o2.getKodeKaryawan());
		    }
		});
	}
	@Override
	public void tambahKaryawan(Karyawan karyawan) {
		this.karyawan.add(karyawan);	
	}
	@Override
	public void hapusKaryawan(int kodeKaryawan) {
		boolean flag = false;
		for (int i = 0; i < karyawan.size(); i++) {
			if (karyawan.get(i).getKodeKaryawan() == kodeKaryawan) {
				flag = true;
				karyawan.remove(i);
			}
		}
		if (flag == false) {
			System.out.println("Maaf input anda salah");
		}
		
	}
	@Override
	public void showDivisi(String divisi) {
		hitungPresentaseKehadiran();
		boolean flag = false;
		for(int i=0; i < karyawan.size(); i++) {
			if (karyawan.get(i).getDivisi().equalsIgnoreCase(divisi)) {
				flag = true;
			}
		}
		
		if (flag == true) {
			System.out.println("Kode\tNama\t\tDivisi\t\tKehadiran\tKinerja");
			for (int i = 0; i < karyawan.size(); i++) {
				if (karyawan.get(i).getDivisi().equalsIgnoreCase(divisi)) {
					System.out.println(karyawan.get(i));
				}
			}
		}else {
			System.out.println("Maaf input anda salah !!");
		}
		
		
	}
	@Override
	public void showAllDivisi() {
		hitungPresentaseKehadiran();
		System.out.println("Kode\tNama\t\tDivisi\t\tKehadiran\tKinerja");
		for (int i = 0; i < karyawan.size(); i++) {
			System.out.println(karyawan.get(i));
		}
		
	}
	public boolean cekUnique(int kodeKaryawan) {
		
		for (int i = 0; i < karyawan.size(); i++) {
			if (karyawan.get(i).getKodeKaryawan() == kodeKaryawan) {
				return false;
			}
		}return true;
	}
	public boolean cekKehadiran(int kehadiran) {
		if(kehadiran > 120 || kehadiran < 0) {
			return false;
		}
		return true;
	}
	public boolean cekKinerja(int kinerja) {
		if(kinerja > 4 || kinerja == 0) {
			return false;
		}
		return true;
	}
}
