class Mahasiswa extends User{
    void denda(){
        System.out.println("Denda berhasil");
    }
}

class Pegawai extends User{

}

class User {
    void login(){
        System.out.println("Login berhasil");
    }
    
        public static void main(String args[]){
        User a = new Mahasiswa();
        User b = new Pegawai();
        Mahasiswa m = (Mahasiswa)a;
        m.denda();

        if(a instanceof Mahasiswa){

        }

        if(b instanceof Pegawai){

        }
    }
}

