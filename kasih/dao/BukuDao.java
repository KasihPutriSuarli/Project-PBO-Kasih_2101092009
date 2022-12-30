/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kasih.dao;
import kasih.dao.*;
import kasih.model.Buku;
import java.util.List;
/**
 *
 * @author user
 */
public interface BukuDao {
    Buku save(Buku buku);
    Buku update(int index,Buku buku);
    void delete (int index); 
    Buku getBuku(int index);
    List<Buku>getAll();
}
