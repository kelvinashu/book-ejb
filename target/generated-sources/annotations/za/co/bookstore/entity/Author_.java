package za.co.bookstore.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.co.bookstore.entity.Book;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-24T11:09:39")
@StaticMetamodel(Author.class)
public class Author_ { 

    public static volatile SingularAttribute<Author, String> name;
    public static volatile SingularAttribute<Author, Integer> id;
    public static volatile SingularAttribute<Author, Book> bookId;

}