class Akademik extends Maba {
    void inputreg(){
		System.out.print ("Nama Lengkap: ");
		nama = scan.nextLine();
		System.out.print ("Email: ");
		email = scan.nextLine();
		System.out.print ("Alamat : ");
		alamat = scan.nextLine();
		System.out.print ("No. HP : ");
		telp = scan.nextLine();
		System.out.print ("Jurusan : ");
		jurusan = scan.nextLine();
	}

    void tampil(){
        System.out.println ("Nama  \t: " + nama);
        System.out.println ("Email \t: " + email);
        System.out.println ("Alamat \t: " + alamat);
        System.out.println ("No. HP \t: " + telp);
        System.out.println ("Jurusan \t: " + jurusan);
	}
}