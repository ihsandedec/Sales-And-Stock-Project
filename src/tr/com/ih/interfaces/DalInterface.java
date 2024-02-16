package tr.com.ih.interfaces;

import java.util.List;

public interface DalInterface<T>
{
 //<T> generic interface

 public void Insert (T entitiy); //veritabanindan kayit almak icin
 
 public List<T> GetAll(); //verileri listelemk icin
 
 public T Delete (T entity);  //contract turunde delete
  
 public void Update (T entitiy);
 public List<T> GetById(int id);
 
 
}