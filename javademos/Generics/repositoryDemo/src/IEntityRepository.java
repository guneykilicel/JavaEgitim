public interface IEntityRepository<T extends IEntity> {

    void add(T entity); //entity: genellikle veri tabanı nesnesi anlamına gelir.
    void delete(T entity);
    void update(T entity);

}
