package za.co.bookstore.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.co.bookstore.entity.Author;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-24T11:09:39")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, String> year;
    public static volatile SingularAttribute<Book, Double> price;
    public static volatile ListAttribute<Book, Author> authorList;
    public static volatile SingularAttribute<Book, Integer> id;
    public static volatile SingularAttribute<Book, String> category;
    public static volatile SingularAttribute<Book, String> title;

}