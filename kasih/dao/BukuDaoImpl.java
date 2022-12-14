/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasih.dao;
import kasih.dao.*;
import kasih.dao.BukuDao;
import kasih.model.Buku;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class BukuDaoImpl implements BukuDao {
     List<Buku> data = new ArrayList<>();

    public BukuDaoImpl() {
        data.add(new Buku("A102", "Laskar Pelangi","Andre Hinata","Yogyakarta : Bentang, 2005"));
        data.add(new Buku("A202", "History Of Madura","Drs.H.Muhammad Syamsudin","Madura"));
        data.add(new Buku("B402", "Kepada Cahaya Yang Kau Sebut Terang","Adeani Suryani","Bogor"));
    }
     
    @Override
    
    public Buku save(Buku buku){
        data.add(buku);
        return buku;
    }
    
    public Buku update(int index,Buku buku){
        data.set(index , buku);
        return buku;
    }
    
    public void delete(int index){
        data.remove(index);
    }
    public Buku getBuku(int index){
        return data.get(index);
    }
    public List<Buku>getAll(){
        return data;
    }
}
