# entityReference
Attempt at JPA entites for reference.

Each @column annotation should represent a field in the table

Each of @ManyToMany, @ManyToOne, and @OneToMany should represent lines connecting the tables in the schema and should list the OBJECT or list of objects they connect to. (Helps to print out the schema and look at it as you go)

The "pure" join tables (book_authors, and book_genres) don't have explicit objects and are mapped from the Book entity with special reference to the table name for that mapping. The Genre and Author entity references this mapping.

the other join table with values (book_copies, book_loans) have their own implentation becuase they contain their own columns. For these (I think) we need to create a special class to define the composite key using the @embbeded but haven't gotten to that yet.

Hopefully this will help but please let me know if I made mistakes becuase I haven't tested these yet. It's just an outline for now.
